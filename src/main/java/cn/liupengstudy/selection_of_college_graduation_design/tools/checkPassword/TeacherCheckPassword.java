package cn.liupengstudy.selection_of_college_graduation_design.tools.checkPassword;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLandingTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.TeachersLandingTable;

/**
 * @author liupeng
 * @version 1.0.0
 * @ClassName TeacherCheckPassword.java
 * @Description TODO
 * @createTime 2020年01月11日 02:12:00
 */
public class TeacherCheckPassword {

    private TeachersLandingTable DBteachersLandingTable;

    private TeachersLandingTable yourteachersLandingTable;

    public TeacherCheckPassword() {
    }

    public TeacherCheckPassword(TeachersLandingTable DBteachersLandingTable, TeachersLandingTable yourteachersLandingTable) {
        this.DBteachersLandingTable = DBteachersLandingTable;
        this.yourteachersLandingTable = yourteachersLandingTable;
    }

    public TeachersLandingTable getDBteachersLandingTable() {
        return DBteachersLandingTable;
    }

    public void setDBteachersLandingTable(TeachersLandingTable DBteachersLandingTable) {
        this.DBteachersLandingTable = DBteachersLandingTable;
    }

    public TeachersLandingTable getYourteachersLandingTable() {
        return yourteachersLandingTable;
    }

    public void setYourteachersLandingTable(TeachersLandingTable yourteachersLandingTable) {
        this.yourteachersLandingTable = yourteachersLandingTable;
    }

    public int check() {
        int returnKey = -1;
        String passwordValue1 = this.getDBteachersLandingTable().getPasswordvalue() + "";
        String passwordValue2 = this.getYourteachersLandingTable().getPasswordvalue() + "";
        passwordValue1 = passwordValue1.trim();
        passwordValue1 = passwordValue1.replaceFirst(" ", "");
        passwordValue2 = passwordValue2.trim();
        passwordValue2 = passwordValue2.replaceFirst(" ", "");
        if (passwordValue1.equals(passwordValue2)) {
            returnKey = 1;
        } else {
            returnKey = 0;
        }
        return returnKey;
    }

    @Override
    public String toString() {
        return "TeacherCheckPassword{" +
                "DBteachersLandingTable=" + DBteachersLandingTable +
                ", yourteachersLandingTable=" + yourteachersLandingTable +
                '}';
    }
}
