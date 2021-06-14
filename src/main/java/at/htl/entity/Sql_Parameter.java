package at.htl.entity;

import javax.persistence.*;

@Entity
@Table(name = "L_PARAMETER")
public class Sql_Parameter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "PARAM_KEY")
    private String param_key;

    @Column(name = "PARAM_VALUE")
    private int param_value;

    public Sql_Parameter(){}

    public  Sql_Parameter(String param_key, int param_value){
        this.param_key = param_key;
        this.param_value = param_value;
    }
}
