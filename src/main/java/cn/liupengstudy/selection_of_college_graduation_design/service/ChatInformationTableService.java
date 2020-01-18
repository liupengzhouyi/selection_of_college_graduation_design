package cn.liupengstudy.selection_of_college_graduation_design.service;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ChatInformationTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/18 - 4:01 下午
 * @修改人和其它信息
 */
public interface ChatInformationTableService {

    int deleteByPrimaryKey(Integer id);

    int insert(ChatInformationTable record);

    int insertSelective(ChatInformationTable record);

    ChatInformationTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChatInformationTable record);

    int updateByPrimaryKey(ChatInformationTable record);

    List<ChatInformationTable> getGroupChatInformation(Integer groupID);

}
