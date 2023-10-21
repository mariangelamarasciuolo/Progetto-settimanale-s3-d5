package mariangelamarasciuolo;

import mariangelamarasciuolo.dao.CatalogoDAO;
import mariangelamarasciuolo.dao.LibroDAO;
import mariangelamarasciuolo.dao.PrestitoDAO;
import mariangelamarasciuolo.dao.UtenteDAO;
import mariangelamarasciuolo.entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Application {
private static EntityManagerFactory emf= JpaUtils.getEntityManagerFactory();
    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        CatalogoDAO cd = new CatalogoDAO(em);
        UtenteDAO ud = new UtenteDAO(em);
        PrestitoDAO pd = new PrestitoDAO(em);
        LibroDAO li = new LibroDAO(em);

        Utente utente1 = new Utente("Gerardo", "Lamonarca", LocalDate.of(1990,6,5));
        Utente utente2 = new Utente("Raffaella", "Grande", LocalDate.of(1985,6,5));

        Libro libro1 = new Libro("Libro bello", 2022, 202, "Peppino Magnarone", "Fantasy");
        Libro libro2 = new Libro("Libro Bellissimo", 2021, 650,  "Mario Pappolla", "Romantico");

        Rivista riviste1 = new Rivista("Alieni", 2022, 300,  Periodicita.MENSILE);
        Rivista riviste2 = new Rivista("Vichinghi", 2023, 250, Periodicita.SEMESTRALE);

        Prestito prestito1 = new Prestito(libro2, utente2,LocalDate.of(2023,10,10),LocalDate.now(),LocalDate.of(2023,10,20));
        Prestito prestito2 = new Prestito(riviste1, utente1,LocalDate.of(2023,10,9),LocalDate.now(),LocalDate.of(2023,10,15));
        Prestito prestito3 = new Prestito(riviste2, utente2,LocalDate.of(2023,9, 5),LocalDate.now(),null);

        /*ud.save(utente1);
        ud.save(utente2);

        cd.save(libro1);
        cd.save(libro2);

        cd.save(riviste1);
        cd.save(riviste2);

        pd.save(prestito1);
        pd.save(prestito2);
        pd.save(prestito3);*/


        System.out.println(cd.findElemntoByIsbn(5));

        //cd.findByIsbnAndDelete(6);

        System.out.println(cd.findByYear(2022));

        System.out.println(li.findByAuthor("Peppino Magnarone"));

        em.close();
        emf.close();

    }
}
