package at.htl.entity;

import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "L_SQL_EXERCISE")
public class Sql_Exercise {

    //Fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "DATE")
    private Date date;

    @Column(name = "NAME")
    private String name;

    @Column(name = "OWNER")
    private String owner;

    @Column(name = "DESCRIPTION")
    private String description;




    public Sql_Exercise(Date date, String name, String owner, String description) {
        this.date = date;
        this.name = name;
        this.owner = owner;
        this.description = description;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
