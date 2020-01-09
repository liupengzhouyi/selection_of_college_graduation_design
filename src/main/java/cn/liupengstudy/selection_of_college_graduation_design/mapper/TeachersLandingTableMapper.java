package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.TeachersLandingTable;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeachersLandingTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeachersLandingTable record);

    int insertSelective(TeachersLandingTable record);

    TeachersLandingTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeachersLandingTable record);

    int updateByPrimaryKey(TeachersLandingTable record);
}