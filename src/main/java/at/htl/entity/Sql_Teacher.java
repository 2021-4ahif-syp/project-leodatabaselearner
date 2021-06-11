package at.htl.entity;

public class Sql_Teacher {
    private long id;
    private String name;
    private boolean isAdmin;

    public Sql_Teacher(){}

    public Sql_Teacher(String name, boolean isAdmin){
        this.name = name;
        this.isAdmin = isAdmin;
    }
}
