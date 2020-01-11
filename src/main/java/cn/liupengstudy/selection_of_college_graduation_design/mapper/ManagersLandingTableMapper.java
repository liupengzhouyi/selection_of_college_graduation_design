package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ManagersLandingTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsLandingTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ManagersLandingTableMapper {

    /*
     * @Title deleteByPrimaryKey
     * @Description //TODO delete manager landing information in databases
     * @Param [id]
     * @return int
     * @Date 1/11/2020 5:54 PM
     * @Author liupeng
     **/
    int deleteByPrimaryKey(Integer id);

    /*
     * @Title insert
     * @Description //TODO insert manager landing information in databases
     * @Param [record]
     * @return int
     * @Date 1/11/2020 5:53 PM
     * @Author liupeng
     **/
    int insert(ManagersLandingTable record);

    int insertSelective(ManagersLandingTable record);

    ManagersLandingTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ManagersLandingTable record);

    /*
     * @Title updateByPrimaryKey
     * @Description //TODO update manager information in databases
     * @Param [record]
     * @return int
     * @Date 1/11/2020 5:53 PM
     * @Author liupeng
     **/
    int updateByPrimaryKey(ManagersLandingTable record);

    /*
     * @Title findManagersLandingTableInformationByManager
     * @Description //TODO find manager information in database
     * @Param [managerID]
     * @return java.util.List<cn.liupengstudy.selection_of_college_graduation_design.pojo.ManagersLandingTable>
     * @Date 1/11/2020 5:52 PM
     * @Author liupeng
     **/
    List<ManagersLandingTable> findManagersLandingTableInformationByManager(@Param("managerID")String managerID);
}