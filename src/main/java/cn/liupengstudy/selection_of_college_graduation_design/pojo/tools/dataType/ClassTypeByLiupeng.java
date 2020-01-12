package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ClassRelationshipTable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;

/**
 * @author liupeng
 * @version 1.0.0
 * @ClassName classType.java
 * @Description TODO
 * @createTime 2020年01月11日 21:34:00
 */

@ApiModel(value = "查询班级的信息输入实体")
public class ClassTypeByLiupeng {

    @ApiModelProperty(value = "学院ID")
    private Integer collageID;

    @ApiModelProperty(value = "专业ID")
    private Integer professionalID;

    @ApiModelProperty(value = "入学ID")
    private Integer yearOfAdmission;

    @ApiModelProperty(value = "班级编号")
    private Integer classNumber;

    public ClassTypeByLiupeng() {
    }

    public ClassTypeByLiupeng(Integer collageID, Integer professionalID, Integer yearOfAdmission, Integer classNumber) {
        this.collageID = collageID;
        this.professionalID = professionalID;
        this.yearOfAdmission = yearOfAdmission;
        this.classNumber = classNumber;
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

    public Integer getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(Integer yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public Integer getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "ClassTypeByLiupeng{" +
                "collageID=" + collageID +
                ", professionalID=" + professionalID +
                ", yearOfAdmission=" + yearOfAdmission +
                ", classNumber=" + classNumber +
                '}';
    }

    /**
     * @描述  getClassTypeByLiupengFromClassRelationshipTable
     * @参数  [classRelationshipTable]
     * @返回值  []
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/12 - 3:58 下午
     * @修改人和其它信息
     */
    public void getClassTypeByLiupengFromClassRelationshipTable(ClassRelationshipTable classRelationshipTable) {
        this.setCollageID(classRelationshipTable.getCollageid());
        this.setProfessionalID(classRelationshipTable.getProfessionalid());
        this.setYearOfAdmission(classRelationshipTable.getYearofadmission());
        this.setClassNumber(classRelationshipTable.getClassnumber());
    }
}
