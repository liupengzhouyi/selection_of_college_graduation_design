package cn.liupengstudy.selection_of_college_graduation_design.service;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.GroupNumberTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/17 - 11:47 下午
 * @修改人和其它信息
 */
public interface GroupNumberTableService {

    int deleteByPrimaryKey(Integer id);

    int insert(GroupNumberTable record);

    int insertSelective(GroupNumberTable record);

    GroupNumberTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GroupNumberTable record);

    int updateByPrimaryKey(GroupNumberTable record);

    List<GroupNumberTable> findAllGroupNumber(Integer integer);

    List<GroupNumberTable> findStudent(String studentID);
}
