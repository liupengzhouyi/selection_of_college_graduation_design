package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.GroupRelationshipTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.ChangeGroupName;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.GroupRelationshipInformation;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.IntegerType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.StringType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.GroupRelationshipTableServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.controller
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/17 - 10:22 下午
 * @修改人和其它信息
 */
@RestController
@RequestMapping("/groupRelationship")
@Api(tags = "小组关系控制器", description = "提供小组关系的增删改查方法")
public class GroupRelationshipController {

    @Autowired
    private GroupRelationshipTableServiceImpl groupRelationshipTableServiceImpl;

    /**
     * @描述  获取GroupRelationshipTableServiceImpl
     * @参数  []
     * @返回值  cn.liupengstudy.selection_of_college_graduation_design.service.impl.GroupRelationshipTableServiceImpl
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/17 - 10:33 下午
     * @修改人和其它信息
     */
    public GroupRelationshipTableServiceImpl getGroupRelationshipTableServiceImpl() {
        return groupRelationshipTableServiceImpl;
    }

    /**
     * @描述  设置GroupRelationshipTableServiceImpl
     * @参数  []
     * @返回值  cn.liupengstudy.selection_of_college_graduation_design.service.impl.GroupRelationshipTableServiceImpl
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/17 - 10:33 下午
     * @修改人和其它信息
     */
    public void setGroupRelationshipTableServiceImpl(GroupRelationshipTableServiceImpl groupRelationshipTableServiceImpl) {
        this.groupRelationshipTableServiceImpl = groupRelationshipTableServiceImpl;
    }

    @ApiOperation(value = "添加小组关系信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation add(@RequestBody GroupRelationshipTable groupRelationshipTable) {
        GroupRelationshipInformation groupRelationshipInformation = new GroupRelationshipInformation();
        groupRelationshipInformation.getGroupRelationshipInformationByGroupRelationshipTable(groupRelationshipTable);
        ReturnInformation returnInformation = this.findSameInformation(groupRelationshipInformation);
        int has = 0;
        if (returnInformation.isKey()) {
            has = 1;
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("add new group information");
        if (has == 1) {
            returnInformation.setKey(false);
            returnInformation.setWhy("add error,because the same information already save in databases");
        } else {
            int key = this.getGroupRelationshipTableServiceImpl().insert(groupRelationshipTable);
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

    @ApiOperation(value = "修改小组名称")
    @RequestMapping(value = "/changeName", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation changeName(@RequestBody ChangeGroupName changeGroupName) {
        GroupRelationshipInformation groupRelationshipInformation = new GroupRelationshipInformation();
        groupRelationshipInformation.getGroupRelationshipInformationByChangeGroupName(changeGroupName);
        ReturnInformation returnInformation = this.findSameInformation(groupRelationshipInformation);
        int has = 0;
        GroupRelationshipTable groupRelationshipTable = null;
        if (returnInformation.isKey()) {
            has = 1;
            groupRelationshipTable = (GroupRelationshipTable) returnInformation.getReturnObject();
            groupRelationshipTable.setGroupname(changeGroupName.getNewGroupName());
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("change group name");
        if (has == 1) {
            int key = this.getGroupRelationshipTableServiceImpl().updateByPrimaryKey(groupRelationshipTable);
            if (key == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("updata success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("update error");
            }
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("update error,no information in databases");
        }
        return returnInformation;
    }

    @ApiOperation(value = "删除小组信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation delete(@RequestBody GroupRelationshipInformation groupRelationshipInformation) {
        ReturnInformation returnInformation = this.findSameInformation(groupRelationshipInformation);
        int has = 0;
        int id = -9;
        if (returnInformation.isKey()) {
            has = 1;
            GroupRelationshipTable groupRelationshipTable = (GroupRelationshipTable) returnInformation.getReturnObject();
            id = groupRelationshipTable.getId();
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("delete group information");
        if (has == 1) {
            int key = this.getGroupRelationshipTableServiceImpl().deleteByPrimaryKey(id);
            if (key == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("delete success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("delete error");
            }
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("delete error, no data in databases");
        }
        return returnInformation;
    }

    @ApiOperation(value = "通过教师ID查找信息")
    @RequestMapping(value = "/findByTeacherID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation findByTeacherID(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = new ReturnInformation();
        List<GroupRelationshipTable> list = null;
        list = this.getGroupRelationshipTableServiceImpl().getGroupsByTeacherID(stringType.getString());
        if (list.size() == 0) {
            returnInformation.setKey(false);
            returnInformation.setWhy("find error");
        } else {
            returnInformation.setKey(true);
            returnInformation.setWhy("find success");
            returnInformation.setReturnObject(list);
        }
        return returnInformation;
    }

    @ApiOperation(value = "通过小组名称查找信息")
    @RequestMapping(value = "/findByGroupName", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation findByGroupName(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = new ReturnInformation();
        List<GroupRelationshipTable> list = null;
        list = this.getGroupRelationshipTableServiceImpl().getGroupsByGroupName(stringType.getString());
        if (list.size() == 0) {
            returnInformation.setKey(false);
            returnInformation.setWhy("find error");
        } else {
            returnInformation.setKey(true);
            returnInformation.setWhy("find success");
            returnInformation.setReturnObject(list);
        }
        return returnInformation;
    }

    @ApiOperation(value = "匹配相同信息信息")
    @RequestMapping(value = "/selectSameInformation", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation findSameInformation(@RequestBody GroupRelationshipInformation groupRelationshipInformation) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("find same information");
        GroupRelationshipTable groupRelationshipTable = null;
        groupRelationshipTable = this.getGroupRelationshipTableServiceImpl().select(groupRelationshipInformation);
        if (groupRelationshipTable == null) {
            returnInformation.setKey(false);
            returnInformation.setWhy("don't find same information");
        } else {
            returnInformation.setKey(true);
            returnInformation.setWhy("find same information");
            returnInformation.setReturnObject(groupRelationshipTable);
        }
        return returnInformation;
    }
}
