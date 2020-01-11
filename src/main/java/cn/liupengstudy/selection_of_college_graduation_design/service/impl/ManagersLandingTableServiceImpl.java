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

    public ManagersLandingTableMapper getManagersLandingTableMapper() {
        return managersLandingTableMapper;
    }

    public void setManagersLandingTableMapper(ManagersLandingTableMapper managersLandingTableMapper) {
        this.managersLandingTableMapper = managersLandingTableMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getManagersLandingTableMapper().deleteByPrimaryKey(id);
    }

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

    @Override
    public int updateByPrimaryKey(ManagersLandingTable record) {
        return this.getManagersLandingTableMapper().updateByPrimaryKey(record);
    }

    @Override
    public List<ManagersLandingTable> findManagersLandingTableInformationByManager(String managerID) {
        return this.getManagersLandingTableMapper().findManagersLandingTableInformationByManager(managerID);
    }
}
