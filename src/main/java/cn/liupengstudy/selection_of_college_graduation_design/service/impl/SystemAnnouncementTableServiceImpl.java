package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.mapper.SystemAnnouncementTableMapper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.SystemAnnouncementTable;
import cn.liupengstudy.selection_of_college_graduation_design.service.SystemAnnouncementTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SystemAnnouncementTableServiceImpl implements SystemAnnouncementTableService {

    @Autowired
    private SystemAnnouncementTableMapper systemAnnouncementTableMapper;

    public SystemAnnouncementTableMapper getSystemAnnouncementTableMapper() {
        return systemAnnouncementTableMapper;
    }

    public void setSystemAnnouncementTableMapper(SystemAnnouncementTableMapper systemAnnouncementTableMapper) {
        this.systemAnnouncementTableMapper = systemAnnouncementTableMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getSystemAnnouncementTableMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SystemAnnouncementTable record) {
        return this.getSystemAnnouncementTableMapper().insert(record);
    }

    @Override
    public int insertSelective(SystemAnnouncementTable record) {
        return this.getSystemAnnouncementTableMapper().insertSelective(record);
    }

    @Override
    public SystemAnnouncementTable selectByPrimaryKey(Integer id) {
        return this.getSystemAnnouncementTableMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SystemAnnouncementTable record) {
        return this.getSystemAnnouncementTableMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SystemAnnouncementTable record) {
        return this.getSystemAnnouncementTableMapper().updateByPrimaryKey(record);
    }

    @Override
    public List<SystemAnnouncementTable> isPresence(String title) {
        return this.getSystemAnnouncementTableMapper().isPresence(title);
    }
}
