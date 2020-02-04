package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentAllApplicationPaperInformation;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.TeacherAllApplicatioonPaperInformation;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.linkDatabases.LinkMySQL.SelectData;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service.impl
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/2/3 - 6:40 下午
 * @修改人和其它信息
 */
public class StudentApplicationInformation {

    public StudentApplicationInformation() {
    }

    public StudentApplicationInformation(String studentID) throws SQLException {
        this.studentID = studentID;
        this.init();
        createList();
    }

    String studentID;

    private SelectData selectData;

    List<StudentAllApplicationPaperInformation> list;

    public void init() {
        try {
            this.selectData = new SelectData("select applicationPaperTable.isPass, paperTable.id, paperTable.paperName, paperTable.teacherID, tDT.name from applicationPaperTable join paperTable on applicationPaperTable.paperID = paperTable.id join teachersDetailsTable tDT on paperTable.teacherID = tDT.teacherID where studentID = \'" + this.studentID + "\'");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void createList() throws SQLException {
        list = new ArrayList<StudentAllApplicationPaperInformation>();
        while (this.selectData.getResultSet().next()) {
            StudentAllApplicationPaperInformation studentAllApplicationPaperInformation = new StudentAllApplicationPaperInformation();
            studentAllApplicationPaperInformation.setIsPass(this.selectData.getResultSet().getInt("isPass"));
            studentAllApplicationPaperInformation.setPaperID(this.selectData.getResultSet().getInt("id"));
            studentAllApplicationPaperInformation.setPaperName(this.selectData.getResultSet().getString("paperName"));
            studentAllApplicationPaperInformation.setTeachername(this.selectData.getResultSet().getString("name"));
            studentAllApplicationPaperInformation.setTeacherID(this.selectData.getResultSet().getString("teacherID"));
            list.add(studentAllApplicationPaperInformation);
            System.out.println("============");
            System.out.println(studentAllApplicationPaperInformation.toString());
            System.out.println("============");
        }
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) throws SQLException {
        this.studentID = studentID;
        this.init();
        createList();
    }

    public List<StudentAllApplicationPaperInformation> getList() {
        return list;
    }

    public void setList(List<StudentAllApplicationPaperInformation> list) {
        this.list = list;
    }

    public static void main(String[] args) throws SQLException {
        StudentApplicationInformation studentApplicationInformation = new StudentApplicationInformation("1667159125");
        for (int i = 0; i < studentApplicationInformation.list.size(); i++) {
            System.out.println(studentApplicationInformation.list.get(i).toString());
        }
    }
    
}
