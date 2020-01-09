package cn.liupengstudy.selection_of_college_graduation_design.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "教师登陆实体")
public class TeachersLanding {

    @ApiModelProperty(value = "ID")
    private Integer id;

    @ApiModelProperty(value = "教师编号")
    private String teacherid;

    @ApiModelProperty(value = "密码值")
    private Integer passwordvalue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public Integer getPasswordvalue() {
        return passwordvalue;
    }

    public void setPasswordvalue(Integer passwordvalue) {
        this.passwordvalue = passwordvalue;
    }

    @Override
    public String toString() {
        return "TeachersLanding{" +
                "id=" + id +
                ", teacherid='" + teacherid + '\'' +
                ", passwordvalue=" + passwordvalue +
                '}';
    }
}