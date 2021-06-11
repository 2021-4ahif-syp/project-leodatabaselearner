package at.htl.entity;

public class SQL_Teacher {
    private long id;
    private String name;
    private boolean isAdmin;

    public SQL_Teacher(){}

    public SQL_Teacher(String name, boolean isAdmin){
        this.name = name;
        this.isAdmin = isAdmin;
    }
}
