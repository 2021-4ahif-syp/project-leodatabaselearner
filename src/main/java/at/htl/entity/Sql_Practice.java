package at.htl.entity;

public class Sql_Practice {
    private long id;
    private String answer;
    private boolean isCorr;
    private int level;
    private long tan_id;
    private long qst_id;

    public Sql_Practice(){}

    public Sql_Practice(String answer, boolean isCorr, int level, long tan_id, long qst_id){
        this.answer = answer;
        this.isCorr = isCorr;
        this.level = level;
        this.tan_id = tan_id;
        this.qst_id = qst_id;
    }
}
