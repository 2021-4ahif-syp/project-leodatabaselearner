package at.htl.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "L_TOPIC")
public class Sql_Topic {
    @Id
    private Long id;
    private String tipName;

    public Sql_Topic() {
    }

    public Sql_Topic(String tipName) {
        this.tipName = tipName;
    }
}
