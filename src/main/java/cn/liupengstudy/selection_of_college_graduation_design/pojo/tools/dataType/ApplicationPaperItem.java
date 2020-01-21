package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ApplicationPaperTable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/21 - 2:45 下午
 * @修改人和其它信息
 */
@ApiModel(value = "论文申请差重实体")
public class ApplicationPaperItem {

    @ApiModelProperty(value = "学生ID")
    private String studentID;

    @ApiModelProperty(value = "论文ID")
    private Integer paperID;

    @ApiModelProperty(value = "是否通过")
    private Integer isPass;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Integer getPaperID() {
        return paperID;
    }

    public void setPaperID(Integer paperID) {
        this.paperID = paperID;
    }

    public Integer getIsPass() {
        return isPass;
    }

    public void setIsPass(Integer isPass) {
        this.isPass = isPass;
    }

    public ApplicationPaperItem() {
    }

    public ApplicationPaperItem(String studentID, Integer paperID, Integer isPass) {
        this.studentID = studentID;
        this.paperID = paperID;
        this.isPass = isPass;
    }

    public void setByApplicationPaper(ApplicationPaperTable applicationPaperTable) {
        this.setStudentID(applicationPaperTable.getStudentid());
        this.setPaperID(applicationPaperTable.getPaperid());
        this.setIsPass(applicationPaperTable.getIspass());
    }
}
