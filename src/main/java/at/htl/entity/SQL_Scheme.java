package at.htl.entity;

import javax.persistence.Column;

public class SQL_Scheme {
    private long id;
    //@Column(name = "Scheme_Name")
    private String name;
    private String password;
    private boolean isResserv;
    //jdbc_connstr
    private long tan_id;
}
