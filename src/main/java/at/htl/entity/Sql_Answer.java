package at.htl.entity;

import java.util.Date;

public class Sql_Answer {

    private int id;
    private boolean isCorr;
    private String answer;


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
