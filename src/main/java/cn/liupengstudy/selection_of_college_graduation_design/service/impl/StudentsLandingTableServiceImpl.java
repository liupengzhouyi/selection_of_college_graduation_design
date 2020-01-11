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

    /*
     * @Title getManagersLandingTableMapper
     * @Description //TODO get databases mapper tool
     * @Param []
     * @return cn.liupengstudy.selection_of_college_graduation_design.mapper.ManagersLandingTableMapper
     * @Date 1/11/2020 5:55 PM
     * @Author liupeng
     **/
    public StudentsLandingTableMapper getStudentsLandingTableMapper() {
        return studentsLandingTableMapper;
    }

    /*
     * @Title setManagersLandingTableMapper
     * @Description //TODO set databases mapper tool
     * @Param [managersLandingTableMapper]
     * @return void
     * @Date 1/11/2020 5:55 PM
     * @Author liupeng
     **/
    public void setStudentsLandingTableMapper(StudentsLandingTableMapper studentsLandingTableMapper) {
        this.studentsLandingTableMapper = studentsLandingTableMapper;
    }

    /*
     * @Title deleteByPrimaryKey
     * @Description //TODO delete student landing information
     * @Param [id]
     * @return int
     * @Date 1/11/2020 6:01 PM
     * @Author liupeng
     **/
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getStudentsLandingTableMapper().deleteByPrimaryKey(id);
    }

    /*
     * @Title insert
     * @Description //TODO insert student landing information
     * @Param [record]
     * @return int
     * @Date 1/11/2020 6:01 PM
     * @Author liupeng
     **/
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

    /*
     * @Title updateByPrimaryKey
     * @Description //TODO updata student landing information
     * @Param [record]
     * @return int
     * @Date 1/11/2020 6:00 PM
     * @Author liupeng
     **/
    @Override
    public int updateByPrimaryKey(StudentsLandingTable record) {
        return this.getStudentsLandingTableMapper().updateByPrimaryKey(record);
    }

    /*
     * @Title findStudentLandingInformationByStudentID
     * @Description //TODO find Student Landing Information By StudentID in databases
     * @Param [studentID]
     * @return java.util.List<cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLandingTable>
     * @Date 1/11/2020 5:58 PM
     * @Author liupeng
     **/
    @Override
    public List<StudentsLandingTable> findStudentLandingInformationByStudentID(String studentID) {
        return this.getStudentsLandingTableMapper().findStudentLandingInformationByStudentID(studentID);
    }
}
