package cn.liupengstudy.selection_of_college_graduation_design.service;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ClassRelationshipTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.ClassTypeByLiupeng;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author liupeng
 * @version 1.0.0
 * @ClassName ClassRelationshipTableService.java
 * @Description TODO
 * @createTime 2020年01月11日 21:13:00
 */
public interface ClassRelationshipTableService {

    /*
     * @Title deleteByPrimaryKey
     * @Description //TODO delete this class in databases by it's id
     * @Param [id]
     * @return int
     * @Date 1/11/2020 8:55 PM
     * @Author liupeng
     **/
    int deleteByPrimaryKey(Integer id);

    /*
     * @Title insert
     * @Description //TODO insert a class information in databases
     * @Param [record]
     * @return int
     * @Date 1/11/2020 8:56 PM
     * @Author liupeng
     **/
    int insert(ClassRelationshipTable record);

    int insertSelective(ClassRelationshipTable record);

    ClassRelationshipTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassRelationshipTable record);

    /*
     * @Title updateByPrimaryKey
     * @Description //TODO update class information in databases
     * @Param [record]
     * @return int
     * @Date 1/11/2020 8:57 PM
     * @Author liupeng
     **/
    int updateByPrimaryKey(ClassRelationshipTable record);

    /**
     * @描述 find class relationship information  by class id
     * @参数  [classTypeByLiupeng]
     * @返回值  java.util.List<cn.liupengstudy.selection_of_college_graduation_design.pojo.ClassRelationshipTable>
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/12 - 12:10 下午
     * @修改人和其它信息
     */
    List<ClassRelationshipTable> findClassRelationship(ClassTypeByLiupeng classTypeByLiupeng);

}
