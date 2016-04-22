package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

public interface IlmioFinder {
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio> findByAineistoIlmioTyyppiKuvausPaikka(
        int aineistoIdVal, java.lang.String ilmioVal,
        java.lang.String tyyppiVal, java.lang.String kuvausVal,
        java.lang.String paikkaVal);

    public java.util.List<java.lang.Object> findIlmioPaikkaByRyhmaId(
        int[] groupIds);

    public java.util.List<java.lang.Object> findByRyhmaId(int[] groupIds);
}
