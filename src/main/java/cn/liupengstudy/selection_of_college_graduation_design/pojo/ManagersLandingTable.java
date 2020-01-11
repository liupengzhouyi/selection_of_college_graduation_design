package cn.liupengstudy.selection_of_college_graduation_design.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "管理员登陆实体")
public class ManagersLandingTable {

    @ApiModelProperty(value = "管理员自增ID")
    private Integer id;

    @ApiModelProperty(value = "管理员ID")
    private String managerid;

    @ApiModelProperty(value = "管理员密码值")
    private Integer passwordvalue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getManagerid() {
        return managerid;
    }

    public void setManagerid(String managerid) {
        this.managerid = managerid == null ? null : managerid.trim();
    }

    public Integer getPasswordvalue() {
        return passwordvalue;
    }

    public void setPasswordvalue(Integer passwordvalue) {
        this.passwordvalue = passwordvalue;
    }

    @Override
    public String toString() {
        return "ManagersLandingTable{" +
                "id=" + id +
                ", managerid='" + managerid + '\'' +
                ", passwordvalue=" + passwordvalue +
                '}';
    }
}