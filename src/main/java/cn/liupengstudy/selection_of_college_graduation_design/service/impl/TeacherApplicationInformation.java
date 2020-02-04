package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

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
public class TeacherApplicationInformation {

    public TeacherApplicationInformation() throws SQLException {
    }

    public TeacherApplicationInformation(String teacherID) throws SQLException {
        this.teacherID = teacherID;
        this.init();
        this.createList();
    }

    String teacherID;

    private SelectData selectData;

    List<TeacherAllApplicatioonPaperInformation> list;

    public void init() {
        try {
            this.selectData = new SelectData("select applicationPaperTable.isPass, paperTable.id, paperTable.paperName, applicationPaperTable.studentID, sDT.name from applicationPaperTable join paperTable on applicationPaperTable.paperID = paperTable.id join studentsDetailsTable sDT on applicationPaperTable.studentID = sDT.studentID where paperTable.teacherID = \'" + this.getTeacherID() + "\';");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void createList() throws SQLException {
        list = new ArrayList<TeacherAllApplicatioonPaperInformation>();
        while (this.selectData.getResultSet().next()) {
            TeacherAllApplicatioonPaperInformation teacherAllApplicatioonPaperInformation = new TeacherAllApplicatioonPaperInformation();
            teacherAllApplicatioonPaperInformation.setIsPass(this.selectData.getResultSet().getInt("isPass"));
            teacherAllApplicatioonPaperInformation.setPaperID(this.selectData.getResultSet().getInt("id"));
            teacherAllApplicatioonPaperInformation.setPaperName(this.selectData.getResultSet().getString("paperName"));
            teacherAllApplicatioonPaperInformation.setStudentName(this.selectData.getResultSet().getString("name"));
            teacherAllApplicatioonPaperInformation.setStudentNumber(this.selectData.getResultSet().getString("studentID"));
            list.add(teacherAllApplicatioonPaperInformation);
            System.out.println("============");
            System.out.println(this.selectData.getResultSet().getInt("isPass"));
            System.out.println(this.selectData.getResultSet().getInt("id"));
            System.out.println(this.selectData.getResultSet().getString("paperName"));
            System.out.println(this.selectData.getResultSet().getInt("studentID"));
            System.out.println(this.selectData.getResultSet().getString("name"));
            System.out.println(teacherAllApplicatioonPaperInformation.toString());
            System.out.println("============");
        }
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) throws SQLException {
        this.teacherID = teacherID;
        this.init();
        this.createList();
    }

    public List<TeacherAllApplicatioonPaperInformation> getList() {
        return list;
    }

    public void setList(List<TeacherAllApplicatioonPaperInformation> list) {
        this.list = list;
    }

    public static void main(String[] args) throws SQLException {
        TeacherApplicationInformation teacherApplicationInformation = new TeacherApplicationInformation("2020001");
        for (int i=0;i<teacherApplicationInformation.list.size();i++) {
            System.out.println(teacherApplicationInformation.list.get(i).toString());
        }
    }

}
