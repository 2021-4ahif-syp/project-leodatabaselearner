package at.htl.entity;

import javax.persistence.Column;

public class Sql_Scheme {
    private long id;
    //@Column(name = "Scheme_Name")
    private String name;
    private String password;
    private boolean isResserv;
    //jdbc_connstr
    private long tan_id;

    public Sql_Scheme(){}

    public Sql_Scheme(String name, String password, boolean isResserv, int tan_id){
        this.name = name;
        this.password = password;
        this.isResserv = isResserv;
        this.tan_id = tan_id;
    }

}
