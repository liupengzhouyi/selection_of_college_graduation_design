package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsDetailsTable;

public interface StudentsDetailsTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentsDetailsTable record);

    int insertSelective(StudentsDetailsTable record);

    StudentsDetailsTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentsDetailsTable record);

    int updateByPrimaryKey(StudentsDetailsTable record);
}