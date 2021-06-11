package at.htl.entity;

import java.util.Date;

public class Sql_Request {
    private long id;
    private Date date;
    private long qst_id;

    public Sql_Request(){}

    public Sql_Request(Date date, long qst_id){
        this.date = date;
        this.qst_id = qst_id;
    }
}
