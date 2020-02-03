package cn.liupengstudy.selection_of_college_graduation_design.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.pojo
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/2/3 - 2:48 下午
 * @修改人和其它信息
 */
@ApiModel(value = "学生申请题目详细信息")
public class StudentAllApplicationPaperInformation {

    public StudentAllApplicationPaperInformation() {
    }

    public StudentAllApplicationPaperInformation(int isPass, int paperID, String paperName, String teacherID, String teachername) {
        this.isPass = isPass;
        this.paperID = paperID;
        this.paperName = paperName;
        this.teacherID = teacherID;
        this.teachername = teachername;
    }

    @ApiModelProperty(value = "是否通过")
    private int isPass;

    @ApiModelProperty(value = "论文编号")
    private int paperID;

    @ApiModelProperty(value = "论文题目名称")
    private String paperName;

    @ApiModelProperty(value = "教师编号")
    private String teacherID;

    @ApiModelProperty(value = "教师名称")
    private String teachername;

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

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }
}
