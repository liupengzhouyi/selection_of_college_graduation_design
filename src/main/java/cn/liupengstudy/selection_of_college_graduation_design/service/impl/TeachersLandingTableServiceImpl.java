package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.mapper.TeachersLandingTableMapper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.TeachersLandingTable;
import cn.liupengstudy.selection_of_college_graduation_design.service.TeachersLandingTableService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service.impl
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/10 - 12:11 上午
 * @修改人和其它信息
 */
@Service
public class TeachersLandingTableServiceImpl implements TeachersLandingTableService {

    @Autowired
    private TeachersLandingTableMapper teachersLandingTableMapper;

    public TeachersLandingTableMapper getTeachersLandingTableMapper() {
        return teachersLandingTableMapper;
    }

    public void setTeachersLandingTableMapper(TeachersLandingTableMapper teachersLandingTableMapper) {
        this.teachersLandingTableMapper = teachersLandingTableMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(TeachersLandingTable record) {
        return this.getTeachersLandingTableMapper().insert(record);
    }

    @Override
    public int insertSelective(TeachersLandingTable record) {
        return 0;
    }

    @Override
    public TeachersLandingTable selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(TeachersLandingTable record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TeachersLandingTable record) {
        return 0;
    }

    @Override
    public List<TeachersLandingTable> findTeachersLandingTableInformationByTeacherID(String teacherID) {
        return this.getTeachersLandingTableMapper().findTeachersLandingTableInformationByTeacherID(teacherID);
    }
}
