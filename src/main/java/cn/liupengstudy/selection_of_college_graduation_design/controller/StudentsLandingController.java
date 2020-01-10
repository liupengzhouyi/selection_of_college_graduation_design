package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLandingTable;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.StudentsLandingTableServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
     * @Description get students landing service
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
     * @Description set students landing service
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
     * @Description add student landing information
     * @Param [studentsLandingTable]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.ReturnInformation
     * @Date 1/10/2020 11:37 PM
     * @Author liupeng
     **/
    @ApiOperation(value = "添加学生登陆信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation addStudent(@RequestBody StudentsLandingTable studentsLandingTable) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("add student landing information");
        int k = this.getStudentsLandingTableServiceImpl().insert(studentsLandingTable);
        if (k == 1) {
            returnInformation.setWhy("add success");
            returnInformation.setKey(true);
        } else {
            returnInformation.setWhy("add error");
            returnInformation.setKey(false);
        }
        return returnInformation;
    }


}
