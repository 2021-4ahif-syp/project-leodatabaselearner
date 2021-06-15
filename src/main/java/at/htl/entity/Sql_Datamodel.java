package at.htl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "L_SQL_DATAMODEL")
public class Sql_Datamodel {

    @Id
    private Long id;
    @Column(name = "Dm_DmName")
    private String name;
    @Column(name = "Dm_Cwner")
    private String owner;

    @Column(name = "Dm_Comment")
    private String comment;


    public Sql_Datamodel() {
    }
}
