package fiap.ddd.entities;

import javax.persistence.*;
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
    @Column (name="vl_value")
    private double preco;
    @Temporal(TemporalType.DATE)
    @Column(name="dt_data_validade")
    private Calendar dataValidade;

    @Enumerated(EnumType.STRING)
    private Estado estado;



}
