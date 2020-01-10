package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ManagersLandingTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLandingTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ManagersLandingTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ManagersLandingTable record);

    int insertSelective(ManagersLandingTable record);

    ManagersLandingTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ManagersLandingTable record);

    int updateByPrimaryKey(ManagersLandingTable record);
}