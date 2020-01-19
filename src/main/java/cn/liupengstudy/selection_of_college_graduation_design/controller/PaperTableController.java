package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.PaperTable;
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


}
