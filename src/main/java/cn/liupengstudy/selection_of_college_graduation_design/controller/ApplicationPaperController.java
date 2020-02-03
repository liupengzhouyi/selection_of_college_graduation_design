package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ApplicationPaperTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.ApplicationPaperItem;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.IntegerType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.StringType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.ApplicationPaperServiceImpl;
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
 * @创建时间 2020/1/21 - 1:32 下午
 * @修改人和其它信息
 */
@RestController
@RequestMapping("/applicationPaper")
@Api(tags = "论文申请控制器", description = "小组聊天信息的增删改查方法")
public class ApplicationPaperController {

    @Autowired
    private ApplicationPaperServiceImpl applicationPaperService;

    public ApplicationPaperServiceImpl getApplicationPaperService() {
        return applicationPaperService;
    }

    public void setApplicationPaperService(ApplicationPaperServiceImpl applicationPaperService) {
        this.applicationPaperService = applicationPaperService;
    }

    /**
     * @描述  add application paper
     * @参数  [applicationPaperTable]
     * @返回值  cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/21 - 7:10 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "添加论文题目申请信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation add(@RequestBody ApplicationPaperTable applicationPaperTable) {
        ReturnInformation returnInformation = this.findSame(applicationPaperTable);
        if (returnInformation.isKey()) {
            returnInformation = new ReturnInformation();
            returnInformation.setWhatYourDo("add application paper");
            returnInformation.setKey(false);
            returnInformation.setWhy("already has the same information in databases");
        } else {
            returnInformation = new ReturnInformation();
            returnInformation.setWhatYourDo("add application paper");
            int key = this.getApplicationPaperService().insert(applicationPaperTable);
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
     * @描述  delete information by ID
     * @参数  [integerType]
     * @返回值  cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/21 - 7:09 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "通过ID删除论文题目申请信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation delete(@RequestBody IntegerType integerType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("delete information by ID");
        int key = this.getApplicationPaperService().deleteByPrimaryKey(integerType.getInteger());
        if (key == 1) {
            returnInformation.setKey(true);
            returnInformation.setWhy("delete success");
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("delete error");
        }
        return returnInformation;
    }

    /**
     * @描述  get all student application paper information
     * @参数  [stringType]
     * @返回值  cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/21 - 6:45 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "通过学生ID查询论文题目申请信息")
    @RequestMapping(value = "/getStudentAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation getStudentAll(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("find student all information");
        List<ApplicationPaperTable> list = null;
        list = this.getApplicationPaperService().getStudentAll(stringType.getString());
        if (list.size() == 0) {
            returnInformation.setKey(false);
            returnInformation.setWhy("no information");
        } else {
            returnInformation.setKey(true);
            returnInformation.setWhy("find success");
            returnInformation.setReturnObject(list);
        }
        return returnInformation;
    }

    @ApiOperation(value = "通过ID设置申请通过论文题目申请信息")
    @RequestMapping(value = "/passById", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation passById(@RequestBody IntegerType integerType) {
        ReturnInformation returnInformation = this.findByID(integerType);
        int has = 0;
        if (returnInformation.isKey()) {
            has = 1;
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("find same information");
        if (has == 1) {
            int key = this.getApplicationPaperService().pass(integerType.getInteger());
            if (key == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("pass success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("pass error");
            }
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("not has information");
        }
        return returnInformation;
    }

    @ApiOperation(value = "通过ID设置申请不通过论文题目申请信息")
    @RequestMapping(value = "/norPassById", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation notPassByID(@RequestBody IntegerType integerType) {
        ReturnInformation returnInformation = this.findByID(integerType);
        int has = 0;
        if (returnInformation.isKey()) {
            has = 1;
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("find same information");
        if (has == 1) {
            int key = this.getApplicationPaperService().notPass(integerType.getInteger());
            if (key == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("not pass success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("not pass error");
            }
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("not has information");
        }
        return returnInformation;
    }

    @ApiOperation(value = "通过查找论文题目申请信息")
    @RequestMapping(value = "/findByID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation findByID(@RequestBody IntegerType integerType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("find same information");
        ApplicationPaperTable temp = this.getApplicationPaperService().selectByPrimaryKey(integerType.getInteger());
        if (temp != null) {
            returnInformation.setKey(true);
            returnInformation.setWhy("find success");
            returnInformation.setReturnObject(temp);
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("not find");
        }
        return returnInformation;
    }

    @ApiOperation(value = "查找论文题目申请信息")
    @RequestMapping(value = "/findSame", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation findSame(@RequestBody ApplicationPaperTable applicationPaperTable) {
        ApplicationPaperItem applicationPaperItem = new ApplicationPaperItem();
        applicationPaperItem.setByApplicationPaper(applicationPaperTable);
        ApplicationPaperTable temp = this.getApplicationPaperService().findSame(applicationPaperItem);
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("find same information");
        if (temp != null) {
            returnInformation.setKey(true);
            returnInformation.setWhy("find success");
            returnInformation.setReturnObject(temp);
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("not find");
        }
        return returnInformation;
    }

}
