package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLandingTable;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentsLandingTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentsLandingTable record);

    int insertSelective(StudentsLandingTable record);

    StudentsLandingTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentsLandingTable record);

    int updateByPrimaryKey(StudentsLandingTable record);
}