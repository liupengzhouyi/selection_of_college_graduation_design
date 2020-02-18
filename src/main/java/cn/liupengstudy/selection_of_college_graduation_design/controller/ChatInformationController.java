package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.CharInformationVersionII;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.ChatInformationTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.IntegerType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.getNowTime.GetNowDate;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.getNowTime.GetNowTime;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.ChatInformationTableServiceImpl;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.GetChatInformation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.bytebuddy.asm.Advice;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.controller
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/18 - 4:20 下午
 * @修改人和其它信息
 */
@RestController
@RequestMapping("/groupChat")
@Api(tags = "小组聊天信息控制器", description = "小组聊天信息的增删改查方法")
public class ChatInformationController {

    @Autowired
    private ChatInformationTableServiceImpl chatInformationTableServiceImpl;

    public ChatInformationTableServiceImpl getChatInformationTableServiceImpl() {
        return chatInformationTableServiceImpl;
    }

    public void setChatInformationTableServiceImpl(ChatInformationTableServiceImpl chatInformationTableServiceImpl) {
        this.chatInformationTableServiceImpl = chatInformationTableServiceImpl;
    }

    @ApiOperation(value = "添加聊天信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation add(@RequestBody ChatInformationTable chatInformationTable) {
        GetNowDate getNowDate = new GetNowDate();
        Date date = getNowDate.strToDate(getNowDate.getInformation());
        GetNowTime getNowTime = new GetNowTime();
        Time time = getNowTime.strToTime(getNowTime.getInformation());
        chatInformationTable.setDate(date);
        chatInformationTable.setTime(time);
        System.out.println(date);
        System.out.println(time);
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("add chat information");
        int key = this.getChatInformationTableServiceImpl().insert(chatInformationTable);
        if (key == 1) {
            returnInformation.setKey(true);
            returnInformation.setWhy("add success");
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("add error");
        }
        return returnInformation;
    }

    @ApiOperation(value = "获取聊天信息")
    @RequestMapping(value = "/getGroupInformation", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation getGroupChatInformation(@RequestBody IntegerType integerType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("add chat information");
        List<ChatInformationTable> list = null;
        list = this.getChatInformationTableServiceImpl().getGroupChatInformation(integerType.getInteger());
        if (list.size() != 0) {
            returnInformation.setKey(true);
            returnInformation.setWhy("find success");
            returnInformation.setReturnObject(list);
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("find error");
        }
        return returnInformation;
    }

    @ApiOperation(value = "获取聊天信息二代")
    @RequestMapping(value = "/getGroupInformationII", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation getGroupChatInformationVersionII(@RequestBody IntegerType integerType) throws SQLException {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("add chat information");
        List<CharInformationVersionII> list = null;
        list = new GetChatInformation(integerType.getInteger()).getList();
        if (list.size() != 0) {
            returnInformation.setKey(true);
            returnInformation.setWhy("find success");
            returnInformation.setReturnObject(list);
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("find error");
        }
        return returnInformation;
    }

}
