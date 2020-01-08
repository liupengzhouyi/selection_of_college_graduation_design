package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.mapper.StudentsLandingMapper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLanding;
import cn.liupengstudy.selection_of_college_graduation_design.service.StudentsLandingService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liupeng
 * @version 1.0.0
 * @ClassName StudentsLandingServiceImpl.java
 * @Description TODO
 * @createTime 2020年01月08日 21:39:00
 */
@Service
public class StudentsLandingServiceImpl implements StudentsLandingService {

    // 数据库映射Mapper
    @Autowired
    private StudentsLandingMapper studentsLandingMapper;

    /*
     * @Title getStudentsLandingMapper
     * @Description //TODO
     * @Param []
     * @return cn.liupengstudy.selection_of_college_graduation_design.mapper.StudentsLandingMapper
     * @Date 1/8/2020 7:13 PM
     * @Author liupeng
     **/
    public StudentsLandingMapper getStudentsLandingMapper() {
        return studentsLandingMapper;
    }

    /*
     * @Title setStudentsLandingMapper
     * @Description //TODO
     * @Param [studentsLandingMapper]
     * @return void
     * @Date 1/8/2020 7:14 PM
     * @Author liupeng
     **/
    public void setStudentsLandingMapper(StudentsLandingMapper studentsLandingMapper) {
        this.studentsLandingMapper = studentsLandingMapper;
    }

    /*
     * @Title deleteByPrimaryKey
     * @Description 删除学生登陆信息
     * @Param [id]
     * @return int
     * @Date 1/8/2020 6:59 PM
     * @Author liupeng
     **/
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getStudentsLandingMapper().deleteByPrimaryKey(id);
    }

    /*
     * @Title insert
     * @Description 添加学生登陆信息
     * @Param [record]
     * @return int
     * @Date 1/8/2020 7:00 PM
     * @Author liupeng
     **/
    @Override
    public int insert(StudentsLanding record) {
        return this.getStudentsLandingMapper().insert(record);
    }

    /*
     * @Title insertSelective
     * @Description 添加学生登陆信息
     * @Param [record]
     * @return int
     * @Date 1/8/2020 7:00 PM
     * @Author liupeng
     **/
    @Override
    public int insertSelective(StudentsLanding record) {
        return this.getStudentsLandingMapper().insertSelective(record);
    }

    /*
     * @Title selectByPrimaryKey
     * @Description 查询学生登陆信息
     * @Param [id]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLanding
     * @Date 1/8/2020 7:00 PM
     * @Author liupeng
     **/
    @Override
    public StudentsLanding selectByPrimaryKey(Integer id) {
        return this.getStudentsLandingMapper().selectByPrimaryKey(id);
    }

    /*
     * @Title updateByPrimaryKeySelective
     * @Description 更新学生登陆信息
     * @Param [record]
     * @return int
     * @Date 1/8/2020 7:00 PM
     * @Author liupeng
     **/
    @Override
    public int updateByPrimaryKeySelective(StudentsLanding record) {
        return this.getStudentsLandingMapper().updateByPrimaryKeySelective(record);
    }

    /*
     * @Title updateByPrimaryKey
     * @Description 更新学生登陆信息
     * @Param [record]
     * @return int
     * @Date 1/8/2020 7:00 PM
     * @Author liupeng
     **/
    @Override
    public int updateByPrimaryKey(StudentsLanding record) {
        return this.getStudentsLandingMapper().updateByPrimaryKey(record);
    }

    /*
     * @Title findStrudent
     * @Description 查看学号是否存在
     * @Param [studentID]
     * @return int
     * @Date 1/8/2020 11:20 PM
     * @Author liupeng
     **/
    @Override
    public int findStudentByStudentID(String studentID) {
        StudentsLanding studentsLanding = this.getStudentsLandingMapper().findStudentByStudentID(studentID);
        if (null == studentsLanding) {
            return 0;
        } else {
            return 1;
        }
    }
}
