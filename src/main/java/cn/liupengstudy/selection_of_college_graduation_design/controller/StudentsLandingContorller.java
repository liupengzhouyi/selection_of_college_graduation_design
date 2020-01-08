package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.IntegerType;
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
    @ApiOperation(value = "用户登陆是否成功")
    @RequestMapping(value = "/landing", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String landing(@RequestBody StudentsLanding studentsLanding) {
        String returnInformation = "";
        StudentsLanding studentsLanding1 = this.getStudentsLandingServiceImpl().selectByPrimaryKey(studentsLanding.getId());
        if (studentsLanding1.getPasswordvalue() == studentsLanding.getPasswordvalue()) {
            returnInformation = "success";
        } else {
            returnInformation = "error";
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
    @RequestMapping(value = "update", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String changePassword(@RequestBody StudentsLanding studentsLanding) {
        String returnInformation = "";
        int key = this.getStudentsLandingServiceImpl().updateByPrimaryKey(studentsLanding);
        System.out.println("key:" + key);
        if (key == 1) {
            returnInformation = "success";
        } else {
            returnInformation = "error";
        }
        return returnInformation;
    }

    @ApiOperation(value = "添加学生登陆信息")
    @RequestMapping(value = "add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String addStudent(@RequestBody StudentsLanding studentsLanding) {
        String returnInformation = "";
        int key = this.getStudentsLandingServiceImpl().insert(studentsLanding);
        System.out.println("key:" + key);
        if (key == 1) {
            returnInformation = "success";
        } else {
            returnInformation = "error";
        }
        return returnInformation;
    }

    @ApiOperation(value = "删除学生信息")
    @RequestMapping(value = "delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String deleteStudent(@RequestBody IntegerType integerType) {
        String returnInformation = "";
        int key = this.getStudentsLandingServiceImpl().deleteByPrimaryKey(integerType.getInteger());
        System.out.println("key:" + key);
        if (key == 1) {
            returnInformation = "success";
        } else {
            returnInformation = "error";
        }
        return returnInformation;
    }

    @ApiOperation(value = "查看是否有学生信息")
    @RequestMapping(value = "findStudent", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String findStudents(@RequestBody StringType stringType) {
        int key = this.getStudentsLandingServiceImpl().findStudentByStudentID(stringType.getString());
        System.out.println("Key:   " + key);
        return "" + key;
    }

}