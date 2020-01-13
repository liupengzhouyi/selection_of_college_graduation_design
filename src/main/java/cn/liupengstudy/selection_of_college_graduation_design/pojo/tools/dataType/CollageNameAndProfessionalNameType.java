package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.CollageAndProfessionalTable;

/**
 * @author liupeng
 * @version 1.0.0
 * @ClassName CollageNameAndProfessionalNameType.java
 * @Description TODO
 * @createTime 2020年01月13日 12:28:00
 */
public class CollageNameAndProfessionalNameType {

    private String collageName;

    private String professionalName;

    public CollageNameAndProfessionalNameType() {
    }

    public CollageNameAndProfessionalNameType(String collageName, String professionalName) {
        this.collageName = collageName;
        this.professionalName = professionalName;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public String getProfessionalName() {
        return professionalName;
    }

    public void setProfessionalName(String professionalName) {
        this.professionalName = professionalName;
    }

    public void getCollageIDAndProfessionalIDType(CollageAndProfessionalTable collageAndProfessionalTable) {
        this.setCollageName(collageAndProfessionalTable.getCollagename());
        this.setProfessionalName(collageAndProfessionalTable.getProfessionalname());
    }

    @Override
    public String toString() {
        return "CollageNameAndProfessionalNameType{" +
                "collageName='" + collageName + '\'' +
                ", professionalName='" + professionalName + '\'' +
                '}';
    }
}
