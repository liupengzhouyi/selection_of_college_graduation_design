package cn.liupengstudy.selection_of_college_graduation_design.pojo;

public class TeachersLandingTable {
    private Integer id;

    private String teacherid;

    private Integer passwordvalue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public Integer getPasswordvalue() {
        return passwordvalue;
    }

    public void setPasswordvalue(Integer passwordvalue) {
        this.passwordvalue = passwordvalue;
    }
}