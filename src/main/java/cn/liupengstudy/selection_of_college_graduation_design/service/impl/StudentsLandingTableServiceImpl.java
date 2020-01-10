package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.mapper.StudentsLandingTableMapper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLandingTable;
import cn.liupengstudy.selection_of_college_graduation_design.service.StudentsLandingTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service.impl
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/10 - 12:03 上午
 * @修改人和其它信息
 */
@Service
public class StudentsLandingTableServiceImpl implements StudentsLandingTableService {

    @Autowired
    private StudentsLandingTableMapper studentsLandingTableMapper;

    public StudentsLandingTableMapper getStudentsLandingTableMapper() {
        return studentsLandingTableMapper;
    }

    public void setStudentsLandingTableMapper(StudentsLandingTableMapper studentsLandingTableMapper) {
        this.studentsLandingTableMapper = studentsLandingTableMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getStudentsLandingTableMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(StudentsLandingTable record) {
        return this.getStudentsLandingTableMapper().insert(record);
    }

    @Override
    public int insertSelective(StudentsLandingTable record) {
        return 0;
    }

    @Override
    public StudentsLandingTable selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(StudentsLandingTable record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(StudentsLandingTable record) {
        return this.getStudentsLandingTableMapper().updateByPrimaryKey(record);
    }

    @Override
    public List<StudentsLandingTable> findStudentLandingInformationByStudentID(String studentID) {
        return this.getStudentsLandingTableMapper().findStudentLandingInformationByStudentID(studentID);
    }
}
