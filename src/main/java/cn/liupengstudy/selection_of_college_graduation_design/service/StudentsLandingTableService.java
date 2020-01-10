package cn.liupengstudy.selection_of_college_graduation_design.service;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLandingTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.TeachersLandingTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/10 - 12:01 上午
 * @修改人和其它信息
 */
public interface StudentsLandingTableService {

    int deleteByPrimaryKey(Integer id);

    int insert(StudentsLandingTable record);

    int insertSelective(StudentsLandingTable record);

    StudentsLandingTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentsLandingTable record);

    int updateByPrimaryKey(StudentsLandingTable record);

    List<StudentsLandingTable> findStudentLandingInformationByStudentID(@Param("studentID")String studentID);

}
