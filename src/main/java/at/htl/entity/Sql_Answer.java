package at.htl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Sql_Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean isCorr;
    private String answer;


    public Sql_Answer() {
    }

    public Sql_Answer(boolean isCorr, String answer) {
        this.isCorr = isCorr;
        this.answer = answer;
    }


    public boolean isCorr() {
        return isCorr;
    }

    public void setCorr(boolean corr) {
        isCorr = corr;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
