package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.mapper.ClassRelationshipTableMapper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.ClassRelationshipTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.ClassTypeByLiupeng;
import cn.liupengstudy.selection_of_college_graduation_design.service.ClassRelationshipTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liupeng
 * @version 1.0.0
 * @ClassName ClassRelationshipTableServiceImpl.java
 * @Description TODO
 * @createTime 2020年01月11日 21:13:00
 */
@Service
public class ClassRelationshipTableServiceImpl implements ClassRelationshipTableService {

    // databases mapper
    @Autowired
    private ClassRelationshipTableMapper classRelationshipTableMapper;

    /*
     * @Title getClassRelationshipTableMapper
     * @Description //TODO get class relation ship table mapper
     * @Param []
     * @return cn.liupengstudy.selection_of_college_graduation_design.mapper.ClassRelationshipTableMapper
     * @Date 1/11/2020 9:18 PM
     * @Author liupeng
     **/
    public ClassRelationshipTableMapper getClassRelationshipTableMapper() {
        return classRelationshipTableMapper;
    }

    /*
     * @Title setClassRelationshipTableMapper
     * @Description //TODO 色图class relation ship table mapper
     * @Param [classRelationshipTableMapper]
     * @return void
     * @Date 1/11/2020 9:18 PM
     * @Author liupeng
     **/
    public void setClassRelationshipTableMapper(ClassRelationshipTableMapper classRelationshipTableMapper) {
        this.classRelationshipTableMapper = classRelationshipTableMapper;
    }

    /*
     * @Title deleteByPrimaryKey
     * @Description //TODO delete this class in databases by it's id
     * @Param [id]
     * @return int
     * @Date 1/11/2020 8:55 PM
     * @Author liupeng
     **/
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.getClassRelationshipTableMapper().deleteByPrimaryKey(id);
    }

    /*
     * @Title insert
     * @Description //TODO insert a class information in databases
     * @Param [record]
     * @return int
     * @Date 1/11/2020 8:56 PM
     * @Author liupeng
     **/
    @Override
    public int insert(ClassRelationshipTable record) {
        return this.getClassRelationshipTableMapper().insert(record);
    }

    @Override
    public int insertSelective(ClassRelationshipTable record) {
        return 0;
    }

    /*
     * @Title selectByPrimaryKey
     * @Description //TODO select class information by id
     * @Param [id]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.ClassRelationshipTable
     * @Date 1/11/2020 9:20 PM
     * @Author liupeng
     **/
    @Override
    public ClassRelationshipTable selectByPrimaryKey(Integer id) {
        return this.getClassRelationshipTableMapper().selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ClassRelationshipTable record) {
        return 0;
    }

    /*
     * @Title updateByPrimaryKey
     * @Description //TODO update class information in databases
     * @Param [record]
     * @return int
     * @Date 1/11/2020 8:57 PM
     * @Author liupeng
     **/
    @Override
    public int updateByPrimaryKey(ClassRelationshipTable record) {
        return this.getClassRelationshipTableMapper().updateByPrimaryKey(record);
    }

    /**
     * @描述  find class information  by class id
     * @参数  [classTypeByLiupeng]
     * @返回值  java.util.List<cn.liupengstudy.selection_of_college_graduation_design.pojo.ClassRelationshipTable>
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/12 - 12:11 下午
     * @修改人和其它信息
     */
    @Override
    public List<ClassRelationshipTable> findClassRelationship(ClassTypeByLiupeng classTypeByLiupeng) {
        return this.getClassRelationshipTableMapper().findClassRelationship(
                classTypeByLiupeng.getCollageID(),
                classTypeByLiupeng.getProfessionalID(),
                classTypeByLiupeng.getYearOfAdmission(),
                classTypeByLiupeng.getClassNumber());
    }

}
