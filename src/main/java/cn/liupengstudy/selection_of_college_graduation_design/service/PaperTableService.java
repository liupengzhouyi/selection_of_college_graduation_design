package cn.liupengstudy.selection_of_college_graduation_design.service;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.PaperTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/20 - 1:38 上午
 * @修改人和其它信息
 */
public interface PaperTableService {
    int deleteByPrimaryKey(Integer id);

    int insert(PaperTable record);

    int insertSelective(PaperTable record);

    PaperTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PaperTable record);

    int updateByPrimaryKey(PaperTable record);

    List<PaperTable> getOneYearAllPaper(String date1, String date2);

    List<PaperTable> getTeacherAllPaper(String teahcerID);
}
