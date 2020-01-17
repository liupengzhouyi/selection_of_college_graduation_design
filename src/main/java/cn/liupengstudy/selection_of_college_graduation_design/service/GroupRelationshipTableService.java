package cn.liupengstudy.selection_of_college_graduation_design.service;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.GroupRelationshipTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.GroupRelationshipInformation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/17 - 10:18 下午
 * @修改人和其它信息
 */
public interface GroupRelationshipTableService {
    int deleteByPrimaryKey(Integer id);

    int insert(GroupRelationshipTable record);

    int insertSelective(GroupRelationshipTable record);

    GroupRelationshipTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GroupRelationshipTable record);

    int updateByPrimaryKey(GroupRelationshipTable record);

    List<GroupRelationshipTable> getGroupsByTeacherID(String teacherID);

    List<GroupRelationshipTable> getGroupsByGroupName(String groupName);

    GroupRelationshipTable select(GroupRelationshipInformation groupRelationshipInformation);
}
