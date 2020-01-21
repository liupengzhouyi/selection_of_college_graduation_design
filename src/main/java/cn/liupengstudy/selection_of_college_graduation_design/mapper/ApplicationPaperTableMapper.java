package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ApplicationPaperTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.IntegerType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ApplicationPaperTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ApplicationPaperTable record);

    int insertSelective(ApplicationPaperTable record);

    ApplicationPaperTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApplicationPaperTable record);

    int updateByPrimaryKey(ApplicationPaperTable record);

    ApplicationPaperTable findSame(@Param("paperID") Integer paperID, @Param("studentID") String sstudentID, @Param("iPass") Integer isPass);

    List<ApplicationPaperTable> getStudentAll(@Param("studentID") String studentID);

    List<ApplicationPaperTable> getAllPass();

    List<ApplicationPaperTable> getAllNotPass();

    int pass(@Param("id") Integer id);

    int notPass(@Param("id") Integer id);
}