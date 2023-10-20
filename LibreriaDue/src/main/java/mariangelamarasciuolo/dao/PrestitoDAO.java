package mariangelamarasciuolo.dao;

import mariangelamarasciuolo.entities.Prestito;
import mariangelamarasciuolo.entities.Utente;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PrestitoDAO {
    private final EntityManager em;

    public PrestitoDAO(EntityManager em) {
        this.em = em;
    }
    public void save (Prestito p) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        em.persist(p);

        transaction.commit();
        System.out.println("Prestito Salavto Correttamente!");
    }
}
