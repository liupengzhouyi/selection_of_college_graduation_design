package cn.liupengstudy.selection_of_college_graduation_design.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "学生登陆实体")
public class StudentsLandingTable {

    @ApiModelProperty(value = "学生登陆自增ID")
    private Integer id;


    @ApiModelProperty(value = "学生ID")
    private String studentsid;

    @ApiModelProperty(value = "学生登陆密码值")
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

    @Override
    public String toString() {
        return "StudentsLandingTable{" +
                "id=" + id +
                ", studentsid='" + studentsid + '\'' +
                ", passwordvalue=" + passwordvalue +
                '}';
    }
}