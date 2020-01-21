package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.mapper.ApplicationPaperTableMapper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.ApplicationPaperTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.ApplicationPaperItem;
import cn.liupengstudy.selection_of_college_graduation_design.service.ApplicationPaperTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service.impl
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/21 - 1:06 下午
 * @修改人和其它信息
 */
@Service
public class ApplicationPaperServiceImpl implements ApplicationPaperTableService {

    @Autowired
    private ApplicationPaperTableMapper applicationPaperTableMapper;

    public ApplicationPaperTableMapper getApplicationPaperTableMapper() {
        return applicationPaperTableMapper;
    }

    public void setApplicationPaperTableMapper(ApplicationPaperTableMapper applicationPaperTableMapper) {
        this.applicationPaperTableMapper = applicationPaperTableMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(ApplicationPaperTable record) {
        return this.getApplicationPaperTableMapper().insert(record);
    }

    @Override
    public int insertSelective(ApplicationPaperTable record) {
        return this.getApplicationPaperTableMapper().insertSelective(record);
    }

    @Override
    public ApplicationPaperTable selectByPrimaryKey(Integer id) {
        return this.getApplicationPaperTableMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ApplicationPaperTable record) {
        return this.getApplicationPaperTableMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ApplicationPaperTable record) {
        return this.getApplicationPaperTableMapper().updateByPrimaryKey(record);
    }

    @Override
    public ApplicationPaperTable findSame(ApplicationPaperItem applicationPaperItem) {
        return this.getApplicationPaperTableMapper().findSame(applicationPaperItem.getPaperID(), applicationPaperItem.getStudentID(), applicationPaperItem.getIsPass());
    }

    @Override
    public List<ApplicationPaperTable> getAllPass() {
        return this.getApplicationPaperTableMapper().getAllPass();
    }

    @Override
    public List<ApplicationPaperTable> getAllNotPass() {
        return this.getApplicationPaperTableMapper().getAllNotPass();
    }

    @Override
    public List<ApplicationPaperTable> getStudentAll(String studentID) {
        return this.getApplicationPaperTableMapper().getStudentAll(studentID);
    }

    @Override
    public int pass(Integer id) {
        return this.getApplicationPaperTableMapper().pass(id);
    }

    @Override
    public int notPass(Integer id) {
        return this.getApplicationPaperTableMapper().notPass(id);
    }
}
