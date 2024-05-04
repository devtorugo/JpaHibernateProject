package fiap.ddd.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "tb_fornecedor")
public class Fornecedor {

    @Id
    @Column(name="cd_forncedor")
    private int codigo;

}
