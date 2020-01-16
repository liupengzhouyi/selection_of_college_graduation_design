package cn.liupengstudy.selection_of_college_graduation_design.service;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.TeacherAnnouncementTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.StringType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherAnnouncementTableService {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacherAnnouncementTable record);

    int insertSelective(TeacherAnnouncementTable record);

    TeacherAnnouncementTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeacherAnnouncementTable record);

    int updateByPrimaryKey(TeacherAnnouncementTable record);

    List<TeacherAnnouncementTable> findByTitle(String string);
}
