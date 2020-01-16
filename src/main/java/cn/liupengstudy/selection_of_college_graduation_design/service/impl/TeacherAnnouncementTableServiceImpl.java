package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.mapper.TeacherAnnouncementTableMapper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.TeacherAnnouncementTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.StringType;
import cn.liupengstudy.selection_of_college_graduation_design.service.TeacherAnnouncementTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherAnnouncementTableServiceImpl implements TeacherAnnouncementTableService {

    @Autowired
    private TeacherAnnouncementTableMapper teacherAnnouncementTableMapper;

    public TeacherAnnouncementTableMapper getTeacherAnnouncementTableMapper() {
        return teacherAnnouncementTableMapper;
    }

    public void setTeacherAnnouncementTableMapper(TeacherAnnouncementTableMapper teacherAnnouncementTableMapper) {
        this.teacherAnnouncementTableMapper = teacherAnnouncementTableMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getTeacherAnnouncementTableMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(TeacherAnnouncementTable record) {
        return this.getTeacherAnnouncementTableMapper().insert(record);
    }

    @Override
    public int insertSelective(TeacherAnnouncementTable record) {
        return this.getTeacherAnnouncementTableMapper().insertSelective(record);
    }

    @Override
    public TeacherAnnouncementTable selectByPrimaryKey(Integer id) {
        return this.getTeacherAnnouncementTableMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(TeacherAnnouncementTable record) {
        return this.getTeacherAnnouncementTableMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TeacherAnnouncementTable record) {
        return this.getTeacherAnnouncementTableMapper().updateByPrimaryKey(record);
    }

    @Override
    public List<TeacherAnnouncementTable> findByTitle(String string) {
        return this.getTeacherAnnouncementTableMapper().findByTitle(string);
    }
}
