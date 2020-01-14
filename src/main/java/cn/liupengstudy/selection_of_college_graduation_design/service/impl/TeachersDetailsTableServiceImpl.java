package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.mapper.TeachersDetailsTableMapper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.TeachersDetailsTable;
import cn.liupengstudy.selection_of_college_graduation_design.service.TeachersDetailsTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service.impl
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/14 - 9:36 下午
 * @修改人和其它信息
 */
@Service
public class TeachersDetailsTableServiceImpl implements TeachersDetailsTableService {

    @Autowired
    private TeachersDetailsTableMapper teachersDetailsTableMapper;

    public TeachersDetailsTableMapper getTeachersDetailsTableMapper() {
        return teachersDetailsTableMapper;
    }

    public void setTeachersDetailsTableMapper(TeachersDetailsTableMapper teachersDetailsTableMapper) {
        this.teachersDetailsTableMapper = teachersDetailsTableMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getTeachersDetailsTableMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeachersDetailsTable record) {
        return this.getTeachersDetailsTableMapper().insert(record);
    }

    @Override
    public int insertSelective(TeachersDetailsTable record) {
        return this.getTeachersDetailsTableMapper().insertSelective(record);
    }

    @Override
    public TeachersDetailsTable selectByPrimaryKey(Integer id) {
        return this.getTeachersDetailsTableMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TeachersDetailsTable record) {
        return this.getTeachersDetailsTableMapper().updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKey(TeachersDetailsTable record) {
        return this.getTeachersDetailsTableMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public List<TeachersDetailsTable> findByTeacherID(String teacherID) {
        return this.getTeachersDetailsTableMapper().findByTeacherID(teacherID);
    }
}
