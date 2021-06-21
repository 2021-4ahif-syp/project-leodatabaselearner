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

    public String getTancode() {
        return tancode;
    }

    public void setTancode(String tancode) {
        this.tancode = tancode;
    }

    public int getLfdNr() {
        return lfdNr;
    }

    public void setLfdNr(int lfdNr) {
        this.lfdNr = lfdNr;
    }

    public Date getLogin() {
        return login;
    }

    public void setLogin(Date login) {
        this.login = login;
    }

    public int getCnt_Login() {
        return cnt_Login;
    }

    public void setCnt_Login(int cnt_Login) {
        this.cnt_Login = cnt_Login;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public boolean isForPract() {
        return forPract;
    }

    public void setForPract(boolean forPract) {
        this.forPract = forPract;
    }
}
