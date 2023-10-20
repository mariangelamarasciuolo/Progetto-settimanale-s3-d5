package mariangelamarasciuolo.dao;

import mariangelamarasciuolo.entities.Catalogo;
import mariangelamarasciuolo.entities.Libro;
import mariangelamarasciuolo.entities.Rivista;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CatalogoDAO {
    private final EntityManager em;

    public CatalogoDAO(EntityManager em) {
        this.em = em;
    }
    public void save (Catalogo c) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        em.persist(c);

        transaction.commit();
        System.out.println("Elemento Salavto Correttamente!");
    }
    public Libro findLibroById(long ISBN) {
        return em.find(Libro.class, ISBN);
    }
    public Rivista findRivistaById(long ISBN) {
        return em.find(Rivista.class, ISBN);
    }


}
