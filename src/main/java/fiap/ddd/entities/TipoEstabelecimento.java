package fiap.ddd.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_tipo_estabelecimento")
public class TipoEstabelecimento {
    @Id
    @Column(name = "id_tipo_estabelecimento")
    @SequenceGenerator(name= "tipoEstabelecimento", sequenceName = "sq_tb_tipo_estabelecimento", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipoEstabelecimento")
    private int id;

    @Column(name="nm_tipo_estabelecimento", nullable = false)
    private String nome;
    @OneToMany(mappedBy = "tipo")
    private List<Estabelecimento> estabelecimentos;

    public TipoEstabelecimento(){}

    public TipoEstabelecimento(int id, String nome, List<Estabelecimento> estabelecimentos) {
        this.id = id;
        this.nome = nome;
        this.estabelecimentos = estabelecimentos;
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

    public List<Estabelecimento> getEstabelecimentos() {
        return estabelecimentos;
    }

    public void setEstabelecimentos(List<Estabelecimento> estabelecimentos) {
        this.estabelecimentos = estabelecimentos;
    }
}
