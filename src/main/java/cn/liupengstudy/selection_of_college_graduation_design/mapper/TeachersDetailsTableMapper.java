package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.TeachersDetailsTable;

public interface TeachersDetailsTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeachersDetailsTable record);

    int insertSelective(TeachersDetailsTable record);

    TeachersDetailsTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeachersDetailsTable record);

    int updateByPrimaryKey(TeachersDetailsTable record);
}