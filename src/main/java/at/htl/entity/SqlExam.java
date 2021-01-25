package at.htl.entity;

import java.util.Date;

public class SqlExam {
    private int counter = 0;
    private int id;
    private Date date;
    private String name;
    private String owner;
    private String description;


    public SqlExam(Date date, String name, String owner, String description) {
        this.id = ++counter;
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
