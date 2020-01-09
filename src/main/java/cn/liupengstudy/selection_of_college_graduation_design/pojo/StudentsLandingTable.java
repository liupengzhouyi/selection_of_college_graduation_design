package cn.liupengstudy.selection_of_college_graduation_design.pojo;

public class StudentsLandingTable {
    private Integer id;

    private String studentsid;

    private Integer passwordvalue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentsid() {
        return studentsid;
    }

    public void setStudentsid(String studentsid) {
        this.studentsid = studentsid == null ? null : studentsid.trim();
    }

    public Integer getPasswordvalue() {
        return passwordvalue;
    }

    public void setPasswordvalue(Integer passwordvalue) {
        this.passwordvalue = passwordvalue;
    }
}