package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.IntegerType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.StringType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLanding;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.StudentsLandingServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liupeng
 * @version 1.0.0
 * @ClassName StudentsLandingContorller.java
 * @Description TODO
 * @createTime 2020年01月08日 18:07:00
 */
@RestController
@RequestMapping("/studentsLanding")
@Api(tags = "学生登陆控制器", description = "提供学生登陆控制器的增删改查方法")
public class StudentsLandingContorller {

    // 业务成操作类
    @Autowired
    private StudentsLandingServiceImpl studentsLandingServiceImpl;

    /*
     * @Title getStudentsLandingServiceImpl
     * @Description 获取业务成操作类
     * @Param []
     * @return cn.liupengstudy.selection_of_college_graduation_design.service.impl.StudentsLandingServiceImpl
     * @Date 1/8/2020 7:17 PM
     * @Author liupeng
     **/
    @ApiOperation(value = "获取业务成操作类")
    public StudentsLandingServiceImpl getStudentsLandingServiceImpl() {
        return studentsLandingServiceImpl;
    }

    /*
     * @Title setStudentsLandingServiceImpl
     * @Description 设置业务成操作类
     * @Param [studentsLandingServiceImpl]
     * @return void
     * @Date 1/8/2020 7:17 PM
     * @Author liupeng
     **/
    @ApiOperation(value = "设置业务成操作类")
    public void setStudentsLandingServiceImpl(StudentsLandingServiceImpl studentsLandingServiceImpl) {
        this.studentsLandingServiceImpl = studentsLandingServiceImpl;
    }

    /*
     * @Title landing
     * @Description 用户登陆是否成功
     * @Param []
     * @return java.lang.String
     * @Date 1/8/2020 7:19 PM
     * @Author liupeng
     **/
    @ApiOperation(value = "学生登陆是否成功")
    @RequestMapping(value = "/landing", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation landing(@RequestBody StudentsLanding studentsLanding) {
        StringType stringType = new StringType();
        stringType.setString(studentsLanding.getStudentsid());
        ReturnInformation returnInformation = this.findStudents(stringType);
        if (returnInformation.isKey()) {
            returnInformation = new ReturnInformation();
            returnInformation.setWhatYourDo("学生登陆");
            StudentsLanding studentsLanding1 = this.getStudentsLandingServiceImpl().selectByPrimaryKey(studentsLanding.getStudentsid());
            if (studentsLanding1.getPasswordvalue().equals(studentsLanding.getPasswordvalue())) {
                returnInformation.setKey(true);
                returnInformation.setWhy("登陆成功");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("登陆失败");
            }
            return returnInformation;
        } else {
            // 没有某一个学生使用该学号
            returnInformation = new ReturnInformation();
            returnInformation.setWhatYourDo("学生登陆");
            returnInformation.setWhy("没有某一个学生使用该学号,登陆失败");
            returnInformation.setKey(false);
        }
        return returnInformation;
    }

    /*
     * @Title changePassword
     * @Description 修改密码
     * @Param []
     * @return java.lang.String
     * @Date 1/8/2020 7:19 PM
     * @Author liupeng
     **/
    @ApiOperation(value = "学生修改密码")
    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation changePassword(@RequestBody StudentsLanding studentsLanding) {
        StringType stringType = new StringType();
        stringType.setString(studentsLanding.getStudentsid());
        ReturnInformation returnInformation = this.findStudents(stringType);
        if (returnInformation.isKey()) {
            // 已经存在某一个学生使用该学号
            returnInformation = new ReturnInformation();
            returnInformation.setWhatYourDo("学生修改登陆密码");
            int key = this.getStudentsLandingServiceImpl().updateByPrimaryKey(studentsLanding);
            if (key == 1) {
                returnInformation.setWhy("修改成功");
                returnInformation.setKey(true);
            } else {
                returnInformation.setWhy("修改失败");
                returnInformation.setKey(false);
            }
        } else {
            // 没有某一个学生使用该学号
            returnInformation = new ReturnInformation();
            returnInformation.setWhatYourDo("学生修改登陆密码");
            returnInformation.setWhy("没有某一个学生使用该学号,修改失败");
            returnInformation.setKey(false);
        }
        return returnInformation;
    }

    @ApiOperation(value = "添加学生登陆信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation addStudent(@RequestBody StudentsLanding studentsLanding) {
        StringType stringType = new StringType();
        stringType.setString(studentsLanding.getStudentsid());
        ReturnInformation returnInformation = this.findStudents(stringType);
        if (returnInformation.isKey()) {
            // 已经存在某一个学生使用该学号
            returnInformation = new ReturnInformation();
            returnInformation.setWhatYourDo("添加学生登陆信息");
            returnInformation.setWhy("已经存在某一个学生使用该学号,添加失败");
            returnInformation.setKey(false);
            return returnInformation;
        } else {
            // 没有某一个学生使用该学号
            returnInformation = new ReturnInformation();
            returnInformation.setWhatYourDo("添加学生登陆信息");
            int key = this.getStudentsLandingServiceImpl().insert(studentsLanding);
            if (key == 1) {
                returnInformation.setWhy("添加成功");
                returnInformation.setKey(true);
            } else {
                returnInformation.setWhy("添加失败");
                returnInformation.setKey(false);
            }
        }
        return returnInformation;
    }

    @ApiOperation(value = "删除学生信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation deleteStudent(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = this.findStudents(stringType);
        if (returnInformation.isKey()) {
            // 已经存在某一个学生使用该学号
            int key = this.getStudentsLandingServiceImpl().deleteByPrimaryKey(returnInformation.getNumber());
            returnInformation = new ReturnInformation();
            returnInformation.setWhatYourDo("删除学生信息");
            if (key == 1) {
                returnInformation.setWhy("删除成功");
                returnInformation.setKey(true);
            } else {
                returnInformation.setWhy("删除失败");
                returnInformation.setKey(false);
            }
            return returnInformation;
        } else {
            // 没有某一个学生使用该学号
            returnInformation = new ReturnInformation();
            returnInformation.setWhatYourDo("删除学生信息");
            returnInformation.setWhy("没有某一个学生使用该学号,修改失败");
            returnInformation.setKey(false);
        }
        return returnInformation;
    }

    @ApiOperation(value = "查看是否有学生信息")
    @RequestMapping(value = "findStudent", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation findStudents(@RequestBody StringType stringType) {
        return this.getStudentsLandingServiceImpl().findStudentByStudentID(stringType.getString());
    }

}