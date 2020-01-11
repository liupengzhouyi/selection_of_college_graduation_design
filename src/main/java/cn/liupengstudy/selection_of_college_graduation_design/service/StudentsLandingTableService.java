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

    /*
     * @Title deleteByPrimaryKey
     * @Description //TODO delete student landing information
     * @Param [id]
     * @return int
     * @Date 1/11/2020 6:01 PM
     * @Author liupeng
     **/
    int deleteByPrimaryKey(Integer id);

    /*
     * @Title insert
     * @Description //TODO insert student landing information
     * @Param [record]
     * @return int
     * @Date 1/11/2020 6:01 PM
     * @Author liupeng
     **/
    int insert(StudentsLandingTable record);

    int insertSelective(StudentsLandingTable record);

    StudentsLandingTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentsLandingTable record);

    /*
     * @Title updateByPrimaryKey
     * @Description //TODO updata student landing information
     * @Param [record]
     * @return int
     * @Date 1/11/2020 6:00 PM
     * @Author liupeng
     **/
    int updateByPrimaryKey(StudentsLandingTable record);

    /*
     * @Title findStudentLandingInformationByStudentID
     * @Description //TODO find Student Landing Information By StudentID in databases
     * @Param [studentID]
     * @return java.util.List<cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLandingTable>
     * @Date 1/11/2020 5:58 PM
     * @Author liupeng
     **/
    List<StudentsLandingTable> findStudentLandingInformationByStudentID(@Param("studentID")String studentID);

}
