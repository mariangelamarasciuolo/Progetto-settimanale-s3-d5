package mariangelamarasciuolo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Application {
private static EntityManagerFactory emf= JpaUtils.getEntityManagerFactory();
    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();


    }
}
