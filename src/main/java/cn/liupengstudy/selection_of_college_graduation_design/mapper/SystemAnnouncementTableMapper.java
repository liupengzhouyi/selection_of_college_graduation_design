package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.SystemAnnouncementTable;

public interface SystemAnnouncementTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemAnnouncementTable record);

    int insertSelective(SystemAnnouncementTable record);

    SystemAnnouncementTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemAnnouncementTable record);

    int updateByPrimaryKey(SystemAnnouncementTable record);
}