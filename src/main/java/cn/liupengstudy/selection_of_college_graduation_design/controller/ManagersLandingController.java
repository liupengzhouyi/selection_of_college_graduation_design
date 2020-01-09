package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ManagersLandingTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLandingTable;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.ManagersLandingTableServiceImpl;
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
 * @创建时间 2020/1/10 - 12:39 上午
 * @修改人和其它信息
 */
@RestController
@RequestMapping("/managersLanding")
@Api(tags = "管理员登陆控制器", description = "提供管理员登陆控制器的增删改查方法")
public class ManagersLandingController {

    @Autowired
    private ManagersLandingTableServiceImpl managersLandingTableServiceImpl;

    public ManagersLandingTableServiceImpl getManagersLandingTableServiceImpl() {
        return managersLandingTableServiceImpl;
    }

    public void setManagersLandingTableServiceImpl(ManagersLandingTableServiceImpl managersLandingTableServiceImpl) {
        this.managersLandingTableServiceImpl = managersLandingTableServiceImpl;
    }

    /*@RequestMapping(value = "say")
    public String say() {
        return "Say";
    }*/

    @ApiOperation(value = "添加管理员登陆信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String addStudent(@RequestBody ManagersLandingTable managersLandingTable) {
        int k = this.getManagersLandingTableServiceImpl().insert(managersLandingTable);
        if (k == 1) {
            return "success";
        } else {
            return "error";
        }
    }

}
