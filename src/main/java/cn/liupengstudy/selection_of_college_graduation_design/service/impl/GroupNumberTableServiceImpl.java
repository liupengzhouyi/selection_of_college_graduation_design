package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.GroupNumberTable;
import cn.liupengstudy.selection_of_college_graduation_design.service.GroupNumberTableService;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service.impl
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/17 - 11:48 下午
 * @修改人和其它信息
 */
public class GroupNumberTableServiceImpl implements GroupNumberTableService {
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(GroupNumberTable record) {
        return 0;
    }

    @Override
    public int insertSelective(GroupNumberTable record) {
        return 0;
    }

    @Override
    public GroupNumberTable selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(GroupNumberTable record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(GroupNumberTable record) {
        return 0;
    }

    @Override
    public List<GroupNumberTable> findAllGroupNumber(Integer integer) {
        return null;
    }

    @Override
    public List<GroupNumberTable> findStudent(String studentID) {
        return null;
    }
}
