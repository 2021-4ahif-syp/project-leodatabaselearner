package at.htl.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "L_TAN")
public class Sql_Tan {
    @Id
    private long id;
    private String tancode;
    private int lfdNr;
    private Date login;
    private int cnt_Login;
    private Date start;
    private Date end;
    private boolean forPract;
    private long scheme_id;
    private long exercise_id;

    public Sql_Tan(String tancode, int lfdNr, Date login, int cnt_Login, Date start, Date end, boolean forPract, long scheme_id, long exercise_id ){
        this.tancode = tancode;
        this.lfdNr = lfdNr;
        this.login = login;
        this.cnt_Login = cnt_Login;
        this.start= start;
        this.end = end;
        this.forPract = forPract;
        this.scheme_id = scheme_id;
        this.exercise_id = exercise_id;
    }

    public Sql_Tan() {
    }
}
