package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.CollageAndProfessionalTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface CollageAndProfessionalTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CollageAndProfessionalTable record);

    int insertSelective(CollageAndProfessionalTable record);

    CollageAndProfessionalTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CollageAndProfessionalTable record);

    int updateByPrimaryKey(CollageAndProfessionalTable record);

    List<CollageAndProfessionalTable> findColleageAndProfessionalRelationshipByID(@Param("collageID")Integer collageID, @Param("professionnalID")Integer professionnalID);
}