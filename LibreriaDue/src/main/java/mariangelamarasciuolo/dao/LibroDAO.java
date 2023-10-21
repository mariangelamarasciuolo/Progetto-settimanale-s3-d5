package mariangelamarasciuolo.dao;

import mariangelamarasciuolo.entities.Catalogo;
import mariangelamarasciuolo.entities.Libro;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class LibroDAO {
    private final EntityManager em;

    public LibroDAO(EntityManager em) {
        this.em = em;
    }

    public List<Libro> findByAuthor (String autore){
        TypedQuery<Libro> getAllQuery = em.createQuery("SELECT l FROM Libro l WHERE l.autore = '" + autore + "'", Libro.class);
        return getAllQuery.getResultList();
    }

}
