package at.htl.entity;

public class Sql_Script {
    private long script_id;
    private String script_type;
    private String script_path;
    private int script_order;
    private long dm_id;



    public String getScript_type() {
        return script_type;
    }

    public void setScript_type(String script_type) {
        this.script_type = script_type;
    }

    public String getScript_path() {
        return script_path;
    }

    public void setScript_path(String script_path) {
        this.script_path = script_path;
    }

    public int getScript_order() {
        return script_order;
    }

    public void setScript_order(int script_order) {
        this.script_order = script_order;
    }
}
