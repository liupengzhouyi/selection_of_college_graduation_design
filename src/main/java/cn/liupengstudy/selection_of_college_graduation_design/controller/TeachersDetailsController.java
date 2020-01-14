package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsDetailsTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.TeachersDetailsTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.StringType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.TeachersDetailsTableServiceImpl;
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
 * @创建时间 2020/1/14 - 9:49 下午
 * @修改人和其它信息
 */
@RestController
@RequestMapping("/teachersDetailsInformation")
@Api(tags = "教师详细信息控制器", description = "提供教师详细信息的增删改查方法")
public class TeachersDetailsController {

    @Autowired
    private TeachersDetailsTableServiceImpl teachersDetailsTableServiceImpl;

    public TeachersDetailsTableServiceImpl getTeachersDetailsTableServiceImpl() {
        return teachersDetailsTableServiceImpl;
    }

    public void setTeachersDetailsTableServiceImpl(TeachersDetailsTableServiceImpl teachersDetailsTableServiceImpl) {
        this.teachersDetailsTableServiceImpl = teachersDetailsTableServiceImpl;
    }

    /**
     * @描述  add teacher details information to databases
     * @参数  [teachersDetailsTable]
     * @返回值  cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/14 - 10:05 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "添加教师详细信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation add(@RequestBody TeachersDetailsTable teachersDetailsTable) {
        StringType stringType = new StringType();
        stringType.setString(teachersDetailsTable.getTeacherid());
        ReturnInformation returnInformation = this.findByTeahcerID(stringType);
        int has = 0;
        if (returnInformation.isKey()) {
            has = 1;
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("add teacher details information to databases");
        if (has == 1) {
            returnInformation.setKey(false);
            returnInformation.setWhy("add error,the same information in databases");
        } else {
            int key = this.getTeachersDetailsTableServiceImpl().insert(teachersDetailsTable);
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
     * @描述  delete teacher details information to databases
     * @参数  [stringType]
     * @返回值  cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/14 - 10:03 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "通过教师ID删除教师详细信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation deleteByID(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = this.findByTeahcerID(stringType);
        int has = 0;
        int id = -9;
        if (returnInformation.isKey()) {
            has = 1;
            id = returnInformation.getNumber();
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("delete teacher details information to databases");
        if (has == 0) {
            returnInformation.setKey(false);
            returnInformation.setWhy("delete error,no information in the databases");
        } else {
            int key = this.getTeachersDetailsTableServiceImpl().deleteByPrimaryKey(id);
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
     * @描述 update teacher details information to databases");
     * @参数  [teachersDetailsTable]
     * @返回值  cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/14 - 10:01 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "更新教师详细信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation update(@RequestBody TeachersDetailsTable teachersDetailsTable) {
        StringType stringType = new StringType();
        stringType.setString(teachersDetailsTable.getTeacherid());
        ReturnInformation returnInformation = this.findByTeahcerID(stringType);
        int has = 0;
        if (returnInformation.isKey()) {
            has = 1;
            teachersDetailsTable.setId(returnInformation.getNumber());
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("update teacher details information to databases");
        if (has == 0) {
            returnInformation.setKey(false);
            returnInformation.setWhy("update error, no information in databases");
        } else {
            int key = this.getTeachersDetailsTableServiceImpl().updateByPrimaryKey(teachersDetailsTable);
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
     * @描述  find teacher details information in databases by teacher number
     * @参数  [stringType]
     * @返回值  cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/14 - 9:56 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "通过教师编号查询详细信息")
    @RequestMapping(value = "/findByTeacherID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation findByTeahcerID(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("find teacher details information in databases by teacher number");
        List<TeachersDetailsTable> list = this.getTeachersDetailsTableServiceImpl().findByTeacherID(stringType.getString());
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
