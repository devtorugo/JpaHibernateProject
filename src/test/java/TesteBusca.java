import fiap.ddd.entities.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteBusca {
    public static void main(String[] args) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpaHibernateproject");
        EntityManager em = fabrica.createEntityManager();

       Cliente cliente = em.find(Cliente.class, 1);
        System.out.printf(cliente.getId()+ " " + cliente.getNome());

        em.close();
        fabrica.close();
    }
}
