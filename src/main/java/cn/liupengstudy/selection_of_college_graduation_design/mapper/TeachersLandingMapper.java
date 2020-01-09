package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.TeachersLanding;

public interface TeachersLandingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeachersLanding record);

    int insertSelective(TeachersLanding record);

    TeachersLanding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeachersLanding record);

    int updateByPrimaryKey(TeachersLanding record);
}