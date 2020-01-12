package cn.liupengstudy.selection_of_college_graduation_design.pojo;

public class CollageAndProfessionalTable {
    private Integer id;

    private Integer collageid;

    private String collagename;

    private Integer professionalid;

    private String professionalname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCollageid() {
        return collageid;
    }

    public void setCollageid(Integer collageid) {
        this.collageid = collageid;
    }

    public String getCollagename() {
        return collagename;
    }

    public void setCollagename(String collagename) {
        this.collagename = collagename == null ? null : collagename.trim();
    }

    public Integer getProfessionalid() {
        return professionalid;
    }

    public void setProfessionalid(Integer professionalid) {
        this.professionalid = professionalid;
    }

    public String getProfessionalname() {
        return professionalname;
    }

    public void setProfessionalname(String professionalname) {
        this.professionalname = professionalname == null ? null : professionalname.trim();
    }
}