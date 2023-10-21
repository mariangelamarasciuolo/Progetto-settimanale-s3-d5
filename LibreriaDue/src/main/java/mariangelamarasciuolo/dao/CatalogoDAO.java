package mariangelamarasciuolo.dao;

import mariangelamarasciuolo.entities.Catalogo;
import mariangelamarasciuolo.entities.Libro;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;


public class CatalogoDAO {
    private final EntityManager em;

    public CatalogoDAO(EntityManager em) {
        this.em = em;
    }

    /////////salvataggio elementi
    public void save(Catalogo c) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        em.persist(c);

        transaction.commit();
        System.out.println("Elemento Salavto Correttamente!");
    }

    ////////////////cerco elementi per chiave primaria
    public Catalogo findElemntoByIsbn(long ISBN) {
    return em.find(Catalogo.class, ISBN);
    }


//////////////cerco ed elimino elemento
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

    ///////cerco per anno pubblicazione

    public List<Catalogo> findByYear(int year){
        TypedQuery<Catalogo> getAllQuery = em.createQuery("SELECT c FROM Catalogo c WHERE c.annoPubblicazione ="+ year, Catalogo.class);
        return getAllQuery.getResultList();
    }



}
