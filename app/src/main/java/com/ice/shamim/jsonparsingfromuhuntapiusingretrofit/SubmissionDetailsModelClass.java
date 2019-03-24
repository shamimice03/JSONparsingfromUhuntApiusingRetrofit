package com.ice.shamim.jsonparsingfromuhuntapiusingretrofit;

public class SubmissionDetailsModelClass {

    private String uname;
    private String name;
    private String[][] subs;


    public SubmissionDetailsModelClass(String name, String uname, String[][] subs) {
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[][] getSubs() {
        return subs;
    }

    public void setSubs(String[][] subs) {
        this.subs = subs;
    }


}
