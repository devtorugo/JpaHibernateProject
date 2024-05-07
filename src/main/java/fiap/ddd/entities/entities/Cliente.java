package fiap.ddd.entities.entities;

import jakarta.persistence.*;

@Entity
@Table(name="tb_cliente")
public class Cliente {
    @Id
    @SequenceGenerator(name="cliente", sequenceName = "sq_tb_cliente", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
    @Column(name="cd_cliente")
    private int id;
    @Column(name="nm_cliente")
    private String nome;

    public Cliente(){

    }

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Cliente(int i, String thiago, Object o) {
    }

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
