package at.htl.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "L_ANSWER")
public class Sql_Answer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ISCORR")
    private boolean isCorr;
    @Column(name = "ANSWER")
    private String answer;


    public Sql_Answer() {
    }

    public Sql_Answer(boolean isCorr, String answer) {
        this.isCorr = isCorr;
        this.answer = answer;
    }

    private boolean checkAnswer() {
        return false;
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
