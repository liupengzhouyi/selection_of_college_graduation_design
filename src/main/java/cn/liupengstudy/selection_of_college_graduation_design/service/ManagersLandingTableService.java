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

    int deleteByPrimaryKey(Integer id);

    int insert(ManagersLandingTable record);

    int insertSelective(ManagersLandingTable record);

    ManagersLandingTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ManagersLandingTable record);

    int updateByPrimaryKey(ManagersLandingTable record);

    List<ManagersLandingTable> findManagersLandingTableInformationByManager(String managerID);
}
