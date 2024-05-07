package fiap.ddd.entities.entities.dao;
import fiap.ddd.entities.entities.Estabelecimento;
import jakarta.persistence.EntityManager;

public class EstabelecimentoDAO {

    private EntityManager em;

    public void cadastrar (Estabelecimento est){
        em.persist(est);
    }
}
