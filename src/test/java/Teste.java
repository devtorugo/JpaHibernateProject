import fiap.ddd.entities.entities.Cliente;
import fiap.ddd.entities.entities.dao.ClienteDAO;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        EntityManager em = Persistence
                .createEntityManagerFactory("jpaHibernate").createEntityManager();
        ClienteDAO clienteDAO = new ClienteDAO(em);

        Cliente entidade = new Cliente(0, "Poyatos");
        clienteDAO.cadastrar(entidade);

        try {
            clienteDAO.commit();
        } catch (Exception e) {
          e.printStackTrace();
        }

        List<Cliente> lista = clienteDAO.listar();
        for (Cliente cliente : lista){
            System.out.println(cliente.getId() + " " + cliente.getNome());
        }
    }


}
