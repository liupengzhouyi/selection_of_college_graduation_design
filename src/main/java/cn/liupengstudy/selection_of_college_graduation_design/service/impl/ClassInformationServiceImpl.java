package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.mapper.ClassInformationTableMapper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.ClassInformationTable;
import cn.liupengstudy.selection_of_college_graduation_design.service.ClassInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liupeng
 * @version 1.0.0
 * @ClassName ClassInformationServiceImpl.java
 * @Description TODO
 * @createTime 2020年01月13日 16:54:00
 */
@Service
public class ClassInformationServiceImpl implements ClassInformationService {

    @Autowired
    private ClassInformationTableMapper classInformationTableMapper;

    public ClassInformationTableMapper getClassInformationTableMapper() {
        return classInformationTableMapper;
    }

    public void setClassInformationTableMapper(ClassInformationTableMapper classInformationTableMapper) {
        this.classInformationTableMapper = classInformationTableMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(ClassInformationTable record) {
        return this.getClassInformationTableMapper().insert(record);
    }

    @Override
    public int insertSelective(ClassInformationTable record) {
        return 0;
    }

    @Override
    public ClassInformationTable selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(ClassInformationTable record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(ClassInformationTable record) {
        return 0;
    }

    @Override
    public List<ClassInformationTable> selectClassByStudentID(Integer studentID) {
        return this.getClassInformationTableMapper().selectClassByStudentID(studentID);
    }

    @Override
    public List<ClassInformationTable> getStudentsByClassID(Integer classID) {
        return this.getClassInformationTableMapper().getStudentsByClassID(classID);
    }
}
