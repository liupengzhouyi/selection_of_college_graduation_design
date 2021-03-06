package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.checkPassword;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLandingTable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author liupeng
 * @version 1.0.0
 * @ClassName StudentCheckPassword.java
 * @Description TODO
 * @createTime 2020年01月11日 00:34:00
 */
@ApiModel(value = "学生密码校验实体")
public class StudentCheckPassword {

    @ApiModelProperty(value = "数据库中的信息实体")
    private StudentsLandingTable DBstudentsLandingTable;

    @ApiModelProperty(value = "用户输入的信息实体")
    private StudentsLandingTable yourStudentsLandingTable;

    public StudentCheckPassword() {
    }

    public StudentCheckPassword(StudentsLandingTable DBstudentsLandingTable, StudentsLandingTable yourStudentsLandingTable) {
        this.DBstudentsLandingTable = DBstudentsLandingTable;
        this.yourStudentsLandingTable = yourStudentsLandingTable;
    }

    public StudentsLandingTable getDBstudentsLandingTable() {
        return DBstudentsLandingTable;
    }

    public void setDBstudentsLandingTable(StudentsLandingTable DBstudentsLandingTable) {
        this.DBstudentsLandingTable = DBstudentsLandingTable;
    }

    public StudentsLandingTable getYourStudentsLandingTable() {
        return yourStudentsLandingTable;
    }

    public void setYourStudentsLandingTable(StudentsLandingTable yourStudentsLandingTable) {
        this.yourStudentsLandingTable = yourStudentsLandingTable;
    }

    public int check() {
        int returnKey = -1;
        String passwordValue1 = this.getDBstudentsLandingTable().getPasswordvalue() + "";
        String passwordValue2 = this.getYourStudentsLandingTable().getPasswordvalue() + "";
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
        return "StudentCheckPassword{" +
                "DBstudentsLandingTable=" + DBstudentsLandingTable +
                ", yourStudentsLandingTable=" + yourStudentsLandingTable +
                '}';
    }
}
