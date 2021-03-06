package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ManagersLandingTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.StringType;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.ManagersLandingTableServiceImpl;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.checkPassword.ManagerCheckPassword;
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

    /*
     * @Title addStudent
     * @Description //TODO add manager landing information
     * @Param [managersLandingTable]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @Date 1/11/2020 3:48 PM
     * @Author liupeng
     **/
    @ApiOperation(value = "添加管理员登陆信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation addStudent(@RequestBody ManagersLandingTable managersLandingTable) {
        StringType stringType = new StringType();
        stringType.setString(managersLandingTable.getManagerid());
        ReturnInformation returnInformation = this.fingManager(stringType);
        int has = -9;
        if (returnInformation.isKey()) {
            has = 1;
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("add manager landing information");
        if (has == 1) { // has this manager in databases
            returnInformation.setKey(false);
            returnInformation.setWhy("add error, because this manager landing information has already in databases");
        } else { // not has this manager in databases
            int k = this.getManagersLandingTableServiceImpl().insert(managersLandingTable);
            if (k == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("add success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("add error");
            }
        }
        return returnInformation;
    }

    /*
     * @Title delete
     * @Description //TODO delete manager landing information by manager id
     * @Param [stringType]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @Date 1/11/2020 4:16 PM
     * @Author liupeng
     **/
    @ApiOperation(value = "通过管理员ID删除管理员登陆信息")
    @RequestMapping(value = "delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation delete(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = this.fingManager(stringType);
        int has = -9;
        int id = -1;
        if (returnInformation.isKey()) {
            has = 1;
            id = returnInformation.getNumber();
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("delete manager landing information by manager id");
        if (has == 1) {
            int key = this.getManagersLandingTableServiceImpl().deleteByPrimaryKey(id);
            if (key == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("delete success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("delete error");
            }
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("delete error, no information in databbases");
        }
        return returnInformation;
    }

    /*
     * @Title update
     * @Description //TODO update manager landing information
     * @Param [managersLandingTable]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @Date 1/11/2020 5:03 PM
     * @Author liupeng
     **/
    @ApiOperation(value = "更新管理员登陆信息")
    @RequestMapping(value = "update", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation update(@RequestBody ManagersLandingTable managersLandingTable) {
        StringType stringType = new StringType();
        stringType.setString(managersLandingTable.getManagerid());
        ReturnInformation returnInformation = this.fingManager(stringType);
        int id = -9;
        if (returnInformation.isKey()) {
            id = returnInformation.getNumber();
            managersLandingTable.setId(id);
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("update manager landing information");
        if (id != -9) {
            int key = this.getManagersLandingTableServiceImpl().updateByPrimaryKey(managersLandingTable);
            if (key == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("update success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("update error");
            }
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("update error, because there is no manager landing information in databases.");
        }
        return returnInformation;
    }

    /*
     * @Title landing
     * @Description //TODO check manager landing
     * @Param [managersLandingTable]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @Date 1/11/2020 5:18 PM
     * @Author liupeng
     **/
    @ApiOperation(value = "校验管理员登陆信息")
    @RequestMapping(value = "/landing", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation landing(@RequestBody ManagersLandingTable managersLandingTable) {
        List<ManagersLandingTable> list = null;
        StringType stringType = new StringType();
        stringType.setString(managersLandingTable.getManagerid());
        ReturnInformation returnInformation = this.fingManager(stringType);
        int key = 0;
        if (returnInformation.isKey()) {
            key = 1;
            // 获取密码值
            list = (List<ManagersLandingTable>) returnInformation.getReturnObject();
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("manager landing");
        if (key == 1) {
            // 查找操作
            ManagerCheckPassword managerCheckPassword = new ManagerCheckPassword(list.get(0), managersLandingTable);
            int k = managerCheckPassword.check();
            if (k == 1) {
                returnInformation.setWhy("landing success");
                returnInformation.setKey(true);
            } else {
                returnInformation.setWhy("landing error, manager id or password error");
                returnInformation.setKey(false);
            }
        } else {
            returnInformation.setWhy("landing error, no manager who uses this manager id to register.");
            returnInformation.setKey(false);
        }
        return returnInformation;
    }


    /*
     * @Title fingManager
     * @Description //TODO find manager landing information
     * @Param [stringType]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @Date 1/11/2020 3:28 PM
     * @Author liupeng
     **/
    @ApiOperation(value = "查找管理员登陆信息")
    @RequestMapping(value = "/find", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation fingManager(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("find manager landing information");
        List<ManagersLandingTable> list = this.getManagersLandingTableServiceImpl().findManagersLandingTableInformationByManager(stringType.getString());
        if (list.size() == 0) {
            returnInformation.setNumber(-1);
            returnInformation.setKey(false);
            returnInformation.setWhy("find error, beacuse there is no manager information in databases");
        } else {
            returnInformation.setNumber(list.get(0).getId());
            returnInformation.setKey(true);
            returnInformation.setReturnObject(list);
            returnInformation.setWhy("find success, find manager information in databases");
        }
        return returnInformation;
    }

}
