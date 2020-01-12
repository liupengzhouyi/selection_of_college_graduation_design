package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.CollageAndProfessionalTable;

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

    public void getCollageIDAndProfessionalIDTypeByCollageAndProfessionalTable(CollageAndProfessionalTable collageAndProfessionalTable) {
        this.setCollageID(collageAndProfessionalTable.getCollageid());
        this.setProfessionalID(collageAndProfessionalTable.getProfessionalid());
    }

    @Override
    public String toString() {
        return "CollageIDAndProfessionalIDType{" +
                "collageID=" + collageID +
                ", professionalID=" + professionalID +
                '}';
    }
}
