import fiap.ddd.entities.entities.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteRemocao {
    public static void main(String[] args) {

        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("jpaHibernateproject");
        EntityManager em = fabrica.createEntityManager();

        Cliente cliente = em.find(Cliente.class, 1);
        em.remove(cliente);

        try{

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
