package at.htl.entity;

public class SqlStatement {

    private int id;
    private String statement;


    public SqlStatement(int id, String statement) {
        this.id = id;
        this.statement = statement;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }
}
