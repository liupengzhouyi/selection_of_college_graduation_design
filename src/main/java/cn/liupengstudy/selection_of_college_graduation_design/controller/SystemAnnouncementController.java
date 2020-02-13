package cn.liupengstudy.selection_of_college_graduation_design.controller;


import cn.liupengstudy.selection_of_college_graduation_design.pojo.SystemAnnouncementTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.IntegerType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.StringType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.SystemAnnouncementTableServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/systemAnnouncement")
@Api(tags = "系统公告控制器", description = "提供系统公告的增删改查方法")
public class SystemAnnouncementController {

    @Autowired
    private SystemAnnouncementTableServiceImpl systemAnnouncementTableServiceImpl;

    public SystemAnnouncementTableServiceImpl getSystemAnnouncementTableServiceImpl() {
        return systemAnnouncementTableServiceImpl;
    }

    public void setSystemAnnouncementTableServiceImpl(SystemAnnouncementTableServiceImpl systemAnnouncementTableServiceImpl) {
        this.systemAnnouncementTableServiceImpl = systemAnnouncementTableServiceImpl;
    }

    @ApiOperation(value = "添加系统公告信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation add(@RequestBody SystemAnnouncementTable systemAnnouncementTable) {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        systemAnnouncementTable.setDatetime(date);
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("add system announcement information in databases");
        int key = this.getSystemAnnouncementTableServiceImpl().insert(systemAnnouncementTable);
        if (key == 1) {
            returnInformation.setKey(true);
            returnInformation.setWhy("add success");
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("add error");
        }
        return returnInformation;
    }

    @ApiOperation(value = "查询系统公告信息")
    @RequestMapping(value = "/select", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation selectByID(@RequestBody IntegerType integerType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("select system announcement information by id");
        SystemAnnouncementTable systemAnnouncementTable = this.getSystemAnnouncementTableServiceImpl().selectByPrimaryKey(integerType.getInteger());
        if (systemAnnouncementTable == null) {
            returnInformation.setKey(false);
            returnInformation.setWhy("select error");
        } else {
            returnInformation.setKey(true);
            returnInformation.setWhy("select success");
            returnInformation.setReturnObject(systemAnnouncementTable);
        }
        return returnInformation;
    }

    @ApiOperation(value = "删除系统公告信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation delete(@RequestBody IntegerType integerType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("delete system announcement information by id");
        SystemAnnouncementTable systemAnnouncementTable = this.getSystemAnnouncementTableServiceImpl().selectByPrimaryKey(integerType.getInteger());
        if (systemAnnouncementTable == null) {
            returnInformation.setKey(false);
        } else {
            int key = this.getSystemAnnouncementTableServiceImpl().deleteByPrimaryKey(integerType.getInteger());
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

    @ApiOperation(value = "查找系统公告信息")
    @RequestMapping(value = "/findByTitle", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation isPresence(@RequestBody StringType stringType) {
        List<SystemAnnouncementTable> list = null;
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("find system announcement information in databases by title");
        list = this.getSystemAnnouncementTableServiceImpl().isPresence(stringType.getString());
        if (list.size() != 0) {
            returnInformation.setKey(true);
            returnInformation.setWhy("find success");
            returnInformation.setReturnObject(list);
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("no information in databases");
        }
        return returnInformation;
    }


    @ApiOperation(value = "查找所有系统公告信息")
    @RequestMapping(value = "/getAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation getAll() {
        List<SystemAnnouncementTable> list = null;
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("find all system announcement information in databases");
        list = this.getSystemAnnouncementTableServiceImpl().getAll();
        if (list.size() != 0) {
            returnInformation.setKey(true);
            returnInformation.setWhy("find success");
            returnInformation.setReturnObject(list);
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("no information in databases");
        }
        return returnInformation;
    }

}
