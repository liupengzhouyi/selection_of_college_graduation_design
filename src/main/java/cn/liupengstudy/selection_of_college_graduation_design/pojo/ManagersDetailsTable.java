package cn.liupengstudy.selection_of_college_graduation_design.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "管理员详细信息")
public class ManagersDetailsTable {

    @ApiModelProperty(value = "自增ID")
    private Integer id;

    @ApiModelProperty(value = "管理员ID")
    private String managerid;

    @ApiModelProperty(value = "管理员联系方式")
    private String phonenumber;

    @ApiModelProperty(value = "管理员姓名")
    private String name;

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

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Override
    public String toString() {
        return "ManagersDetailsTable{" +
                "id=" + id +
                ", managerid='" + managerid + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}