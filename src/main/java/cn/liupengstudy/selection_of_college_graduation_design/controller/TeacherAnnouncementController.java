package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.mapper.TeacherAnnouncementTableMapper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.TeacherAnnouncementTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.IntegerType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.StringType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.AbstractGenericHttpMessageConverter;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/teacherAnnouncement")
@Api(tags = "教师公告控制器", description = "提供教师公告的增删改查方法")
public class TeacherAnnouncementController {

    @Autowired
    private TeacherAnnouncementTableMapper teacherAnnouncementTableMapper;

    public TeacherAnnouncementTableMapper getTeacherAnnouncementTableMapper() {
        return teacherAnnouncementTableMapper;
    }

    public void setTeacherAnnouncementTableMapper(TeacherAnnouncementTableMapper teacherAnnouncementTableMapper) {
        this.teacherAnnouncementTableMapper = teacherAnnouncementTableMapper;
    }

    @ApiOperation(value = "添加教师公告信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation add(@RequestBody TeacherAnnouncementTable teacherAnnouncementTable) {
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        teacherAnnouncementTable.setDatetime(date);
        ReturnInformation returnInformation = new ReturnInformation();
        int key = this.getTeacherAnnouncementTableMapper().insert(teacherAnnouncementTable);
        if (key == 1) {
            returnInformation.setKey(true);
            returnInformation.setWhy("add success");
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("add error");
        }
        return returnInformation;
    }

    @ApiOperation(value = "删除教师公告信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation delete(@RequestBody IntegerType integerType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("delete teacher announcement information by id");
        int key = this.getTeacherAnnouncementTableMapper().deleteByPrimaryKey(integerType.getInteger());
        if (key == 1) {
            returnInformation.setKey(true);
            returnInformation.setWhy("delete success");
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("delete error");
        }
        return returnInformation;
    }

    @ApiOperation(value = "通过ID查找教师公告信息")
    @RequestMapping(value = "/selectByID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation selectByID(@RequestBody IntegerType integerType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("select teacher announcement information by id");
        TeacherAnnouncementTable teacherAnnouncementTable = this.getTeacherAnnouncementTableMapper().selectByPrimaryKey(integerType.getInteger());
        if (teacherAnnouncementTable != null) {
            returnInformation.setKey(true);
            returnInformation.setWhy("select success");
            returnInformation.setReturnObject(teacherAnnouncementTable);
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("select error");
        }
        return returnInformation;
    }

    @ApiOperation(value = "通过标题查找教师公告信息")
    @RequestMapping(value = "/findByTitle", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation findByTitle(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("select teacher announcement information by title");
        List<TeacherAnnouncementTable> list = null;
        list = this.getTeacherAnnouncementTableMapper().findByTitle(stringType.getString());
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


    @ApiOperation(value = "查找所有教师公告信息")
    @RequestMapping(value = "/getAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation getAll() {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("select all teacher announcement information");
        List<TeacherAnnouncementTable> list = null;
        list = this.getTeacherAnnouncementTableMapper().getAll();
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
