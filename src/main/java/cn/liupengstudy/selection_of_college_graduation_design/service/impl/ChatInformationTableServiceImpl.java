package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.mapper.ChatInformationTableMapper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.ChatInformationTable;
import cn.liupengstudy.selection_of_college_graduation_design.service.ChatInformationTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service.impl
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/18 - 4:03 下午
 * @修改人和其它信息
 */
@Service
public class ChatInformationTableServiceImpl implements ChatInformationTableService {

    @Autowired
    private ChatInformationTableMapper chatInformationTableMapper;

    public ChatInformationTableMapper getChatInformationTableMapper() {
        return chatInformationTableMapper;
    }

    public void setChatInformationTableMapper(ChatInformationTableMapper chatInformationTableMapper) {
        this.chatInformationTableMapper = chatInformationTableMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(ChatInformationTable record) {
        return this.getChatInformationTableMapper().insert(record);
    }

    @Override
    public int insertSelective(ChatInformationTable record) {
        return this.getChatInformationTableMapper().insertSelective(record);
    }

    @Override
    public ChatInformationTable selectByPrimaryKey(Integer id) {
        return this.getChatInformationTableMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ChatInformationTable record) {
        return this.getChatInformationTableMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ChatInformationTable record) {
        return this.getChatInformationTableMapper().updateByPrimaryKey(record);
    }

    @Override
    public List<ChatInformationTable> getGroupChatInformation(Integer groupID) {
        return this.getChatInformationTableMapper().getGroupChatInformation(groupID);
    }
}
