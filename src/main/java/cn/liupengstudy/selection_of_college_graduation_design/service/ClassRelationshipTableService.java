package cn.liupengstudy.selection_of_college_graduation_design.service;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ClassRelationshipTable;
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

    /*
     * @Title findClassInformationByclassID
     * @Description //TODO find class information  by class id
     * @Param [classID]
     * @return java.util.List<cn.liupengstudy.selection_of_college_graduation_design.pojo.ClassRelationshipTable>
     * @Date 1/11/2020 9:03 PM
     * @Author liupeng
     **/
    // List<ClassRelationshipTable> findClassInformationByclassID(int collageID, int professionallID, int yearOfAdmission, int classNUmber);


}
