import fiap.ddd.entities.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {
    public static void main(String[] args) {
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpaHibernateproject");
        EntityManager em = fabrica.createEntityManager();

        Cliente cliente = new Cliente();
        cliente.setNome("Payatos");

        try{
            em.persist(cliente);
            em.getTransaction().begin();
            em.getTransaction().commit();
        } catch (Exception e){
            if (em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
        }


        em.close();
        fabrica.close();
    }
}
