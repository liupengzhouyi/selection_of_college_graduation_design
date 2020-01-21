package cn.liupengstudy.selection_of_college_graduation_design.service;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ApplicationPaperTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.ApplicationPaperItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.service
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/21 - 1:06 下午
 * @修改人和其它信息
 */
public interface ApplicationPaperTableService {

    int deleteByPrimaryKey(Integer id);

    int insert(ApplicationPaperTable record);

    int insertSelective(ApplicationPaperTable record);

    ApplicationPaperTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ApplicationPaperTable record);

    int updateByPrimaryKey(ApplicationPaperTable record);

    ApplicationPaperTable findSame(ApplicationPaperItem applicationPaperItem);

    List<ApplicationPaperTable> getAllPass();

    List<ApplicationPaperTable> getAllNotPass();

    List<ApplicationPaperTable> getStudentAll(String studentID);

    int pass(Integer id);

    int notPass(Integer id);

}
