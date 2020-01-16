package cn.liupengstudy.selection_of_college_graduation_design.controller;


import cn.liupengstudy.selection_of_college_graduation_design.pojo.SystemAnnouncementTable;
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

}
