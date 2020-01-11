package cn.liupengstudy.selection_of_college_graduation_design.service;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ManagersLandingTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/10 - 12:37 上午
 * @修改人和其它信息
 */
public interface ManagersLandingTableService {

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

    /*
     * @Title updateByPrimaryKey
     * @Description //TODO update manager information in databases
     * @Param [record]
     * @return int
     * @Date 1/11/2020 5:53 PM
     * @Author liupeng
     **/
    int updateByPrimaryKeySelective(ManagersLandingTable record);

    int updateByPrimaryKey(ManagersLandingTable record);

    /*
     * @Title findManagersLandingTableInformationByManager
     * @Description //TODO find manager information in database
     * @Param [managerID]
     * @return java.util.List<cn.liupengstudy.selection_of_college_graduation_design.pojo.ManagersLandingTable>
     * @Date 1/11/2020 5:52 PM
     * @Author liupeng
     **/
    List<ManagersLandingTable> findManagersLandingTableInformationByManager(String managerID);
}
