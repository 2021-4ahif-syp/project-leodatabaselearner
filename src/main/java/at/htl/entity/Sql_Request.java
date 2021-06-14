package at.htl.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "L_REQUEST")
public class Sql_Request {
    @Id
    private long id;
    private Date date;
    private long qst_id;

    public Sql_Request(){}

    public Sql_Request(Date date, long qst_id){
        this.date = date;
        this.qst_id = qst_id;
    }
}
