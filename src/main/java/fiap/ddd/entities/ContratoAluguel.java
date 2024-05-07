package fiap.ddd.entities;

import jakarta.persistence.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Entity
@Table(name = "tb_contrato_aluguel")
public class ContratoAluguel {

    @Id
    @Column(name = "id_contrato")
    private int id;

    @Column(name="vl_aluguel")
    private float valor;

    @Temporal(TemporalType.DATE)
    @Column(name="dt_vencimento_aluguel")
    private Calendar dataVenciento;
    @OneToOne
    @JoinColumn(name="id_estabelecimento")
    private Estabelecimento estabelecimento;

    public ContratoAluguel(int i, int i1, GregorianCalendar gregorianCalendar, Estabelecimento est1) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Calendar getDataVenciento() {
        return dataVenciento;
    }

    public void setDataVenciento(Calendar dataVenciento) {
        this.dataVenciento = dataVenciento;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }
}
