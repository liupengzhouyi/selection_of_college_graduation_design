package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.GroupRelationshipTable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/17 - 10:44 下午
 * @修改人和其它信息
 */
@ApiModel(value = "小组信息实体")
public class GroupRelationshipInformation {

    @ApiModelProperty(value = "小组名称")
    private String groupName;

    @ApiModelProperty(value = "教师ID")
    private String teacherID;

    public GroupRelationshipInformation() {
    }

    public GroupRelationshipInformation(String groupName, String teacherID) {
        this.groupName = groupName;
        this.teacherID = teacherID;
    }

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

    public void getGroupRelationshipInformationByGroupRelationshipTable(GroupRelationshipTable groupRelationshipTable) {
        this.setGroupName(groupRelationshipTable.getGroupname());
        this.setTeacherID(groupRelationshipTable.getTeacherid());
    }

    public void getGroupRelationshipInformationByChangeGroupName(ChangeGroupName changeGroupName) {
        this.setGroupName(changeGroupName.getGroupName());
        this.setTeacherID(changeGroupName.getTeacherID());
    }

    @Override
    public String toString() {
        return "GroupRelationshipInformation{" +
                "groupName='" + groupName + '\'' +
                ", teacherID='" + teacherID + '\'' +
                '}';
    }
}
