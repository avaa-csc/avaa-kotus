package fi.csc.avaa.kotus.kielikartastot;

/**
 * @author jmlehtin
 *
 */
public class KartastoConst {
	
	public static final String SHOW_INFO = "Näytä ohje";
	public static final String HIDE_INFO = "Piilota ohje";
	public static final String TAB_NAME_HOME = "Etusivu";
	public static final String TAB_NAME_SEARCH = "Hae ilmiöitä";
	public static final String TAB_NAME_RESULTS = "Hakutulokset";
	public static final String TAB_NAME_TREE_MAP = "Jäsennys ja kartta";
	public static final String TAB_NAME_HELP = "Tietoja";
	public static final String FORM_LABEL_AINEISTO = "Aineisto";
	public static final String FORM_LABEL_ILMIO = "Ilmiö";
	public static final String FORM_LABEL_TYYPPI = "Tyyppi";
	public static final String FORM_LABEL_KUVAUS = "Kuvaus";
	public static final String FORM_LABEL_PAIKKA = "Paikka";
	public static final String FORM_SUBMIT_LABEL = "Hae";
	public static final String FORM_HEADER = "<h3>Hakulomake</h3>";
	public static final String TABLE_HEADER_ILMIO_ID = "ID";
	public static final String TABLE_HEADER_ILMIO = "Ilmiö";
	public static final String TABLE_HEADER_TYYPPI = "Tyyppi";
	public static final String TABLE_HEADER_KUVAUS = "Kuvaus";
	public static final String TABLE_HEADER_AINEISTO = "Aineisto";
	public static final String TABLE_CAPTION = "Search results";
	public static final String TABLE_HEADER_COUNT = "#";
	public static final String TABLE_FILTER_TEXT = "Rajaa tuloksia";
	public static final int TABLE_FILTER_SEARCH_TIMEOUT = 500;
	public static final String INFO_ILMIO_LOCATION_HEADER = "Sijainnit";
	public static final String INFO_ILMIO_LABEL_ILMIO_ID = "Ilmiö ID";
	public static final String INFO_ILMIO_LABEL_ILMIO = "Ilmiö";
	public static final String INFO_ILMIO_LABEL_TYYPPI = "Tyyppi";
	public static final String INFO_ILMIO_LABEL_KUVAUS = "Kuvaus";
	public static final String INFO_ILMIO_LABEL_AINEISTO = "Aineisto";
	public static final String INFO_ILMIO_LABEL_KUULUU_RYHMIIN = "Kuuluu ryhmiin";
	public static final String INFO_ILMIO_LINK_DOWNLOAD_ILMIO_DATA = "Lataa ilmiön paikkatiedot tiedostona: ";
	public static final String MURRE_TREE_CAPTION = "Ryhmät / Ilmiöt";
	public static final String MURRE_TREE_PROPERTY_ICON = "icon";
	public static final String MURRE_TREE_PROPERTY_RYHMA_ID = "ryhmaId";
	public static final String MURRE_TREE_PROPERTY_ILMIO_ID = "ilmioId";
	public static final String MURRE_TREE_PROPERTY_CAPTION = "caption";
	public static final String MURRE_TREE_PROPERTY_ITEM_DEPTH = "depth";
	public static final String INFO_RYHMA_LABEL_RYHMA_NIMI = "Ryhmä";
	public static final String INFO_RYHMA_LABEL_RYHMA_TYYPPI = "Tyyppi";
	public static final String INFO_RYHMA_LABEL_RYHMA_KARTTA_LINKKI = "Karttalinkki";
	public static final String INFO_RYHMA_LABEL_RYHMA_AINEISTO = "Aineisto";
	public static final String INFO_RYHMA_LINK_DOWNLOAD_RYHMA_DATA = "Lataa ryhmän paikkatiedot tiedostona: ";
	public static final String IPC_EVENT_ILMIO_SELECTED_UPDATE_MAP = "updateMapIlmio";
	public static final String IPC_EVENT_RYHMA_SELECTED_UPDATE_MAP = "updateMapRyhma";
	public static final String IPC_EVENT_ILMIO_SELECTED_FROM_RESULTS = "ilmioSelectedResults";
	public static final String IPC_EVENT_ILMIO_SELECTED_FROM_TREE = "ilmioSelectedTree";
	public static final String IPC_EVENT_RYHMA_SELECTED_FROM_TREE = "ryhmaSelected";
	public static final String IPC_EVENT_SEARCH_COMPLETED = "searchCompleted";
	public static final String IPC_EVENT_START_SEARCH = "startSearch";
	public static final String IPC_EVENT_HIDE_MAP = "hideMap";
	public static final String IPC_EVENT_SHOW_MAP = "showMap";
	public static final String NOTIFICATION_SEARCH_MAIN = "Etsitään";
	public static final String NOTIFICATION_RESULT_MAIN = "Ladataan ilmiön tietoja";
	public static final String NOTIFICATION_INFO = "Odota hetki...";
	public static final String EMPTY_STRING = "";
	public static final String INFO_RYHMA_LABEL_ILMIO_COUNT = "Ilmiöiden lukumäärä";
	public static final String INFO_ILMIO_LOCATION_NO_LOCATIONS = "Ei ilmiöön liittyviä paikkoja";
	public static final String NOTIFICATION_CLASSNAMES_SEARCH = "kotus-notification search";
	public static final String NOTIFICATION_CLASSNAMES_RESULT = "kotus-notification result";
	public static final String HIDE_NOTIFICATION_JAVASCRIPT = "var notifications = document.getElementsByClassName('?');"
															+ "if(notifications !== null) {"
																+ "for(var i=0; i < notifications.length; i++) {"
																	+ "notifications[i].style.display = 'none';"
																+ "}"
															+ "}";
	public static final String INFO_ILMIO_LINK_JUMP_TO_MAP = "Siirry karttaan";

	private static final String URL_GEOSERVER_ILMIO_API = "http://avaa.tdata.fi/geoserver/kotus/ows?service=WFS&version=1.0.0&request=GetFeature&typeName=kotus:paikkatieto_view&outputformat=!!!&Filter=<Filter><PropertyIsEqualTo><PropertyName>ilmio_id</PropertyName><Literal>???</Literal></PropertyIsEqualTo></Filter>";
	private static final String URL_GEOSERVER_RYHMA_API = "http://avaa.tdata.fi/geoserver/kotus/ows?service=WFS&version=1.0.0&request=GetFeature&typeName=kotus:paikkatieto_view&outputformat=!!!&Filter=<Filter><Or><PropertyIsEqualTo><PropertyName>alaryhma_id</PropertyName><Literal>???</Literal></PropertyIsEqualTo><PropertyIsEqualTo><PropertyName>ylaryhma_id</PropertyName><Literal>???</Literal></PropertyIsEqualTo></Or></Filter>";
	public static final String URL_GEOSERVER_ILMIO_CSV_FORMAT_API = URL_GEOSERVER_ILMIO_API + "&format_options=filename:KOTUS_murrehaku_ilmio_???.csv";
	public static final String URL_GEOSERVER_RYHMA_CSV_FORMAT_API = URL_GEOSERVER_RYHMA_API + "&format_options=filename:KOTUS_murrehaku_ryhma_???.csv";
	public static final String URL_GEOSERVER_ILMIO_ZIP_FORMAT_API = URL_GEOSERVER_ILMIO_API + "&format_options=filename:KOTUS_murrehaku_ilmio_???.zip";
	public static final String URL_GEOSERVER_RYHMA_ZIP_FORMAT_API = URL_GEOSERVER_RYHMA_API + "&format_options=filename:KOTUS_murrehaku_ryhma_???.zip";
	public static final String INFO_DOWNLOAD_CSV = "CSV";
	public static final String INFO_DOWNLOAD_SHAPE_ZIP = "SHAPE-ZIP";
	public static final String INFO_RYHMA_LABEL_RYHMA_ID = "Ryhmä ID";
	public static final String FORM_ALL_AINEISTOT = "Kaikki aineistot";
	
	public static final String KARTTA_ILMIO_INFO_1 = "<li>Pudotusvalikoista voit valita kartalla näytettävät ilmiöt. Pudotusvalikon vieressä oleva symboli vastaa valittua ilmiötä.</li>";
	public static final String KARTTA_ILMIO_INFO_2 = "<li>Klikkaamalla ilmiötä kartalla saat ilmiöön liittyvät tiedot esille.</li>";
	public static final String KARTTA_ILMIO_INFO_3 = "<li>Jos murrepuusta valitussa ryhmässä on enemmän ilmiöitä kuin kartalla voidaan kerralla näyttää (10 kpl), ilmiö-pudotusvalikoista voit valita minkä tahansa ilmiön.</li>";

	public static final String RYHMA_INFO_TREE_PAGE_INFO = "<p>Hierarkiapuun ja kartan sisältävässä näkymässä ovat nähtävissä yksittäisen ilmiön kaikki tiedot sekä ilmiön sijoittuminen hierarkiaan. Kartassa näkyvistä symboleista avautuu kartan päälle ikkuna, jossa kerrotaan valitun kohteen tiedot sanallisesti. Karttaan voi valita näkymään eri murrerajoja. Lisäksi ilmiön tai ilmiöryhmän tiedot voi ladata tiedostoina.</p><p>Itämerensuomalaisessa kielikartastossa ja Kettusen murrekartastossa yksi kartta sisältää tyypillisesti useita toisiinsa liittyviä ilmiöitä, esimerkiksi onko murteessa käytössä muoto mennä vai männä. Hierarkiapuusta voi valita ylemmän tason, ilmiöryhmän, jolloin karttaan piirtyvät kaikki toisiinsa liittyvät ilmiöt (enintään 10 kpl). Kartan vieressä näkyvää legendaa voi käyttää kartan räätälöintiin. Esiintymän voi piilottaa tai sen symbolia voi vaihtaa legendasta avautuvista valintalistoista. Jos esiintymiä on enemmän kuin kartassa voidaan esittää, valintalistojen avulla voi määritellä, mitkä enintään 10 ilmiötä kartassa näytetään.</p>";
	public static final String TABLE_PAGE_INFO = "<p>Hakutuloksena on lista ilmiöistä. Hakutuloksen rivit toimivat linkkeinä tarkempiin tietoihin, jotka esitetään Jäsennys ja kartta -näkymässä. Hakutulokset ja Jäsennys ja kartta -näkymien välillä liikkuessa tulokset säilyvät kunnes tehdään uusi haku Hae ilmiöitä -näkymässä. Kartta näkyy myös hakutuloslistan alla.</p><p>Hakutuloslistan jokaisen sarakkeen yläosassa on kohta Rajaa hakua. Kirjoittamalla tähän kenttään hakuehdon ja painamalla enter voit rajata hakutulosta.</p>";
	public static final String SEARCH_FORM_PAGE_INFO = "Käytössä ovat seuraavat hakuehdot:<br><ul><li>Aineisto: valintalista aineistoista</li><li>Ilmiö: kielellinen ilmiö, esim. jokin sana, merkitys tai muoto-opillinen piirre</li><li>Tyyppi: ilmiön laatu, esim. 'kielenaines', 'merkitys' tai 'formatiivi'</li><li>Kuvaus: tarkempaa tietoa ilmiöstä</li><li>Paikka: ilmiön sijainti kunnan nimellä ilmaistuna</li></ul><p>Tyyppiluokitus ja se, miten kuvaus on muodostettu, vaihtelee aineiston mukaan. Ensisijaisesti haut kannattaa rajata ilmiön ja mahdollisesti aineiston perusteella. Sanallinen paikannus noudattelee kaikissa aineistoissa sotia edeltävän ajan pitäjäjakoa.</p><p>Kettusen murrekartaston yksittäisten karttalehtien (<a href='http://kettunen.fnhost.org'>http://kettunen.fnhost.org</a>) sisältöä voi hakea syöttämällä karttalehden numeron Kuvaus-kenttään ja rajaamalla haut koskemaan vain Kettusen murrekartastoa.</p>";
	public static final String AINEISTO_PAGE_INFO = "<p>Kielikartastohaussa ovat mukana Itämerensuomalainen kielikartasto (IMSK = ALFE), Lauri Kettusen suomen murteiden kartasto ja Suomen murteiden sanakirjan levikkikartat. Aineistot-kohdassa on aineistojen tarkempi esittely ja mahdollisuus ladata aineistot tiedostopaketteina.</p>";
	public static final String APP_FRONT_PAGE_GENERAL_INFO = "<p>Kielikartastoaineistoja suomesta ja sen lähisukukielistä on nyt käytettävissä AVAAssa. Kielikartastot-sovelluksella voi tehdä hakuja näihin aineistoihin ja hakutuloksia voi tarkastella karttamuodossa.</p>";
	public static final String HOME_TAB_OHJE_TEXT = "<h2>Kielikartastot</h2>" + APP_FRONT_PAGE_GENERAL_INFO + "<h2>Aineistot (<i>Aineistot</i>)</h2>" + AINEISTO_PAGE_INFO + "<h2>Hakeminen (<i>Hae ilmiöitä</i>)</h2>" + SEARCH_FORM_PAGE_INFO + "<h2>Hakutulos listana (<i>Hakutulokset</i>)</h2>" + TABLE_PAGE_INFO + "<h2>Hakutulos hierarkiapuuna ja karttana (<i>Jäsennys ja kartta</i>)</h2>" + RYHMA_INFO_TREE_PAGE_INFO;
	
	public static String getHideNotificationJSForClassNames(String classNames) {
		return HIDE_NOTIFICATION_JAVASCRIPT.replaceFirst("\\?", classNames);
	}

	public static String getGeoserverDownloadURL(String url, Integer id, String outputFormat) {
		return url.replaceAll("\\?\\?\\?", String.valueOf(id)).replaceAll("!!!", outputFormat);
	}
}
