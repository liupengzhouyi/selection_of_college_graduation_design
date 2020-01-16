package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.TeacherAnnouncementTable;

public interface TeacherAnnouncementTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacherAnnouncementTable record);

    int insertSelective(TeacherAnnouncementTable record);

    TeacherAnnouncementTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeacherAnnouncementTable record);

    int updateByPrimaryKey(TeacherAnnouncementTable record);
}