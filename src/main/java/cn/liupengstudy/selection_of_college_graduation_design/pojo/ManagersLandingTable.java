package cn.liupengstudy.selection_of_college_graduation_design.pojo;

public class ManagersLandingTable {
    private Integer id;

    private String managerid;

    private Integer passwordvalue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManagerid() {
        return managerid;
    }

    public void setManagerid(String managerid) {
        this.managerid = managerid == null ? null : managerid.trim();
    }

    public Integer getPasswordvalue() {
        return passwordvalue;
    }

    public void setPasswordvalue(Integer passwordvalue) {
        this.passwordvalue = passwordvalue;
    }
}