package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.GroupNumberTable;

public interface GroupNumberTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GroupNumberTable record);

    int insertSelective(GroupNumberTable record);

    GroupNumberTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GroupNumberTable record);

    int updateByPrimaryKey(GroupNumberTable record);
}