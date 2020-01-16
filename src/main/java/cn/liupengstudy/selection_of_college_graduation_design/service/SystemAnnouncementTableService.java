package cn.liupengstudy.selection_of_college_graduation_design.service;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.SystemAnnouncementTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemAnnouncementTableService {


    int deleteByPrimaryKey(Integer id);

    int insert(SystemAnnouncementTable record);

    int insertSelective(SystemAnnouncementTable record);

    SystemAnnouncementTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemAnnouncementTable record);

    int updateByPrimaryKey(SystemAnnouncementTable record);

    List<SystemAnnouncementTable> isPresence(String title);

}
