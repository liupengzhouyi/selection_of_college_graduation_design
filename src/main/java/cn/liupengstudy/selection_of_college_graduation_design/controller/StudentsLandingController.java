package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.StringType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLandingTable;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.StudentsLandingTableServiceImpl;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.checkPassword.StudentCheckPassword;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.controller
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/9 - 11:57 下午
 * @修改人和其它信息
 */

@RestController
@RequestMapping("/studentsLanding")
@Api(tags = "学生登陆控制器", description = "提供学生登陆控制器的增删改查方法")
public class StudentsLandingController {

    // service
    @Autowired
    private StudentsLandingTableServiceImpl studentsLandingTableServiceImpl;

    /*
     * @Title getStudentsLandingTableServiceImpl
     * @Description //TODO get students landing service
     * @Param []
     * @return cn.liupengstudy.selection_of_college_graduation_design.service.impl.StudentsLandingTableServiceImpl
     * @Date 1/10/2020 11:27 PM
     * @Author liupeng
     **/
    public StudentsLandingTableServiceImpl getStudentsLandingTableServiceImpl() {
        return studentsLandingTableServiceImpl;
    }

    /*
     * @Title setStudentsLandingTableServiceImpl
     * @Description //TODO set students landing service
     * @Param [studentsLandingTableServiceImpl]
     * @return void
     * @Date 1/10/2020 11:28 PM
     * @Author liupeng
     **/
    public void setStudentsLandingTableServiceImpl(StudentsLandingTableServiceImpl studentsLandingTableServiceImpl) {
        this.studentsLandingTableServiceImpl = studentsLandingTableServiceImpl;
    }

    /*
     * @Title addStudent
     * @Description //TODO add student landing information
     * @Param [studentsLandingTable]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @Date 1/10/2020 11:37 PM
     * @Author liupeng
     **/
    @ApiOperation(value = "添加学生登陆信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation addStudent(@RequestBody StudentsLandingTable studentsLandingTable) {
        StringType stringType = new StringType();
        stringType.setString(studentsLandingTable.getStudentsid());
        ReturnInformation returnInformation = this.findStudent(stringType);
        int key = 0;
        if (returnInformation.isKey()) {
            key = 1;
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("add student landing information");
        if (key == 1) {
            int k = this.getStudentsLandingTableServiceImpl().insert(studentsLandingTable);
            if (k == 1) {
                returnInformation.setWhy("add success");
                returnInformation.setKey(true);
            } else {
                returnInformation.setWhy("add error");
                returnInformation.setKey(false);
            }
        } else {
            returnInformation.setWhy("add error, because there's already have a student who uses this school number to register.");
            returnInformation.setKey(false);
        }

        return returnInformation;
    }

    /*
     * @Title delete
     * @Description //TODO delete student landing information by student school number
     * @Param [stringType]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @Date 1/11/2020 1:01 AM
     * @Author liupeng
     **/
    @ApiOperation(value = "删除学生登陆信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation delete(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = this.findStudent(stringType);
        int id = -9;
        if (returnInformation.isKey()) {
            id = returnInformation.getNumber();
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("delete student landing information by student school number");
        if (id != -9) {
            int key = this.getStudentsLandingTableServiceImpl().deleteByPrimaryKey(id);
            if (key == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("delete success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("delete error");
            }
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("delete error, because no student ueing this school number.");
        }
        return returnInformation;
    }

    /*
     * @Title update
     * @Description //TODO update student landing information
     * @Param [studentsLandingTable]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @Date 1/11/2020 1:12 AM
     * @Author liupeng
     **/
    @ApiOperation(value = "更新学生登陆信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation update(@RequestBody StudentsLandingTable studentsLandingTable) {
        StringType stringType = new StringType();
        stringType.setString(studentsLandingTable.getStudentsid());
        ReturnInformation returnInformation = this.findStudent(stringType);
        int id = -9;
        if (returnInformation.isKey()) {
            id = returnInformation.getNumber();
            studentsLandingTable.setId(id);
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("update student landing information");
        if (id != -9) {
            int key = this.getStudentsLandingTableServiceImpl().updateByPrimaryKey(studentsLandingTable);
            if (key == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("update success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("update error");
            }
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("update error, because there is no student landing information in databases.");
        }
        return returnInformation;
    }

    /*
     * @Title landing
     * @Description //TODO check student landing information
     * @Param [studentsLandingTable]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @Date 1/11/2020 12:24 AM
     * @Author liupeng
     **/
    @ApiOperation(value = "校验学生登陆信息")
    @RequestMapping(value = "/landing", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation landing(@RequestBody StudentsLandingTable studentsLandingTable) {
        List<StudentsLandingTable> list = null;
        StringType stringType = new StringType();
        stringType.setString(studentsLandingTable.getStudentsid());
        ReturnInformation returnInformation = this.findStudent(stringType);
        // System.out.println("returnInformation:" + returnInformation.toString());
        int key = 0;
        if (returnInformation.isKey()) {
            key = 1;
            // 获取密码值
            list = (List<StudentsLandingTable>) returnInformation.getReturnObject();
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("student landing");
        if (key == 1) {
            // 查找操作
            StudentCheckPassword studentCheckPassword = new StudentCheckPassword(list.get(0), studentsLandingTable);
            int k = studentCheckPassword.check();
            if (k == 1) {
                returnInformation.setWhy("landing success");
                returnInformation.setKey(true);
            } else {
                returnInformation.setWhy("landing error, school number or password error");
                returnInformation.setKey(false);
            }
        } else {
            returnInformation.setWhy("landing error, no student who uses this school number to register.");
            returnInformation.setKey(false);
        }
        return returnInformation;
    }


    /*
     * @Title findStudent
     * @Description //TODO find student information in databases table by student id
     * @Param [stringType]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @Date 1/10/2020 11:41 PM
     * @Author liupeng
     **/
    @ApiOperation(value = "寻找学生登陆信息")
    @RequestMapping(value = "/find", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation findStudent(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = new ReturnInformation();
        List<StudentsLandingTable> list = this.getStudentsLandingTableServiceImpl().findStudentLandingInformationByStudentID(stringType.getString());
        returnInformation.setWhatYourDo("find student information in databases table by student id");
        if (list.size() == 1) {
            returnInformation.setWhy("there is a student using this school number");
            returnInformation.setKey(true);
            returnInformation.setNumber(list.get(0).getId());
        } else {
            returnInformation.setWhy("no student using this school number");
            returnInformation.setKey(false);
            returnInformation.setNumber(-1);
        }
        returnInformation.setReturnObject(list);
        return returnInformation;
    }


}
