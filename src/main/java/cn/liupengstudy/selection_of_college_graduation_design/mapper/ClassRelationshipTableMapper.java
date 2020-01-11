package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ClassRelationshipTable;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClassRelationshipTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassRelationshipTable record);

    int insertSelective(ClassRelationshipTable record);

    ClassRelationshipTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassRelationshipTable record);

    int updateByPrimaryKey(ClassRelationshipTable record);
}