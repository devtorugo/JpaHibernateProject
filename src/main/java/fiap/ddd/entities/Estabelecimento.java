package fiap.ddd.entities;

import jakarta.persistence.*;

@Entity(name = "tb_estabelecimento")
@Table(name = "tb_estabelecimento")
public class Estabelecimento {
    @Id
    @SequenceGenerator(name= "estabelecimento", sequenceName = "sq_tb_estabelecimento", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estabelecimento")
    @Column(name = "id_Estabelecimento")
    private Integer id;

    @Column(name="nm_estabelecimento", length = 50)
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
