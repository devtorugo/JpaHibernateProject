package src.main.fiap.ddd.entities;

import javax.persistence.Persistence;

public class Teste {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("jpaHibernateproject")
                .createEntityManager();

    }
}
