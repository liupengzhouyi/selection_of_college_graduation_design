package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLandingTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentsLandingTableMapper {

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
    List<StudentsLandingTable> findStudentLandingInformationByStudentID(@Param("studentsID")String studentsID);
}