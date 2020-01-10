package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLandingTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentsLandingTableMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(StudentsLandingTable record);

    int insertSelective(StudentsLandingTable record);

    StudentsLandingTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentsLandingTable record);

    int updateByPrimaryKey(StudentsLandingTable record);

    List<StudentsLandingTable> findStudentLandingInformationByStudentID(@Param("studentsID")String studentsID);
}