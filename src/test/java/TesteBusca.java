import fiap.ddd.entities.entities.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteBusca {
    public static void main(String[] args) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpaHibernateproject");
        EntityManager em = fabrica.createEntityManager();

       Cliente cliente = new Cliente(1, "Thiago");
        System.out.printf(cliente.getId()+ " " + cliente.getNome());

        em.merge(cliente);

        cliente.setNome("Henrique");
        em.getTransaction().begin();
        em.getTransaction().commit();

        em.close();
        fabrica.close();
    }
}
