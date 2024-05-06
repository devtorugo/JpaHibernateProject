package src.main.fiap.ddd.entities;


import jakarta.persistence.Persistence;

public class Teste {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("jpaHibernateproject")
                .createEntityManager();

    }
}
