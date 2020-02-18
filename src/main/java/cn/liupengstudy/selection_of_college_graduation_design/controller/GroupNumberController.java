package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.GroupNumberTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.IntegerType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.StringType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.GroupNumberTableServiceImpl;
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
 * @创建时间 2020/1/17 - 11:54 下午
 * @修改人和其它信息
 */
@RestController
@RequestMapping("/groupNumber")
@Api(tags = "小组成员控制器", description = "提供小组成员的增删改查方法")
public class GroupNumberController {

    @Autowired
    private GroupNumberTableServiceImpl groupNumberTableServiceImpl;

    public GroupNumberTableServiceImpl getGroupNumberTableServiceImpl() {
        return groupNumberTableServiceImpl;
    }

    public void setGroupNumberTableServiceImpl(GroupNumberTableServiceImpl groupNumberTableServiceImpl) {
        this.groupNumberTableServiceImpl = groupNumberTableServiceImpl;
    }

    @ApiOperation(value = "添加小组成员信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation add(@RequestBody GroupNumberTable groupNumberTable) {
        StringType stringType = new StringType();
        stringType.setString(groupNumberTable.getStudentid());
        ReturnInformation returnInformation = this.findStudent(stringType);
        int has = 0;
        if (returnInformation.isKey()) {
            has = 1;
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("add group number information");
        if (has == 1) {
            returnInformation.setKey(false);
            returnInformation.setWhy("this student already in group number databases");
        } else {
            int key = this.getGroupNumberTableServiceImpl().insert(groupNumberTable);
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

    @ApiOperation(value = "删除小组成员信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation delete(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = this.findStudent(stringType);
        int has = 0;
        int id = -9;
        if (returnInformation.isKey()) {
            has = 1;
            List<GroupNumberTable> list = (List<GroupNumberTable>) returnInformation.getReturnObject();
            id = list.get(0).getId();
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("delete group number information");
        if (has == 1) {
            int key = this.getGroupNumberTableServiceImpl().deleteByPrimaryKey(id);
            if (key == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("delete success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("delete error");
            }
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("delete error");
        }
        return returnInformation;
    }

    @ApiOperation(value = "查找小组成员")
    @RequestMapping(value = "/getGroupInformation", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation getGroupInformation(@RequestBody IntegerType integerType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("find group information");
        List<GroupNumberTable> list = null;
        list = this.getGroupNumberTableServiceImpl().findAllGroupNumber(integerType.getInteger());
        if (list.size() == 0) {
            returnInformation.setKey(false);
            returnInformation.setWhy("no this student in group number databases");
        } else {
            returnInformation.setKey(true);
            returnInformation.setWhy("find success");
            returnInformation.setReturnObject(list);
        }
        return returnInformation;
    }

    @ApiOperation(value = "在小组成员表中查找学生信息")
    @RequestMapping(value = "/findBySstudentID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation findStudent(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("find student by studentID");
        List<GroupNumberTable> list = null;
        list = this.getGroupNumberTableServiceImpl().findStudent(stringType.getString());
        if (list.size() == 0) {
            returnInformation.setKey(false);
            returnInformation.setWhy("no this student in group number databases");
        } else {
            returnInformation.setKey(true);
            returnInformation.setWhy("find success");
            returnInformation.setReturnObject(list);
        }
        return returnInformation;
    }

    @ApiOperation(value = "在小组成员表中查找学生信息")
    @RequestMapping(value = "/findBySstudentID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation findGroupByStudentID(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("find Group by studentID");

        return returnInformation;
    }

}