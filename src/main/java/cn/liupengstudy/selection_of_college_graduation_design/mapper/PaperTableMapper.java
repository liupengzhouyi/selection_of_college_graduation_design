package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.PaperTable;
import io.swagger.annotations.ApiModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PaperTableMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(PaperTable record);

    int insertSelective(PaperTable record);

    PaperTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PaperTable record);

    int updateByPrimaryKey(PaperTable record);

    List<PaperTable> getOneYearAllPaper(@Param("date1") String date1, @Param("date1") String date2);

    List<PaperTable> getTeacherAllPaper(@Param("teahcerID") String teahcerID);
}