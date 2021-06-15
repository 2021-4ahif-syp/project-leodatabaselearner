package at.htl.entity;

import javax.persistence.*;

@Entity
@Table(name = "L_PRACTICE")
public class Sql_Practice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
