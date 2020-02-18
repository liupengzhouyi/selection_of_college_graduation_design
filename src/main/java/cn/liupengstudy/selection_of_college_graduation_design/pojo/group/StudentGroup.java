package cn.liupengstudy.selection_of_college_graduation_design.pojo.group;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.pojo.group
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/2/18 - 10:50 下午
 * @修改人和其它信息
 */
public class StudentGroup {

    private int groupID;

    private String name;

    private String groupName;

    private String teacherID;

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "studentGroup{" +
                "groupID=" + groupID +
                ", name='" + name + '\'' +
                ", groupName='" + groupName + '\'' +
                ", teacherID='" + teacherID + '\'' +
                '}';
    }
}
