package fiap.ddd.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class PessoaJuridica extends Pessoa{
    @Column(name="nr_cpf")
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
