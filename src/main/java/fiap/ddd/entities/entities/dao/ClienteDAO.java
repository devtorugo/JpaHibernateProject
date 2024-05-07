package fiap.ddd.entities.entities.dao;

import fiap.ddd.entities.entities.Cliente;
import jakarta.persistence.EntityManager;

public class ClienteDAO {

    private EntityManager em;

    public void cadastrar (Cliente cliente){
        em.persist(cliente);
    }
}
