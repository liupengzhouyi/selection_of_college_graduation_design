package cn.liupengstudy.selection_of_college_graduation_design.service;

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
public interface TeachersLandingTableService {

    /*
     * @Title deleteByPrimaryKey
     * @Description //TODO delete teacher landing information
     * @Param [id]
     * @return int
     * @Date 1/11/2020 6:05 PM
     * @Author liupeng
     **/
    int deleteByPrimaryKey(Integer id);

    /*
     * @Title insert
     * @Description //TODO insert teacher landing information
     * @Param [record]
     * @return int
     * @Date 1/11/2020 6:05 PM
     * @Author liupeng
     **/
    int insert(TeachersLandingTable record);

    int insertSelective(TeachersLandingTable record);

    TeachersLandingTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeachersLandingTable record);

    /*
     * @Title updateByPrimaryKey
     * @Description //TODO update teacher landing information
     * @Param [record]
     * @return int
     * @Date 1/11/2020 6:04 PM
     * @Author liupeng
     **/
    int updateByPrimaryKey(TeachersLandingTable record);

    /*
     * @Title findTeachersLandingTableInformationByTeacherID
     * @Description //TODO find Teachers Landing Table Information By Teacher ID in databases
     * @Param [teacherID]
     * @return java.util.List<cn.liupengstudy.selection_of_college_graduation_design.pojo.TeachersLandingTable>
     * @Date 1/11/2020 5:59 PM
     * @Author liupeng
     **/
    List<TeachersLandingTable> findTeachersLandingTableInformationByTeacherID(@Param("teacherID") String teacherID);

}
