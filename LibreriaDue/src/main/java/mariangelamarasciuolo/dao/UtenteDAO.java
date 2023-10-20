package mariangelamarasciuolo.dao;

import mariangelamarasciuolo.entities.Catalogo;
import mariangelamarasciuolo.entities.Utente;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UtenteDAO {
    private final EntityManager em;

    public UtenteDAO(EntityManager em) {
        this.em = em;
    }
    public void save (Utente u) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        em.persist(u);

        transaction.commit();
        System.out.println("Utente Salavto Correttamente!");
    }
}
