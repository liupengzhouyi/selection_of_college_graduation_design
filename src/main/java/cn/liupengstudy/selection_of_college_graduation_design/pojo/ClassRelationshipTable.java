package cn.liupengstudy.selection_of_college_graduation_design.pojo;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.ClassTypeByLiupeng;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "班级关系实体")
public class ClassRelationshipTable {
    @ApiModelProperty(value = "自增ID")
    private Integer id;

    @ApiModelProperty(value = "学院编号")
    private Integer collageid;

    @ApiModelProperty(value = "专业编号")
    private Integer professionalid;

    @ApiModelProperty(value = "入学年份")
    private Integer yearofadmission;

    @ApiModelProperty(value = "班主任编号")
    private String headteacherid;

    @ApiModelProperty(value = "班级编号")
    private Integer classnumber;

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

    public Integer getProfessionalid() {
        return professionalid;
    }

    public void setProfessionalid(Integer professionalid) {
        this.professionalid = professionalid;
    }

    public Integer getYearofadmission() {
        return yearofadmission;
    }

    public void setYearofadmission(Integer yearofadmission) {
        this.yearofadmission = yearofadmission;
    }

    public String getHeadteacherid() {
        return headteacherid;
    }

    public void setHeadteacherid(String headteacherid) {
        this.headteacherid = headteacherid == null ? null : headteacherid.trim();
    }

    public Integer getClassnumber() {
        return classnumber;
    }

    public void setClassnumber(Integer classnumber) {
        this.classnumber = classnumber;
    }

    @Override
    public String toString() {
        return "ClassRelationshipTable{" +
                "id=" + id +
                ", collageid=" + collageid +
                ", professionalid=" + professionalid +
                ", yearofadmission=" + yearofadmission +
                ", headteacherid='" + headteacherid + '\'' +
                ", classnumber=" + classnumber +
                '}';
    }

    /**
     * @描述 get class relationship information form class relationship table
     * @参数  []
     * @返回值  cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.ClassTypeByLiupeng
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/12 - 2:57 下午
     * @修改人和其它信息
     */
    public ClassTypeByLiupeng getClassTypeByLiupeng() {
        ClassTypeByLiupeng classTypeByLiupeng = new ClassTypeByLiupeng();
        classTypeByLiupeng.setCollageID(this.getCollageid());
        classTypeByLiupeng.setProfessionalID(this.getProfessionalid());
        classTypeByLiupeng.setYearOfAdmission(this.getYearofadmission());
        classTypeByLiupeng.setClassNumber(this.getClassnumber());
        return classTypeByLiupeng;
    }
}