package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.mapper.GroupRelationshipTableMapper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.GroupRelationshipTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.GroupRelationshipInformation;
import cn.liupengstudy.selection_of_college_graduation_design.service.GroupRelationshipTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service.impl
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/17 - 10:18 下午
 * @修改人和其它信息
 */
@Service
public class GroupRelationshipTableServiceImpl implements GroupRelationshipTableService {

    @Autowired
    private GroupRelationshipTableMapper groupRelationshipTableMapper;

    public GroupRelationshipTableMapper getGroupRelationshipTableMapper() {
        return groupRelationshipTableMapper;
    }

    public void setGroupRelationshipTableMapper(GroupRelationshipTableMapper groupRelationshipTableMapper) {
        this.groupRelationshipTableMapper = groupRelationshipTableMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getGroupRelationshipTableMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GroupRelationshipTable record) {
        return this.getGroupRelationshipTableMapper().insert(record);
    }

    @Override
    public int insertSelective(GroupRelationshipTable record) {
        return this.getGroupRelationshipTableMapper().insertSelective(record);
    }

    @Override
    public GroupRelationshipTable selectByPrimaryKey(Integer id) {
        return this.getGroupRelationshipTableMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(GroupRelationshipTable record) {
        return this.getGroupRelationshipTableMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GroupRelationshipTable record) {
        return this.getGroupRelationshipTableMapper().updateByPrimaryKey(record);
    }

    @Override
    public List<GroupRelationshipTable> getGroupsByTeacherID(String teacherID) {
        return this.getGroupRelationshipTableMapper().getGroupsByTeacherID(teacherID);
    }

    @Override
    public List<GroupRelationshipTable> getGroupsByGroupName(String groupName) {
        return this.getGroupRelationshipTableMapper().getGroupsByGroupName(groupName);
    }

    @Override
    public GroupRelationshipTable select(GroupRelationshipInformation groupRelationshipInformation) {
        return this.getGroupRelationshipTableMapper().select(groupRelationshipInformation.getTeacherID(), groupRelationshipInformation.getGroupName());
    }
}
