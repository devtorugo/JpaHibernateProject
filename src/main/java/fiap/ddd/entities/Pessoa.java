package fiap.ddd.entities;

import jakarta.persistence.*;

@Entity
public class Pessoa {
    @Id
    @SequenceGenerator(name= "pessoa", sequenceName = "sq_pessoa", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pessoa")
    private int id;

    @Column(length = 50, nullable = false)
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
