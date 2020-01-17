package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.mapper.GroupNumberTableMapper;
import cn.liupengstudy.selection_of_college_graduation_design.mapper.GroupRelationshipTableMapper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.GroupNumberTable;
import cn.liupengstudy.selection_of_college_graduation_design.service.GroupNumberTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service.impl
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/17 - 11:48 下午
 * @修改人和其它信息
 */
@Service
public class GroupNumberTableServiceImpl implements GroupNumberTableService {

    @Autowired
    private GroupNumberTableMapper groupNumberTableMapper;

    public GroupNumberTableMapper getGroupNumberTableMapper() {
        return groupNumberTableMapper;
    }

    public void setGroupNumberTableMapper(GroupNumberTableMapper groupNumberTableMapper) {
        this.groupNumberTableMapper = groupNumberTableMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getGroupNumberTableMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GroupNumberTable record) {
        return this.getGroupNumberTableMapper().insert(record);
    }

    @Override
    public int insertSelective(GroupNumberTable record) {
        return this.getGroupNumberTableMapper().insertSelective(record);
    }

    @Override
    public GroupNumberTable selectByPrimaryKey(Integer id) {
        return this.getGroupNumberTableMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(GroupNumberTable record) {
        return this.getGroupNumberTableMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GroupNumberTable record) {
        return this.getGroupNumberTableMapper().updateByPrimaryKey(record);
    }

    @Override
    public List<GroupNumberTable> findAllGroupNumber(Integer integer) {
        return this.getGroupNumberTableMapper().findAllGroupNumber(integer);
    }

    @Override
    public List<GroupNumberTable> findStudent(String studentID) {
        return this.getGroupNumberTableMapper().findStudent(studentID);
    }
}
