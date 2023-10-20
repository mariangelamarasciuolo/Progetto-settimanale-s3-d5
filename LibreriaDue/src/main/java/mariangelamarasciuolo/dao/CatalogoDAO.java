package mariangelamarasciuolo.dao;

import mariangelamarasciuolo.entities.Catalogo;
import mariangelamarasciuolo.entities.Libro;
import mariangelamarasciuolo.entities.Rivista;
import mariangelamarasciuolo.entities.Utente;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CatalogoDAO {
    private final EntityManager em;

    public CatalogoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Catalogo c) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        em.persist(c);

        transaction.commit();
        System.out.println("Elemento Salavto Correttamente!");
    }

    public Catalogo findCatalogoByIsbn(long ISBN) {
        return em.find(Catalogo.class, ISBN);
    }

    public void findByIsbnAndDelete(long ISBN) {
        Catalogo found = em.find(Catalogo.class, ISBN);

        if (found != null) {
            EntityTransaction transaction = em.getTransaction();

            transaction.begin();

            em.remove(found);

            transaction.commit();
            System.out.println("Elemento cancellato Correttamente!");
        } else {
            System.err.println("L'elemento " + ISBN + " non è stato trovato");
        }
    }
}
