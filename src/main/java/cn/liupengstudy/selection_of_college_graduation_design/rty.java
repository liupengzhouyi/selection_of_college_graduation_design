package cn.liupengstudy.selection_of_college_graduation_design;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.linkDatabases.LinkMySQL.SelectData;

import java.sql.SQLException;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/2/3 - 7:12 下午
 * @修改人和其它信息
 */
public class rty {

    private SelectData selectData;

    public void init() {
        try {
            this.selectData = new SelectData("select applicationPaperTable.isPass, paperTable.id, paperTable.paperName, applicationPaperTable.studentID, sDT.name from applicationPaperTable join paperTable on applicationPaperTable.paperID = paperTable.id join studentsDetailsTable sDT on applicationPaperTable.studentID = sDT.studentID where paperTable.teacherID = \'2020001\';");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    void pppp() throws SQLException {
        this.init();
        while (this.selectData.getResultSet().next()) {
            System.out.println("============");
            System.out.println(this.selectData.getResultSet().getInt("isPass"));
            System.out.println(this.selectData.getResultSet().getInt("id"));
            System.out.println(this.selectData.getResultSet().getString("paperName"));
            System.out.println(this.selectData.getResultSet().getInt("studentID"));
            System.out.println(this.selectData.getResultSet().getString("name"));
            System.out.println("============");
        }
    }

    public static void main(String[] args) {
        rty a = new rty();
        try {
            a.pppp();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
