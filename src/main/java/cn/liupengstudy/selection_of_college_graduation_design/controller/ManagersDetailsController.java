package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ManagersDetailsTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsDetailsTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.StringType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.ManagersDetailsTableMapperServiceImpl;
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
 * @创建时间 2020/1/14 - 10:54 下午
 * @修改人和其它信息
 */
@RestController
@RequestMapping("/managersDetailsInformation")
@Api(tags = "管理员详细信息控制器", description = "提供管理员详细信息的增删改查方法")
public class ManagersDetailsController {

    @Autowired
    private ManagersDetailsTableMapperServiceImpl managersDetailsTableMapperServiceImpl;

    public ManagersDetailsTableMapperServiceImpl getManagersDetailsTableMapperServiceImpl() {
        return managersDetailsTableMapperServiceImpl;
    }

    public void setManagersDetailsTableMapperServiceImpl(ManagersDetailsTableMapperServiceImpl managersDetailsTableMapperServiceImpl) {
        this.managersDetailsTableMapperServiceImpl = managersDetailsTableMapperServiceImpl;
    }

    /**
     * @描述  add manager details information to databases
     * @参数  [managersDetailsTable]
     * @返回值  cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/14 - 11:06 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "添加学生详细信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation add(@RequestBody ManagersDetailsTable managersDetailsTable) {
        StringType stringType = new StringType();
        stringType.setString(managersDetailsTable.getManagerid());
        ReturnInformation returnInformation = this.findByStudentID(stringType);
        int has = 0;
        if (returnInformation.isKey()) {
            has = 1;
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("add manager details information to databases");
        if (has == 1) {
            returnInformation.setKey(false);
            returnInformation.setWhy("add error,the same information in databases");
        } else {
            int key = this.getManagersDetailsTableMapperServiceImpl().insert(managersDetailsTable);
            if (key == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("add success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("add error");
            }
        }
        return returnInformation;
    }

    /**
     * @描述  delete manager details information to databases
     * @参数  [stringType]
     * @返回值  cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/14 - 11:05 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "通过管理员ID删除学生详细信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation deleteByID(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = this.findByStudentID(stringType);
        int has = 0;
        int id = -9;
        if (returnInformation.isKey()) {
            has = 1;
            id = returnInformation.getNumber();
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("delete manager details information to databases");
        if (has == 0) {
            returnInformation.setKey(false);
            returnInformation.setWhy("delete error,no information in the databases");
        } else {
            int key = this.getManagersDetailsTableMapperServiceImpl().deleteByPrimaryKey(id);
            if (key == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("delete success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("delete error");
            }
        }
        return returnInformation;
    }

    /**
     * @描述  update manager details information to databases
     * @参数  [managersDetailsTable]
     * @返回值  cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/14 - 11:04 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "更新管理员详细信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation update(@RequestBody ManagersDetailsTable managersDetailsTable) {
        StringType stringType = new StringType();
        stringType.setString(managersDetailsTable.getManagerid());
        ReturnInformation returnInformation = this.findByStudentID(stringType);
        int has = 0;
        if (returnInformation.isKey()) {
            has = 1;
            managersDetailsTable.setId(returnInformation.getNumber());
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("update manager details information to databases");
        if (has == 0) {
            returnInformation.setKey(false);
            returnInformation.setWhy("update error, no information in databases");
        } else {
            int key = this.getManagersDetailsTableMapperServiceImpl().updateByPrimaryKey(managersDetailsTable);
            if (key == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("update success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("update error");
            }
        }
        return returnInformation;
    }

    /**
     * @描述  find manager details information in databases by student number
     * @参数  [stringType]
     * @返回值  cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/14 - 10:58 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "通过管理员ID详细信息")
    @RequestMapping(value = "/findByManagerID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation findByStudentID(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("find manager details information in databases by student number");
        List<ManagersDetailsTable> list = this.getManagersDetailsTableMapperServiceImpl().findByManagerID(stringType.getString());
        if (list.size() == 0) {
            returnInformation.setKey(false);
            returnInformation.setWhy("find error");
            returnInformation.setNumber(-9);
        } else {
            returnInformation.setKey(true);
            returnInformation.setNumber(list.get(0).getId());
            returnInformation.setWhy("find success");
            returnInformation.setReturnObject(list);
        }
        return returnInformation;
    }

}
