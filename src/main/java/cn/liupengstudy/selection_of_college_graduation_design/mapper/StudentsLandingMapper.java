package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLanding;

public interface StudentsLandingMapper {


    int deleteByPrimaryKey(Integer id);

    int insert(StudentsLanding record);

    int insertSelective(StudentsLanding record);

    StudentsLanding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentsLanding record);

    int updateByPrimaryKey(StudentsLanding record);
}