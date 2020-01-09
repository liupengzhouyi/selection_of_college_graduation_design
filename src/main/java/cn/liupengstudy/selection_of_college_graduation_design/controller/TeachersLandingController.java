package cn.liupengstudy.selection_of_college_graduation_design.controller;

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

    @Autowired
    private TeachersLandingTableServiceImpl teachersLandingTableServiceImpl;

    public TeachersLandingTableServiceImpl getTeachersLandingTableServiceImpl() {
        return teachersLandingTableServiceImpl;
    }

    public void setTeachersLandingTableServiceImpl(TeachersLandingTableServiceImpl teachersLandingTableServiceImpl) {
        this.teachersLandingTableServiceImpl = teachersLandingTableServiceImpl;
    }

    /*@RequestMapping(value = "say")
    public String say() {
        return "String";
    }*/

    @ApiOperation(value = "添加教师登陆信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String addStudent(@RequestBody TeachersLandingTable teachersLandingTable) {
        int k = this.getTeachersLandingTableServiceImpl().insert(teachersLandingTable);
        if (k == 1) {
            return "success";
        } else {
            return "error";
        }
    }

}
