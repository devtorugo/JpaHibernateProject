package fiap.ddd.entities.entities.dao;

import fiap.ddd.entities.entities.Cliente;

import javax.persistence.EntityManager;

public class ClienteDAO extends GenericDAO<Cliente, Integer>{


    public ClienteDAO(EntityManager em) {
        super(em);
    }
}
