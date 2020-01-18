package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ChatInformationTable;

public interface ChatInformationTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChatInformationTable record);

    int insertSelective(ChatInformationTable record);

    ChatInformationTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ChatInformationTable record);

    int updateByPrimaryKey(ChatInformationTable record);
}