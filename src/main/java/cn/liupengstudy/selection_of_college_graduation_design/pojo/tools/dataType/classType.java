package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author liupeng
 * @version 1.0.0
 * @ClassName classType.java
 * @Description TODO
 * @createTime 2020年01月11日 21:34:00
 */

@ApiModel(value = "查询班级的信息输入实体")
public class classType {

    @ApiModelProperty(value = "学院ID")
    private int collageID;

    @ApiModelProperty(value = "专业ID")
    private int professionallID;

    @ApiModelProperty(value = "入学ID")
    private int yearOfAdmission;

    @ApiModelProperty(value = "班级编号")
    private int classNUmber;

    public int getCollageID() {
        return collageID;
    }

    public void setCollageID(int collageID) {
        this.collageID = collageID;
    }

    public int getProfessionallID() {
        return professionallID;
    }

    public void setProfessionallID(int professionallID) {
        this.professionallID = professionallID;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public int getClassNUmber() {
        return classNUmber;
    }

    public void setClassNUmber(int classNUmber) {
        this.classNUmber = classNUmber;
    }

    public classType() {
    }

    public classType(int collageID, int professionallID, int yearOfAdmission, int classNUmber) {
        this.collageID = collageID;
        this.professionallID = professionallID;
        this.yearOfAdmission = yearOfAdmission;
        this.classNUmber = classNUmber;
    }

    @Override
    public String toString() {
        return "classType{" +
                "collageID=" + collageID +
                ", professionallID=" + professionallID +
                ", yearOfAdmission=" + yearOfAdmission +
                ", classNUmber=" + classNUmber +
                '}';
    }
}
