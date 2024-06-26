package fiap.ddd.entities.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_avaliacao")
@IdClass(AvaliacaoId.class)
public class Avaliacao implements Serializable {

    @Id
    @JoinColumn(name="id_usuario")
    @ManyToOne(optional = false)
    private Usuario usuario;
    @Id
    @JoinColumn(name = "id_estabelecimento")
    @ManyToOne(optional = false)
    private Estabelecimento estabelecimento;


    @Column(name="vl_nota")
    private int nota;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
