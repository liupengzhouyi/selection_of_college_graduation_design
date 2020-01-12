package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType;

public class CollageIDAndProfessionalIDType {

    private Integer collageID;

    private Integer professionalID;

    public CollageIDAndProfessionalIDType() {
    }

    public CollageIDAndProfessionalIDType(Integer collageID, Integer professionalID) {
        this.collageID = collageID;
        this.professionalID = professionalID;
    }

    public Integer getCollageID() {
        return collageID;
    }

    public void setCollageID(Integer collageID) {
        this.collageID = collageID;
    }

    public Integer getProfessionalID() {
        return professionalID;
    }

    public void setProfessionalID(Integer professionalID) {
        this.professionalID = professionalID;
    }

    @Override
    public String toString() {
        return "CollageIDAndProfessionalIDType{" +
                "collageID=" + collageID +
                ", professionalID=" + professionalID +
                '}';
    }
}
