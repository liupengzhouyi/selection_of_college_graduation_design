package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.CollageAndProfessionalTable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "学院ID和专业ID信息实体")
public class CollageIDAndProfessionalIDType {

    @ApiModelProperty(value = "学院ID")
    private Integer collageID;

    @ApiModelProperty(value = "专业ID")
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
