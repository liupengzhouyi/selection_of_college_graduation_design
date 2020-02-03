package cn.liupengstudy.selection_of_college_graduation_design.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.pojo
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/2/3 - 6:44 下午
 * @修改人和其它信息
 */
@ApiModel(value = "教师申请信息")
public class TeacherAllApplicatioonPaperInformation {

    public TeacherAllApplicatioonPaperInformation() {
    }

    public TeacherAllApplicatioonPaperInformation(int isPass, int paperID, String paperName, String studentNumber, String studentName) {
        this.isPass = isPass;
        this.paperID = paperID;
        this.paperName = paperName;
        this.studentNumber = studentNumber;
        this.studentName = studentName;
    }

    @ApiModelProperty(value = "是否通过")
    private int isPass;

    @ApiModelProperty(value = "论文编号")
    private int paperID;

    @ApiModelProperty(value = "论文题目名称")
    private String paperName;

    @ApiModelProperty(value = "学号")
    private String studentNumber;

    @ApiModelProperty(value = "学生姓名")
    private String studentName;

    public int getIsPass() {
        return isPass;
    }

    public void setIsPass(int isPass) {
        this.isPass = isPass;
    }

    public int getPaperID() {
        return paperID;
    }

    public void setPaperID(int paperID) {
        this.paperID = paperID;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "TeacherAllApplicatioonPaperInformation{" +
                "isPass=" + isPass +
                ", paperID=" + paperID +
                ", paperName='" + paperName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
