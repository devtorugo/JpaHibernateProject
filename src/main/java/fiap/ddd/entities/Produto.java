package fiap.ddd.entities;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.UpdateTimestamp;


import java.util.Calendar;

@Entity
@Table(name = "tb_produto")
public class Produto {

    @Id
    @SequenceGenerator(name = "produto", sequenceName="sq_tb_produto", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto")
    @Column(name = "cd_produto")
    private int id;

    @Column(name="nm_produto", nullable = false, length = 100)
    private String nome;
    @Column (name="vl_preco")
    private double preco;
    @Temporal(TemporalType.DATE)
    @Column(name="dt_data_validade")
    private Calendar dataValidade;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Column(name="dt_cadastro")
    @CreationTimestamp
    private Calendar dataCadastro;

    @Column(name = "dt_modificacao")
    @UpdateTimestamp
    private Calendar dataModificacao;

    @Formula("vl_preco * 0.9")
    private double precoDesconto;


}
