package cn.liupengstudy.selection_of_college_graduation_design.service;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLanding;

public interface StudentsLandingService {

    /*
     * @Title deleteByPrimaryKey
     * @Description 删除学生登陆信息
     * @Param [id]
     * @return int
     * @Date 1/8/2020 6:59 PM
     * @Author liupeng
     **/
    int deleteByPrimaryKey(Integer id);

    /*
     * @Title insert
     * @Description 添加学生登陆信息
     * @Param [record]
     * @return int
     * @Date 1/8/2020 7:00 PM
     * @Author liupeng
     **/
    int insert(StudentsLanding record);

    /*
     * @Title insertSelective
     * @Description 添加学生登陆信息
     * @Param [record]
     * @return int
     * @Date 1/8/2020 7:00 PM
     * @Author liupeng
     **/
    int insertSelective(StudentsLanding record);

    /*
     * @Title selectByPrimaryKey
     * @Description 查询学生登陆信息
     * @Param [id]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLanding
     * @Date 1/8/2020 7:00 PM
     * @Author liupeng
     **/
    StudentsLanding selectByPrimaryKey(Integer id);

    /*
     * @Title updateByPrimaryKeySelective
     * @Description 更新学生登陆信息
     * @Param [record]
     * @return int
     * @Date 1/8/2020 7:00 PM
     * @Author liupeng
     **/
    int updateByPrimaryKeySelective(StudentsLanding record);

    /*
     * @Title updateByPrimaryKey
     * @Description 更新学生登陆信息
     * @Param [record]
     * @return int
     * @Date 1/8/2020 7:00 PM
     * @Author liupeng
     **/
    int updateByPrimaryKey(StudentsLanding record);

    /*
     * @Title findStrudent
     * @Description 查看学号是否存在
     * @Param [studentID]
     * @return int
     * @Date 1/8/2020 11:20 PM
     * @Author liupeng
     **/
     int findStudentByStudentID(String studentID);
}
