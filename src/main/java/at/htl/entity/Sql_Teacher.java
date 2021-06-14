package at.htl.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "L_TEACHER")
public class Sql_Teacher {
    @Id
    private long id;
    private String name;
    private boolean isAdmin;

    public Sql_Teacher(){}

    public Sql_Teacher(String name, boolean isAdmin){
        this.name = name;
        this.isAdmin = isAdmin;
    }
}
