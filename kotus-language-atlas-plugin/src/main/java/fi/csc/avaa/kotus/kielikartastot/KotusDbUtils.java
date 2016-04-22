package fi.csc.avaa.kotus.kielikartastot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto;
import fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio;
import fi.csc.avaa.kotus.kielikartastot.db.model.custom.IlmioPaikka;
import fi.csc.avaa.kotus.kielikartastot.db.model.custom.MinimalIlmio;
import fi.csc.avaa.kotus.kielikartastot.db.model.custom.MinimalRyhma;
import fi.csc.avaa.kotus.kielikartastot.db.model.custom.PaikkaCoordinate;
import fi.csc.avaa.kotus.kielikartastot.db.model.custom.RelatedRyhmas;
import fi.csc.avaa.kotus.kielikartastot.db.service.AineistoLocalServiceUtil;
import fi.csc.avaa.kotus.kielikartastot.db.service.IlmioLocalServiceUtil;
import fi.csc.avaa.kotus.kielikartastot.db.service.PaikkaLocalServiceUtil;
import fi.csc.avaa.kotus.kielikartastot.db.service.RyhmaLocalServiceUtil;
import fi.csc.avaa.kotus.kielikartastot.tree.IlmioRyhmaIPCBean;

/**
 * Utility/service class for data and operations related to Kotus database.
 * Uses classes created by Liferay service builder
 * 
 * @author jmlehtin
 *
 */
public final class KotusDbUtils {

	private static final Log LOG = LogFactoryUtil.getLog(KotusDbUtils.class);
	// Mapping between aineisto IDs and aineisto names
	protected static Map<Integer, String> aineistoIdNameMapping = new HashMap<>();
	private static List<Integer> leafRyhmaIds = new ArrayList<>();
	
	private KotusDbUtils() {
	}
	
	
	/**
	 * Set mapping for aineisto IDs and aineisto names
	 * 
	 * @param aineistos
	 */
	public static void setAineistoIdNameMap(List<Aineisto> aineistos) {
		aineistoIdNameMapping.clear();
		aineistos.stream().forEach(a -> aineistoIdNameMapping.put(a.getAineisto_id(), a.getNimi()));
	}

	/**
	 * Get aineisto ID by using given aineisto name
	 * 
	 * @param aineistoName
	 * @return
	 */
	public static Integer getAineistoIdFromAineistoName(String aineistoName) {
		for(Map.Entry<Integer, String> aineistoItem : aineistoIdNameMapping.entrySet()) {
			if(aineistoItem.getValue().equals(aineistoName)) {
				return aineistoItem.getKey();
			}
		}
		return -1;
	}
	
	/**
	 * Get aineisto name by using given aineisto ID
	 * 
	 * @param aineistoId
	 * @return
	 */
	public static String getAineistoNameFromAineistoId(int aineistoId) {
		for(Map.Entry<Integer, String> aineistoItem : aineistoIdNameMapping.entrySet()) {
			if(aineistoItem.getKey() == aineistoId) {
				return aineistoItem.getValue();
			}
		}
		LOG.warn("Aineisto ID not found from map: "+ aineistoId);
		return KartastoConst.EMPTY_STRING;
	}
	
	/**
	 * Get all aineisto names there is in the database
	 * 
	 * @return
	 */
	public static List<String> getAllAineistoNames() {
		return new ArrayList<String>(aineistoIdNameMapping.values());
	}
	
	/**
	 * API method for fetching paikkatieto related to ilmioId output in GeoJSON format
	 * 
	 * @param queryIlmioId
	 * @return GeoJSON object as String
	 */
	public static String getIlmioPaikkaTieto(int queryIlmioId) {
		if(queryIlmioId > 0) {
			Ilmio ilmio = null;
			Aineisto aineisto = null;
			try {
				ilmio = IlmioLocalServiceUtil.getIlmio(queryIlmioId);
				aineisto = AineistoLocalServiceUtil.getAineisto(ilmio.getAineisto_id());
			} catch (PortalException | SystemException e1) {
				e1.printStackTrace();
			}
			RelatedRyhmas ilmioRyhmas = (new IlmioRyhmaIPCBean(ilmio.getIlmio_id())).getRelatedRyhmas();
			List<PaikkaCoordinate> paikkaCoordinates = getPaikkasByIlmioId(queryIlmioId);
		    
			try {
		    	JSONObject featureCollection = JSONFactoryUtil.createJSONObject();
		    	
		        JSONObject crs = JSONFactoryUtil.createJSONObject();
		        JSONObject crsProperties = JSONFactoryUtil.createJSONObject();
		        crsProperties.put("name", "EPSG:3067");
		        crs.put("type", "name");
		        crs.put("properties", crsProperties);
		        
		        JSONArray featureList = JSONFactoryUtil.createJSONArray();
		        // iterate through your list
		        for (PaikkaCoordinate obj : paikkaCoordinates) {
		            JSONObject feature = JSONFactoryUtil.createJSONObject();
		            JSONObject featureProperties = JSONFactoryUtil.createJSONObject();
		            featureProperties.put("paikkaNimi", obj.getNimi_fin());
		            featureProperties.put("paikkaTyyppi", obj.getTyyppi());
		            
		            featureProperties.put("ilmioId", ilmio.getIlmio_id());
		            featureProperties.put("ilmioNimi", ilmio.getIlmio());
		            featureProperties.put("ilmioTyyppi", ilmio.getTyyppi());
		            featureProperties.put("ilmioKuvaus", ilmio.getKuvaus());
			        featureProperties.put("ryhmaId", ilmioRyhmas.getRyhmaId());
			        featureProperties.put("ryhmaNimi", ilmioRyhmas.getRyhmaNimi());
			        
			        if(ilmioRyhmas.hasYlaRyhma()) {
			        	featureProperties.put("ylaRyhmaId", ilmioRyhmas.getYlaryhmaId());
			        	featureProperties.put("ylaRyhmaNimi", ilmioRyhmas.getYlaryhmaNimi());
			        }
			        if(ilmioRyhmas.hasYlaYlaRyhma()) {
			        	featureProperties.put("ylaYlaRyhmaId", ilmioRyhmas.getYlaylaryhmaId());
			        	featureProperties.put("ylaYlaRyhmaNimi", ilmioRyhmas.getYlaylaryhmaNimi());
			        }
			        
			        featureProperties.put("aineistoId", aineisto.getAineisto_id());
			        featureProperties.put("aineistoNimi", aineisto.getNimi());
		            
		            JSONObject geometry = JSONFactoryUtil.createJSONObject();
		            geometry.put("type", "Point");
		            JSONArray coord = JSONFactoryUtil.createJSONArray("["+ obj.getX()+","+obj.getY()+"]");
		            geometry.put("coordinates", coord);
		            feature.put("type", "Feature");
		            feature.put("id", obj.getPaikka_id());
		            feature.put("geometry", geometry);
		            feature.put("properties", featureProperties);
		            featureList.put(feature);
		        }
		        
		        featureCollection.put("type", "FeatureCollection");
		        featureCollection.put("crs", crs);
		        featureCollection.put("features", featureList);
		        return featureCollection.toString(3);
		    } catch (JSONException e) {
		        LOG.error("Unable to create paikkatieto json object: "+e.toString());
		    }
		}
	    return KartastoConst.EMPTY_STRING;
	}
	
	/**
	 * API method for fetching paikkatieto related to queryRyhmaId output in GeoJSON format.
	 * 
	 * @param queryRyhmaId
	 * @return array of GeoJSON objects as String
	 */
	public static String getRyhmaPaikkaTieto(int queryRyhmaId) {
		if(queryRyhmaId > 0) {
			// Get all Ilmios under this ryhmaId (given ryhmaId might not be directly referred from Ilmio)
			List<Integer> ilmioDirectlyRelatedRyhmaIds = getAllLeafRyhmasUnderRyhmaId(queryRyhmaId);
			try {
				JSONArray rootArray = JSONFactoryUtil.createJSONArray();
				Map<Integer,List<IlmioPaikka>> ilmioPaikkasGrouped = IlmioPaikka.getIlmioPaikkasGroupedByIlmioId(getIlmiosAndPaikkasByRyhmaId(ilmioDirectlyRelatedRyhmaIds));
				for(Map.Entry<Integer, List<IlmioPaikka>> ilmioPaikkas : ilmioPaikkasGrouped.entrySet()) {
					List<IlmioPaikka> paikkas = ilmioPaikkas.getValue();
					JSONObject featureCollection = JSONFactoryUtil.createJSONObject();
			        JSONObject crs = JSONFactoryUtil.createJSONObject();
			        JSONObject crsProperties = JSONFactoryUtil.createJSONObject();
			       
			        crsProperties.put("name", "EPSG:3067");
			        crs.put("type", "name");
			        crs.put("properties", crsProperties);
			        
			        Aineisto aineisto = null;
			        try {
						aineisto = AineistoLocalServiceUtil.getAineisto(IlmioLocalServiceUtil.getIlmio(ilmioPaikkas.getKey()).getAineisto_id());
					} catch (PortalException | SystemException e1) {
						e1.printStackTrace();
					}
			        RelatedRyhmas ilmioRyhmas = (new IlmioRyhmaIPCBean(ilmioPaikkas.getKey())).getRelatedRyhmas();
			        
			        JSONArray featureList = JSONFactoryUtil.createJSONArray();
			        // iterate through your list
			        for (IlmioPaikka obj : paikkas) {
			        	JSONObject feature = JSONFactoryUtil.createJSONObject();
			        	
			        	JSONObject featureProperties = JSONFactoryUtil.createJSONObject();
			        	featureProperties.put("paikkaNimi", obj.getPaikkaNimi_fin());
			            featureProperties.put("paikkaTyyppi", obj.getPaikkaTyyppi());
			            
			            featureProperties.put("ilmioId", obj.getIlmio_id());
			            featureProperties.put("ilmioNimi", obj.getIlmioIlmio());
			            featureProperties.put("ilmioTyyppi", obj.getIlmioTyyppi());
			            featureProperties.put("ilmioKuvaus", obj.getIlmioKuvaus());
		        		featureProperties.put("ryhmaId", ilmioRyhmas.getRyhmaId());
		        		featureProperties.put("ryhmaNimi", ilmioRyhmas.getRyhmaNimi());
				       
		        		if(ilmioRyhmas.hasYlaRyhma()) {
				        	featureProperties.put("ylaRyhmaId", ilmioRyhmas.getYlaryhmaId());
				        	featureProperties.put("ylaRyhmaNimi", ilmioRyhmas.getYlaryhmaNimi());
				        }
				        if(ilmioRyhmas.hasYlaYlaRyhma()) {
				        	featureProperties.put("ylaYlaRyhmaId", ilmioRyhmas.getYlaylaryhmaId());
				        	featureProperties.put("ylaYlaRyhmaNimi", ilmioRyhmas.getYlaylaryhmaNimi());
				        }
						
						featureProperties.put("aineistoId", aineisto.getAineisto_id());
						featureProperties.put("aineistoNimi", aineisto.getNimi());
			            
			            JSONObject geometry = JSONFactoryUtil.createJSONObject();
			            geometry.put("type", "Point");
			            JSONArray coord = JSONFactoryUtil.createJSONArray("["+ obj.getPaikkaX()+","+obj.getPaikkaY()+"]");
			            geometry.put("coordinates", coord);
			            feature.put("type", "Feature");
			            feature.put("id", obj.getPaikka_id());
			            feature.put("geometry", geometry);
			            feature.put("properties", featureProperties);
			            featureList.put(feature);
			        }
			        
			        featureCollection.put("type", "FeatureCollection");
			        featureCollection.put("crs", crs);
			        featureCollection.put("features", featureList);
			        rootArray.put(featureCollection);
				}
				return rootArray.toString(3);
			} catch (JSONException e) {
				LOG.error("Unable to create array of paikkatieto json objects: "+e.toString());
			}
		}
		 return KartastoConst.EMPTY_STRING;
	}
	
	/**
	 * Get all ryhmaIds that are directly referred to from Ilmio objects and that are under the given ryhmaId.
	 * 
	 * @param ryhmaId
	 * @return
	 */
	private static List<Integer> getAllLeafRyhmasUnderRyhmaId(int ryhmaId) {
		leafRyhmaIds.clear();
		updateLeafRyhmdIds(ryhmaId);
		return leafRyhmaIds;
	}
	
	private static void updateLeafRyhmdIds(int ryhmaId) {
		List<MinimalRyhma> childRyhmas = getRyhmasEnclosedByRyhma(Arrays.asList(ryhmaId));
		if(childRyhmas.isEmpty()) {
			leafRyhmaIds.add(ryhmaId);
		}
		for(MinimalRyhma childRyhma : childRyhmas) {
			updateLeafRyhmdIds(childRyhma.getRyhma_id());
		}
	}
	
	public static List<MinimalIlmio> getAllLeafIlmiosUnderRyhmaId(int ryhmaId) {
		List<Integer> leafRyhmaIds = getAllLeafRyhmasUnderRyhmaId(ryhmaId);
		return getIlmiosByRyhmaId(leafRyhmaIds);
	}
	
	/**
	 * Fetch all columns from aineisto table according to start and end index.
	 * -1 index for start and end index means fetch all rows
	 * 
	 * @param startIdx
	 * @param endIdx
	 * @return
	 */
	public static List<Aineisto> getAineistot(int startIdx, int endIdx) {
		List<Aineisto> aineistot = null;
		try {
			aineistot = AineistoLocalServiceUtil.getAineistos(startIdx, endIdx);
		} catch (SystemException e) {
			LOG.error("Unable to fetch data from aineisto database table");
			e.printStackTrace();
		}
		
		return filterAineistot(aineistot);
	}
	
	private static List<Aineisto> filterAineistot(List<Aineisto> aineistot) {
		return aineistot.stream().filter(a -> a.getAineisto_id() != 4 && a.getAineisto_id() != 5).collect(Collectors.toList());
	}


	/**
	 * Perform query that is in src/main/resources/custom-sql/default.xml
	 * with id="fi.csc.avaa.kotus.kielikartastot.db.service.persistence.IlmioFinder.findByAineistoIlmioTyyppiKuvausPaikka"
	 * Fetches ilmio rows matching the query with the given inputs
	 * 
	 * @param aineistoIdVal
	 * @param ilmioVal
	 * @param tyyppiVal
	 * @param kuvausVal
	 * @param paikkaVal
	 * @return
	 */
	public static List<Ilmio> getIlmios(int aineistoIdVal, String ilmioVal, String tyyppiVal, String kuvausVal, String paikkaVal) {
		try {
			return IlmioLocalServiceUtil.findByAineistoIlmioTyyppiKuvausPaikka(aineistoIdVal, ilmioVal, tyyppiVal, kuvausVal, paikkaVal);
		} catch (SystemException e) {
			LOG.error("Unable to fetch data from database to get search query results");
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Perform query that is in src/main/resources/custom-sql/default.xml
	 * with id="fi.csc.avaa.kotus.kielikartastot.db.service.persistence.IlmioFinder.findIlmioPaikkaByRyhmaId"
	 * 
	 * @param groupId
	 * @return
	 */
	public static List<IlmioPaikka> getIlmiosAndPaikkasByRyhmaId(List<Integer> groupIdList) {
		try {
			int[] groupIdArray = convertIntegerListToIntArray(groupIdList);
			return getIlmioPaikkas(IlmioLocalServiceUtil.findIlmioPaikkaByRyhmaId(groupIdArray), groupIdArray);
		} catch (SystemException e) {
			LOG.error("Unable to fetch data from database to get ilmios and paikkas query results");
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Perform query that is in src/main/resources/custom-sql/default.xml
	 * with id="fi.csc.avaa.kotus.kielikartastot.db.service.persistence.PaikkaFinder.findByIlmioId"
	 * 
	 * @param ilmioId
	 * @return
	 */
	public static List<PaikkaCoordinate> getPaikkasByIlmioId(int ilmioId) {
		try {
			return getPaikkaCoordinates(PaikkaLocalServiceUtil.findByIlmioId(ilmioId), ilmioId);
		} catch (SystemException e) {
			LOG.error("Unable to fetch data from database to get paikka query results");
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Perform query that is in src/main/resources/custom-sql/default.xml
	 * with id="fi.csc.avaa.kotus.kielikartastot.db.service.persistence.RyhmaFinder.findAllByRyhmaId"
	 * 
	 * @param ryhmaId
	 * @return
	 */
	public static RelatedRyhmas getRelatedRyhmasByRyhmaId(int ryhmaId) {
		try {
			return getRelatedRyhmas(Arrays.asList(RyhmaLocalServiceUtil.findAllByRyhmaId(ryhmaId)), ryhmaId);
		} catch (SystemException e) {
			LOG.error("Unable to fetch data from database to get ryhma query results");
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Perform query that is in src/main/resources/custom-sql/default.xml
	 * with id="fi.csc.avaa.kotus.kielikartastot.db.service.persistence.RyhmaFinder.findByYlaryhma"
	 * 
	 * @param ylaRyhmaId
	 * @return
	 */
	public static List<MinimalRyhma> getRyhmasEnclosedByRyhma(List<Integer> ylaRyhmaIdList) {
		try {
			int[] ylaRyhmaIdArray = convertIntegerListToIntArray(ylaRyhmaIdList);
			return getMinimalRyhmas(RyhmaLocalServiceUtil.findByYlaryhma(ylaRyhmaIdArray), ylaRyhmaIdArray);
		} catch (SystemException e) {
			LOG.error("Unable to fetch data from database to get ryhma query results");
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Perform query that is in src/main/resources/custom-sql/default.xml
	 * with id="fi.csc.avaa.kotus.kielikartastot.db.service.persistence.IlmioFinder.findByRyhmaId"
	 * 
	 * @param ryhmaId
	 * @return
	 */
	public static List<MinimalIlmio> getIlmiosByRyhmaId(List<Integer> ryhmaIdList) {
		try {
			int[] ryhmaIdArray = convertIntegerListToIntArray(ryhmaIdList);
			return getMinimalIlmios(IlmioLocalServiceUtil.findByRyhmaId(ryhmaIdArray), ryhmaIdArray);
		} catch (SystemException e) {
			LOG.error("Unable to fetch data from database to get ryhma query results");
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * Puts the results of the database query of the method getRyhmasEnclosedByRyhma into a Java object.
	 * 
	 * @param sqlObjects
	 * @param originalId
	 * @return
	 */
	private static List<MinimalRyhma> getMinimalRyhmas(List<Object> sqlObjects,
			int[] originalIds) {
		List<JSONArray> dataAsJSON = getAsJSONArray(sqlObjects);
		return MinimalRyhma.getMinimalRyhmas(dataAsJSON, originalIds);
	}
	
	/**
	 * Puts the results of the database query of the method getIlmiosByRyhmaId into a Java object.
	 * 
	 * @param sqlObject
	 * @param originalId
	 * @return
	 */
	private static List<MinimalIlmio> getMinimalIlmios(List<Object> sqlObjects, int[] originalIds) {
		List<JSONArray> dataAsJSON = getAsJSONArray(sqlObjects);
		return MinimalIlmio.getMinimalIlmios(dataAsJSON, originalIds);
	}

	/**
	 * Puts the results of the database query of the method getIlmiosAndPaikkasByRyhmaId into a Java object.
	 * 
	 * @param sqlObjects
	 * @param originalId
	 * @return
	 */
	private static List<IlmioPaikka> getIlmioPaikkas(List<Object> sqlObjects, int[] originalIds) {
		List<JSONArray> dataAsJSON = getAsJSONArray(sqlObjects);
		return IlmioPaikka.getIlmioPaikkas(dataAsJSON, originalIds);
	}
	
	/**
	 * Puts the results of the database query of the method getRelatedPaikkasByRyhmaId into a Java object.
	 * 
	 * @param sqlObject
	 * @param originalId
	 * @return
	 */
	private static RelatedRyhmas getRelatedRyhmas(List<Object> sqlObjects, int originalId) {
		JSONArray dataAsJSON = getAsJSONArray(sqlObjects).get(0);
		return RelatedRyhmas.getRelatedRyhmas(dataAsJSON, originalId);
	}
	
	/**
	 * Puts the results of the database query of the method getPaikkasByIlmioId into a Java object.
	 * 
	 * @param sqlObject
	 * @param originalId
	 * @return
	 */
	private static List<PaikkaCoordinate> getPaikkaCoordinates(List<Object> sqlObjects, int originalId) {
		List<JSONArray> dataAsJSON = getAsJSONArray(sqlObjects);
		return PaikkaCoordinate.getPaikkaCoordinates(dataAsJSON, originalId);
	}

	/**
	 * Helper method for getting a list of paikka names as strings by using the results of the method getPaikkasByIlmioId
	 * 
	 * @param ilmioId
	 * @return
	 */
	public static List<String> getRelatedPaikkaNamesByIlmioId(int ilmioId) {
		return getPaikkasByIlmioId(ilmioId).stream().map(p -> p.getNimi_fin()).collect(Collectors.toList());
	}
	
	/**
	 * Utility method for getting list of JSONArray from an Object list containing SQL fetched objects
	 * 
	 * @param sqlObjects
	 * @return
	 */
	private static List<JSONArray> getAsJSONArray(List<Object> sqlObjects) {
		List<JSONArray> retArray = new ArrayList<>();
		if(sqlObjects != null) {
			for(Object obj : sqlObjects) {
				String serializeString = JSONFactoryUtil.serialize(obj);
				try {
					retArray.add(JSONFactoryUtil.createJSONArray(serializeString));
				} catch (JSONException e) {
					LOG.error("Unable to convert objects to JSON");
				}
			}
		}
		return retArray;
	}
	
	public static int[] convertIntegerListToIntArray(List<Integer> integers) {
		int[] ret = new int[integers.size()];
	    Iterator<Integer> iterator = integers.iterator();
    	for (int i = 0; i < ret.length; i++) {
    		ret[i] = iterator.next().intValue();
    	}
    	return ret;
	}
}
