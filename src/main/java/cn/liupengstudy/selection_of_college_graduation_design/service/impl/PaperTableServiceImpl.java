package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.mapper.PaperTableMapper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.PaperTable;
import cn.liupengstudy.selection_of_college_graduation_design.service.PaperTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service.impl
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/20 - 1:40 上午
 * @修改人和其它信息
 */
@Service
public class PaperTableServiceImpl implements PaperTableService {

    @Autowired
    private PaperTableMapper paperTableMapper;

    public PaperTableMapper getPaperTableMapper() {
        return paperTableMapper;
    }

    public void setPaperTableMapper(PaperTableMapper paperTableMapper) {
        this.paperTableMapper = paperTableMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getPaperTableMapper().deleteByPrimaryKey(id);
    }

    @Override
    public int insert(PaperTable record) {
        return this.getPaperTableMapper().insert(record);
    }

    @Override
    public int insertSelective(PaperTable record) {
        return this.getPaperTableMapper().insertSelective(record);
    }

    @Override
    public PaperTable selectByPrimaryKey(Integer id) {
        return this.getPaperTableMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(PaperTable record) {
        return this.getPaperTableMapper().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(PaperTable record) {
        return this.getPaperTableMapper().updateByPrimaryKey(record);
    }

    @Override
    public List<PaperTable> getOneYearAllPaper(String date1, String date2) {
        return this.getPaperTableMapper().getOneYearAllPaper(date1, date2);
    }

    @Override
    public List<PaperTable> getTeacherAllPaper(String teahcerID) {
        return this.getPaperTableMapper().getTeacherAllPaper(teahcerID);
    }

    @Override
    public List<PaperTable> getAllPaper() {
        return this.getPaperTableMapper().getAllPaper();
    }
}
