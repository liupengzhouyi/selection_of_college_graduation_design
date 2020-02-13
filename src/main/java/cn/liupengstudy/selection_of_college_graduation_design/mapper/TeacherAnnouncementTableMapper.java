package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.TeacherAnnouncementTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.StringType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TeacherAnnouncementTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacherAnnouncementTable record);

    int insertSelective(TeacherAnnouncementTable record);

    TeacherAnnouncementTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeacherAnnouncementTable record);

    int updateByPrimaryKey(TeacherAnnouncementTable record);

    List<TeacherAnnouncementTable> findByTitle(@Param("title")String string);

    List<TeacherAnnouncementTable> getAll();
}