package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.GroupRelationshipTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GroupRelationshipTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GroupRelationshipTable record);

    int insertSelective(GroupRelationshipTable record);

    GroupRelationshipTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GroupRelationshipTable record);

    int updateByPrimaryKey(GroupRelationshipTable record);

    List<GroupRelationshipTable> getGroupsByTeacherID(@Param("teacherID") String teacherID);

    List<GroupRelationshipTable> getGroupsByGroupName(@Param("groupName") String groupName);

    GroupRelationshipTable select(@Param("teacherID") String teacherID, @Param("groupName") String groupName);

}