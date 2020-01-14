package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.mapper.ManagersDetailsTableMapper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.ManagersDetailsTable;
import cn.liupengstudy.selection_of_college_graduation_design.service.ManagersDetailsTableMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service.impl
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/14 - 10:47 下午
 * @修改人和其它信息
 */
@Service
public class ManagersDetailsTableMapperServiceImpl implements ManagersDetailsTableMapperService {

    @Autowired
    private ManagersDetailsTableMapper managersDetailsTableMapper;

    public ManagersDetailsTableMapper getManagersDetailsTableMapper() {
        return managersDetailsTableMapper;
    }

    public void setManagersDetailsTableMapper(ManagersDetailsTableMapper managersDetailsTableMapper) {
        this.managersDetailsTableMapper = managersDetailsTableMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getManagersDetailsTableMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ManagersDetailsTable record) {
        return this.getManagersDetailsTableMapper().insert(record);
    }

    @Override
    public int insertSelective(ManagersDetailsTable record) {
        return this.getManagersDetailsTableMapper().insertSelective(record);
    }

    @Override
    public ManagersDetailsTable selectByPrimaryKey(Integer id) {
        return this.getManagersDetailsTableMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ManagersDetailsTable record) {
        return this.getManagersDetailsTableMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ManagersDetailsTable record) {
        return this.getManagersDetailsTableMapper().updateByPrimaryKey(record);
    }

    @Override
    public List<ManagersDetailsTable> findByManagerID(String managerID) {
        return this.getManagersDetailsTableMapper().findByManagerID(managerID);
    }
}
