package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ManagersDetailsTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ManagersDetailsTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ManagersDetailsTable record);

    int insertSelective(ManagersDetailsTable record);

    ManagersDetailsTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ManagersDetailsTable record);

    int updateByPrimaryKey(ManagersDetailsTable record);

    List<ManagersDetailsTable> findByManagerID(@Param("managerID") String managerID);
}