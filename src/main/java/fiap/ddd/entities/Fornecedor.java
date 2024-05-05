package fiap.ddd.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.util.Calendar;

@Entity
@Table(name= "tb_fornecedor")
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="fornecedor")
    @SequenceGenerator(name="fornecedor", sequenceName = "sq_tb_fornecedor", allocationSize = 1)
    @Column(name="cd_fornecedor")
    private int codigo;

    @Column(name="nm_nome", nullable = false, length = 50)
    private String nome;

    @CreationTimestamp
    @Column(name="dt_cadastro")
    private Calendar dataCadastro;
    @UpdateTimestamp
    @Column(name="dt_modificacao")
    private Calendar dataModificacao;

    public  Fornecedor(){
        super();
    }

    public Fornecedor(int codigo, String nome, Calendar dataCadastro, Calendar dataModificacao) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.dataModificacao = dataModificacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Calendar getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(Calendar dataModificacao) {
        this.dataModificacao = dataModificacao;
    }
}
