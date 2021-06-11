package at.htl.entity;

public class Sql_Parameter {
    private String param_key;
    private int param_value;

    public Sql_Parameter(){}

    public  Sql_Parameter(String param_key, int param_value){
        this.param_key = param_key;
        this.param_value = param_value;
    }
}
