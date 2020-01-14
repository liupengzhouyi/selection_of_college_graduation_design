package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.mapper.StudentsDetailsTableMapper;
import cn.liupengstudy.selection_of_college_graduation_design.mapper.StudentsLandingTableMapper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsDetailsTable;
import cn.liupengstudy.selection_of_college_graduation_design.service.StudentsDetailsTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service.impl
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/14 - 8:24 下午
 * @修改人和其它信息
 */

@Service
public class StudentsDetailsTableServiceImpl implements StudentsDetailsTableService {

    @Autowired
    private StudentsDetailsTableMapper studentsDetailsTableMapper;

    public StudentsDetailsTableMapper getStudentsDetailsTableMapper() {
        return studentsDetailsTableMapper;
    }

    public void setStudentsDetailsTableMapper(StudentsDetailsTableMapper studentsDetailsTableMapper) {
        this.studentsDetailsTableMapper = studentsDetailsTableMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getStudentsDetailsTableMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(StudentsDetailsTable record) {
        return this.getStudentsDetailsTableMapper().insert(record);
    }

    @Override
    public StudentsDetailsTable selectByPrimaryKey(Integer id) {
        return this.getStudentsDetailsTableMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKey(StudentsDetailsTable record) {
        return this.getStudentsDetailsTableMapper().updateByPrimaryKey(record);
    }

    @Override
    public List<StudentsDetailsTable> findByStudentID(String studentID) {
        return this.getStudentsDetailsTableMapper().findByStudentID(studentID);
    }
}
