package cn.liupengstudy.selection_of_college_graduation_design.service.group;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentAllApplicationPaperInformation;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.group.StudentGroup;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.linkDatabases.LinkMySQL.SelectData;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service.group
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/2/18 - 10:58 下午
 * @修改人和其它信息
 */
public class StudentGroupServiceImpl {

    String studentID;

    private SelectData selectData;

    List<StudentGroup> list;

    public void init() {
        try {
            this.selectData = new SelectData("select groupNumberTable.groupID, groupNumberTable.name, groupRelationshipTable.groupName, groupRelationshipTable.teacherID from groupNumberTable join groupRelationshipTable on groupNumberTable.groupID = groupRelationshipTable.id and groupNumberTable.studentID = '" + this.studentID + "'");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void createList() throws SQLException {
        list = new ArrayList<StudentGroup>();
        while (this.selectData.getResultSet().next()) {
            StudentGroup studentGroup = new StudentGroup();
            studentGroup.setGroupID(this.selectData.getResultSet().getInt("groupID"));
            studentGroup.setName(this.selectData.getResultSet().getString("name"));
            studentGroup.setGroupName(this.selectData.getResultSet().getString("groupName"));
            studentGroup.setTeacherID(this.selectData.getResultSet().getString("teacherID"));
            list.add(studentGroup);
            System.out.println("============");
            System.out.println(studentGroup.toString());
            System.out.println("============");
        }
    }

    public StudentGroupServiceImpl(String studentID) throws SQLException {
        this.studentID = studentID;
        this.init();
        this.createList();
    }



    public static void main(String[] args) throws SQLException {
        StudentGroupServiceImpl studentGroupService = new StudentGroupServiceImpl("1667159125");
        for (int i = 0; i < studentGroupService.list.size(); i++) {
            System.out.println(studentGroupService.list.get(i).toString());
        }
    }

}
