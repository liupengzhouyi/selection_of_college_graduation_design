package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/17 - 11:06 下午
 * @修改人和其它信息
 */
@ApiModel(value = "改变小组名称实体")
public class ChangeGroupName {

    @ApiModelProperty(value = "小组名称")
    private String groupName;

    @ApiModelProperty(value = "教师ID")
    private String teacherID;

    @ApiModelProperty(value = "新小组名称")
    private String newGroupName;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getNewGroupName() {
        return newGroupName;
    }

    public void setNewGroupName(String newGroupName) {
        this.newGroupName = newGroupName;
    }

    @Override
    public String toString() {
        return "ChangeGroupName{" +
                "groupName='" + groupName + '\'' +
                ", teacherID='" + teacherID + '\'' +
                ", newGroupName='" + newGroupName + '\'' +
                '}';
    }
}
