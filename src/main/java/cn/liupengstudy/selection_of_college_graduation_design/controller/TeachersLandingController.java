package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.StringType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLandingTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.TeachersLandingTable;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.TeachersLandingTableServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.controller
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/9 - 11:57 下午
 * @修改人和其它信息
 */
@RestController
@RequestMapping("/teachersLanding")
@Api(tags = "教师登陆控制器", description = "提供教师登陆控制器的增删改查方法")
public class TeachersLandingController {

    // teacher landing service
    @Autowired
    private TeachersLandingTableServiceImpl teachersLandingTableServiceImpl;

    /*
     * @Title getTeachersLandingTableServiceImpl
     * @Description //TODO get teacher landing service
     * @Param []
     * @return cn.liupengstudy.selection_of_college_graduation_design.service.impl.TeachersLandingTableServiceImpl
     * @Date 1/11/2020 1:44 AM
     * @Author liupeng
     **/
    public TeachersLandingTableServiceImpl getTeachersLandingTableServiceImpl() {
        return teachersLandingTableServiceImpl;
    }

    /*
     * @Title setTeachersLandingTableServiceImpl
     * @Description //TODO set teacher landing service
     * @Param [teachersLandingTableServiceImpl]
     * @return void
     * @Date 1/11/2020 1:44 AM
     * @Author liupeng
     **/
    public void setTeachersLandingTableServiceImpl(TeachersLandingTableServiceImpl teachersLandingTableServiceImpl) {
        this.teachersLandingTableServiceImpl = teachersLandingTableServiceImpl;
    }

    /*
     * @Title add
     * @Description //TODO add teacher landing information
     * @Param [teachersLandingTable]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.ReturnInformation
     * @Date 1/11/2020 1:39 AM
     * @Author liupeng
     **/
    @ApiOperation(value = "添加教师登陆信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation add(@RequestBody TeachersLandingTable teachersLandingTable) {
        StringType stringType = new StringType();
        stringType.setString(teachersLandingTable.getTeacherid());
        ReturnInformation returnInformation = this.findTeacher(stringType);
        int has = 0;
        if (returnInformation.isKey()) {
            has = 1;
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("add teacher landing information");
        if (has == 1) {
            returnInformation.setKey(false);
            returnInformation.setWhy("there is already has a teacher used this teacher id");
        } else {
            int k = this.getTeachersLandingTableServiceImpl().insert(teachersLandingTable);
            if (k == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("add success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("add error, because there is already has a teacher used this teacher id");
            }
        }
        return returnInformation;
    }

    /*
     * @Title delete
     * @Description //TODO delete teacher landing information
     * @Param [stringType]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.ReturnInformation
     * @Date 1/11/2020 1:55 AM
     * @Author liupeng
     **/
    @ApiOperation(value = "删除教师登陆信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation delete(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = this.findTeacher(stringType);
        int has = 0;
        int teacherID = returnInformation.getNumber();
        if (returnInformation.isKey()) {
            has = 1;
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("delete teacher landing information");
        if (has == 0) {
            returnInformation.setKey(false);
            returnInformation.setWhy("there is no teacher used this teacher id");
        } else {
            int k = this.getTeachersLandingTableServiceImpl().deleteByPrimaryKey(teacherID);
            if (k == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("delete success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("delete error");
            }
        }
        return returnInformation;
    }

    /*
     * @Title update
     * @Description //TODO update teacher landing information
     * @Param [teachersLandingTable]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.ReturnInformation
     * @Date 1/11/2020 2:07 AM
     * @Author liupeng
     **/
    @ApiOperation(value = "更新教师登陆信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation update(@RequestBody TeachersLandingTable teachersLandingTable) {
        StringType stringType = new StringType();
        stringType.setString(teachersLandingTable.getTeacherid());
        ReturnInformation returnInformation = this.findTeacher(stringType);
        int has = 0;
        if (returnInformation.isKey()) {
            has = 1;
            List<TeachersLandingTable> list = (List<TeachersLandingTable>) returnInformation.getReturnObject();
            teachersLandingTable.setId(list.get(0).getId());
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("update teacher landing information");
        if (has == 0) {
            returnInformation.setKey(false);
            returnInformation.setWhy("update error, because there is no teacher used this teacher id");
        } else {
            int k = this.getTeachersLandingTableServiceImpl().updateByPrimaryKey(teachersLandingTable);
            if (k == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("update success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("update error");
            }
        }
        return returnInformation;
    }

    /*
     * @Title findTeacher
     * @Description //TODO find student information in databases table by teacher id
     * @Param [stringType]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.ReturnInformation
     * @Date 1/11/2020 1:33 AM
     * @Author liupeng
     **/
    @ApiOperation(value = "寻找教师登陆信息")
    @RequestMapping(value = "/find", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation findTeacher(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = new ReturnInformation();
        List<TeachersLandingTable> list = this.getTeachersLandingTableServiceImpl().findTeachersLandingTableInformationByTeacherID(stringType.getString());
        returnInformation.setWhatYourDo("find student information in databases table by teacher id");
        if (list.size() == 1) {
            returnInformation.setWhy("there is a teacher using this school number");
            returnInformation.setKey(true);
            returnInformation.setNumber(list.get(0).getId());
        } else {
            returnInformation.setWhy("no teacher using this school number");
            returnInformation.setKey(false);
            returnInformation.setNumber(-1);
        }
        returnInformation.setReturnObject(list);
        return returnInformation;
    }

}
