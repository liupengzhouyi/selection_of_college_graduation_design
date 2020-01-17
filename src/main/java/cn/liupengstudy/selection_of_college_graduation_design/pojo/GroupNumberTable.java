package cn.liupengstudy.selection_of_college_graduation_design.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "小组成员实体")
public class GroupNumberTable {

    @ApiModelProperty(value = "自增ID")
    private Integer id;

    @ApiModelProperty(value = "小组ID")
    private Integer groupid;

    @ApiModelProperty(value = "学生ID")
    private String studentid;

    @ApiModelProperty(value = "毕业设计题目ID")
    private Integer titleid;

    @ApiModelProperty(value = "昵称")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    public Integer getTitleid() {
        return titleid;
    }

    public void setTitleid(Integer titleid) {
        this.titleid = titleid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}