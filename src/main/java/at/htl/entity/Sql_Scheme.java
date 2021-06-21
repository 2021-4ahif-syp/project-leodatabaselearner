package at.htl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "L_SCHEME")
public class Sql_Scheme {
    @Id
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isResserv() {
        return isResserv;
    }

    public void setResserv(boolean resserv) {
        isResserv = resserv;
    }
}
