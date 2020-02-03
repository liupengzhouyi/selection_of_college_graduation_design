package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.linkDatabases.LinkMySQL;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.linkDatabases.LinkMySQL
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/2/3 - 6:55 下午
 * @修改人和其它信息
 */
class SelectDataTest {

    private SelectData selectData;

    public void init() {
        try {
            this.selectData = new SelectData("select applicationPaperTable.isPass, paperTable.id, paperTable.paperName, applicationPaperTable.studentID, sDT.name from applicationPaperTable join paperTable on applicationPaperTable.paperID = paperTable.id join studentsDetailsTable sDT on applicationPaperTable.studentID = sDT.studentID where paperTable.teacherID = \\'2020001\\';");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    void pppp() {
        this.init();
        System.out.println(this.selectData.getResultSet().toString());
    }

    public static void main(String[] args) {
        SelectDataTest selectDataTest = new SelectDataTest();
    }

}