package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.PaperTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.GetYearsForFindPaper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.IntegerType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.StringType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.YearTpyeForFindPaper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.getNowTime.GetNowDate;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.PaperTableServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.controller
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/20 - 1:51 上午
 * @修改人和其它信息
 */
@RestController
@RequestMapping("/paper")
@Api(tags = "论文控制器", description = "提供论文的增删改查方法")
public class PaperTableController {

    @Autowired
    private PaperTableServiceImpl paperTableService;

    public PaperTableServiceImpl getPaperTableService() {
        return paperTableService;
    }

    public void setPaperTableService(PaperTableServiceImpl paperTableService) {
        this.paperTableService = paperTableService;
    }

    @ApiOperation(value = "添加论文信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation add(@RequestBody PaperTable paperTable) {
        GetNowDate getNowDate = new GetNowDate();
        Date date = getNowDate.strToDate(getNowDate.getInformation());
        paperTable.setReleasedate(date);
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("add paper");
        int key = this.getPaperTableService().insert(paperTable);
        if (key == 1) {
            returnInformation.setKey(true);
            returnInformation.setWhy("add success");
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("add error");
        }
        return returnInformation;
    }

    @ApiOperation(value = "删除论文信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation deleteByID(@RequestBody IntegerType integerType) {
        ReturnInformation returnInformation = this.selectByID(integerType);
        if (returnInformation.isKey()) {
            returnInformation = new ReturnInformation();
            returnInformation.setWhatYourDo("delete paper");
            int key = this.getPaperTableService().deleteByPrimaryKey(integerType.getInteger());
            if (key == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("delete success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("delete error");
            }
        } else {
            returnInformation = new ReturnInformation();
            returnInformation.setWhatYourDo("delete paper");
            returnInformation.setKey(false);
            returnInformation.setWhy("delete error,no information in databases");
        }

        return returnInformation;
    }

    @ApiOperation(value = "通过论文ID查找论文信息")
    @RequestMapping(value = "/selectByID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation selectByID(@RequestBody IntegerType integerType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("delete paper");
        PaperTable paperTable = this.getPaperTableService().selectByPrimaryKey(integerType.getInteger());
        if (paperTable == null) {
            returnInformation.setKey(false);
            returnInformation.setWhy("select error");
        } else {
            returnInformation.setKey(true);
            returnInformation.setWhy("select success");
            returnInformation.setReturnObject(paperTable);
        }
        return returnInformation;
    }

    @ApiOperation(value = "通过教师ID查找论文信息")
    @RequestMapping(value = "/selectByTeacherID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation selectByTeacherID(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("select paper by teacher id");
        List<PaperTable> list = this.getPaperTableService().getTeacherAllPaper(stringType.getString());
        if (list.size() == 0) {
            returnInformation.setKey(false);
            returnInformation.setWhy("no paper information");
        } else {
            returnInformation.setKey(true);
            returnInformation.setWhy("select success");
            returnInformation.setReturnObject(list);
        }
        return returnInformation;
    }

    @ApiOperation(value = "通过时间查找论文信息")
    @RequestMapping(value = "/selectByYear", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation selectByYear(@RequestBody IntegerType integerType) {
        YearTpyeForFindPaper yearTpyeForFindPaper = new YearTpyeForFindPaper();
        yearTpyeForFindPaper.setYear(integerType.getInteger());
        GetYearsForFindPaper getYearsForFindPaper = new GetYearsForFindPaper(yearTpyeForFindPaper);
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("select Paper By Year");
        List<PaperTable> list = this.getPaperTableService().getOneYearAllPaper(getYearsForFindPaper.getBeginYear(), getYearsForFindPaper.getEndYear());
        if (list.size() == 0) {
            returnInformation.setKey(false);
            returnInformation.setWhy("no paper information");
        } else {
            returnInformation.setKey(true);
            returnInformation.setWhy("select success");
            returnInformation.setReturnObject(list);
        }
        return returnInformation;
    }

    @ApiOperation(value = "查找所有论文信息")
    @RequestMapping(value = "/selectAll", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation selectByYear() {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("select Paper");
        List<PaperTable> list = this.getPaperTableService().getAllPaper();
        if (list.size() == 0) {
            returnInformation.setKey(false);
            returnInformation.setWhy("no paper information");
        } else {
            returnInformation.setKey(true);
            returnInformation.setWhy("select success");
            returnInformation.setReturnObject(list);
        }
        return returnInformation;
    }

    @ApiOperation(value = "通过论文ID设置改论文已经被申请")
    @RequestMapping(value = "/passByID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation passByID(@RequestBody IntegerType integerType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("pass Paper by id");
        int key = this.getPaperTableService().passByID(integerType.getInteger());
        if (key == 1) {
            returnInformation.setKey(true);
            returnInformation.setWhy("pass success");
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("pass error");
        }
        return returnInformation;
    }
}
