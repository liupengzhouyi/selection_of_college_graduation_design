package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ApplicationPaperTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.ApplicationPaperItem;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.StringType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.StudentApplicationInformation;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.TeacherApplicationInformation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.controller
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/2/4 - 1:45 下午
 * @修改人和其它信息
 */
@RestController
@RequestMapping("/applicationPaper")
@Api(tags = "论文申请查询控制器")
public class ApplicationPaperInformation {

    @ApiOperation(value = "学生论文题目申请信息")
    @RequestMapping(value = "/studentGet", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation studentGet(@RequestBody StringType stringType) throws SQLException {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("student get application paper information");
        StudentApplicationInformation studentApplicationInformation = new StudentApplicationInformation(stringType.getString());
        if (studentApplicationInformation.getList().size() == 0) {
            returnInformation.setKey(false);
            returnInformation.setReturnObject(null);
        } else {
            returnInformation.setKey(true);
            returnInformation.setReturnObject(studentApplicationInformation.getList());
        }
        return returnInformation;
    }

    @ApiOperation(value = "教师论文题目申请信息")
    @RequestMapping(value = "/teacherGet", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation teacherGet(@RequestBody StringType stringType) throws SQLException {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("teacher get application paper information");
        TeacherApplicationInformation teacherApplicationInformation = new TeacherApplicationInformation(stringType.getString());
        if (teacherApplicationInformation.getList().size() == 0) {
            returnInformation.setKey(false);
            returnInformation.setReturnObject(null);
        } else {
            returnInformation.setKey(true);
            returnInformation.setReturnObject(teacherApplicationInformation.getList());
        }
        return returnInformation;
    }
}
