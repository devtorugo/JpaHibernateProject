package fiap.ddd.entities.entities.dao;
import fiap.ddd.entities.entities.Estabelecimento;

import javax.persistence.EntityManager;

public class EstabelecimentoDAO extends GenericDAO<Estabelecimento, Integer>{


    public EstabelecimentoDAO(EntityManager em) {
        super(em);
    }
}
