import fiap.ddd.entities.entities.Cliente;
import fiap.ddd.entities.entities.ContratoAluguel;
import fiap.ddd.entities.entities.Estabelecimento;
import fiap.ddd.entities.entities.TipoEstabelecimento;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class TesteCadastro {
    public static void main(String[] args) {

        EntityManager em = Persistence.createEntityManagerFactory("jpaHibernateproject").createEntityManager();

        TipoEstabelecimento tipo = new TipoEstabelecimento(0, "Petshop", null);

        Cliente cliente = new Cliente(0, "Thiago", null);
        Cliente cliente2 = new Cliente(0, "Leanddro", null);



        ContratoAluguel contrato = new ContratoAluguel(1, 2000,
                new GregorianCalendar(2015, Calendar.JANUARY, 10), null);

        List<Cliente> lista = new ArrayList<>();
        lista.add(cliente);
        lista.add(cliente2);

        Estabelecimento est1 = new Estabelecimento(0, "Fiap Pet", lista, null, tipo);
        Estabelecimento est2 = new Estabelecimento(0, "Poyatos Dog", lista, contrato, tipo);

        contrato.setEstabelecimento(est2);

        em.persist(est1);
        em.persist(est2);

        em.getTransaction().begin();
        em.getTransaction().commit();




        em.close();
    }
}
