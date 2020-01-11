package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.mapper.ManagersLandingTableMapper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.ManagersLandingTable;
import cn.liupengstudy.selection_of_college_graduation_design.service.ManagersLandingTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service.impl
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/10 - 12:37 上午
 * @修改人和其它信息
 */
@Service
public class ManagersLandingTableServiceImpl implements ManagersLandingTableService {

    @Autowired
    private ManagersLandingTableMapper managersLandingTableMapper;

    /*
     * @Title getManagersLandingTableMapper
     * @Description //TODO get databases mapper tool
     * @Param []
     * @return cn.liupengstudy.selection_of_college_graduation_design.mapper.ManagersLandingTableMapper
     * @Date 1/11/2020 5:55 PM
     * @Author liupeng
     **/
    public ManagersLandingTableMapper getManagersLandingTableMapper() {
        return managersLandingTableMapper;
    }

    /*
     * @Title setManagersLandingTableMapper
     * @Description //TODO set databases mapper tool
     * @Param [managersLandingTableMapper]
     * @return void
     * @Date 1/11/2020 5:55 PM
     * @Author liupeng
     **/
    public void setManagersLandingTableMapper(ManagersLandingTableMapper managersLandingTableMapper) {
        this.managersLandingTableMapper = managersLandingTableMapper;
    }

    /*
     * @Title deleteByPrimaryKey
     * @Description //TODO delete manager landing information in databases
     * @Param [id]
     * @return int
     * @Date 1/11/2020 5:54 PM
     * @Author liupeng
     **/
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getManagersLandingTableMapper().deleteByPrimaryKey(id);
    }

    /*
     * @Title insert
     * @Description //TODO insert manager landing information in databases
     * @Param [record]
     * @return int
     * @Date 1/11/2020 5:53 PM
     * @Author liupeng
     **/
    @Override
    public int insert(ManagersLandingTable record) {
        return this.getManagersLandingTableMapper().insert(record);
    }

    @Override
    public int insertSelective(ManagersLandingTable record) {
        return 0;
    }

    @Override
    public ManagersLandingTable selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(ManagersLandingTable record) {
        return 0;
    }

    /*
     * @Title updateByPrimaryKey
     * @Description //TODO update manager information in databases
     * @Param [record]
     * @return int
     * @Date 1/11/2020 5:53 PM
     * @Author liupeng
     **/
    @Override
    public int updateByPrimaryKey(ManagersLandingTable record) {
        return this.getManagersLandingTableMapper().updateByPrimaryKey(record);
    }

    /*
     * @Title findManagersLandingTableInformationByManager
     * @Description //TODO find manager information in database
     * @Param [managerID]
     * @return java.util.List<cn.liupengstudy.selection_of_college_graduation_design.pojo.ManagersLandingTable>
     * @Date 1/11/2020 5:52 PM
     * @Author liupeng
     **/
    @Override
    public List<ManagersLandingTable> findManagersLandingTableInformationByManager(String managerID) {
        return this.getManagersLandingTableMapper().findManagersLandingTableInformationByManager(managerID);
    }
}
