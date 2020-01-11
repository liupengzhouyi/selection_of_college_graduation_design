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

    /*
     * @Title getManagersLandingTableMapper
     * @Description //TODO get databases mapper tool
     * @Param []
     * @return cn.liupengstudy.selection_of_college_graduation_design.mapper.ManagersLandingTableMapper
     * @Date 1/11/2020 5:55 PM
     * @Author liupeng
     **/
    public TeachersLandingTableMapper getTeachersLandingTableMapper() {
        return teachersLandingTableMapper;
    }

    /*
     * @Title setManagersLandingTableMapper
     * @Description //TODO set databases mapper tool
     * @Param [managersLandingTableMapper]
     * @return void
     * @Date 1/11/2020 5:55 PM
     * @Author liupeng
     **/
    public void setTeachersLandingTableMapper(TeachersLandingTableMapper teachersLandingTableMapper) {
        this.teachersLandingTableMapper = teachersLandingTableMapper;
    }

    /*
     * @Title deleteByPrimaryKey
     * @Description //TODO delete teacher landing information
     * @Param [id]
     * @return int
     * @Date 1/11/2020 6:05 PM
     * @Author liupeng
     **/
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getTeachersLandingTableMapper().deleteByPrimaryKey(id);
    }

    /*
     * @Title insert
     * @Description //TODO insert teacher landing information
     * @Param [record]
     * @return int
     * @Date 1/11/2020 6:05 PM
     * @Author liupeng
     **/
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

    /*
     * @Title updateByPrimaryKey
     * @Description //TODO update teacher landing information
     * @Param [record]
     * @return int
     * @Date 1/11/2020 6:04 PM
     * @Author liupeng
     **/
    @Override
    public int updateByPrimaryKey(TeachersLandingTable record) {
        return this.getTeachersLandingTableMapper().updateByPrimaryKey(record);
    }

    /*
     * @Title findTeachersLandingTableInformationByTeacherID
     * @Description //TODO find Teachers Landing Table Information By Teacher ID in databases
     * @Param [teacherID]
     * @return java.util.List<cn.liupengstudy.selection_of_college_graduation_design.pojo.TeachersLandingTable>
     * @Date 1/11/2020 5:59 PM
     * @Author liupeng
     **/
    @Override
    public List<TeachersLandingTable> findTeachersLandingTableInformationByTeacherID(String teacherID) {
        return this.getTeachersLandingTableMapper().findTeachersLandingTableInformationByTeacherID(teacherID);
    }
}
