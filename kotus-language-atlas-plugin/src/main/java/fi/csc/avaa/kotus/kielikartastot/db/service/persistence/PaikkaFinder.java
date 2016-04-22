package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

public interface PaikkaFinder {
    public java.util.List<java.lang.Object> findByIlmioId(int ilmioId);
}
