package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

public interface RyhmaFinder {
    public java.lang.Object findAllByRyhmaId(int ryhmaId);

    public java.util.List<java.lang.Object> findByYlaryhma(int[] ylaRyhmaIds);
}
