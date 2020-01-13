package cn.liupengstudy.selection_of_college_graduation_design.service;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.CollageAndProfessionalTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.CollageIDAndProfessionalIDType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.CollageNameAndProfessionalNameType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CollageAndProfessionalTableService {

    int deleteByPrimaryKey(Integer id);

    int insert(CollageAndProfessionalTable record);

    int insertSelective(CollageAndProfessionalTable record);

    CollageAndProfessionalTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CollageAndProfessionalTable record);

    int updateByPrimaryKey(CollageAndProfessionalTable record);

    List<CollageAndProfessionalTable> findColleageAndProfessionalRelationshipByID(CollageIDAndProfessionalIDType collageIDAndProfessionalIDType);

    List<CollageAndProfessionalTable> findByName(CollageNameAndProfessionalNameType collageNameAndProfessionalNameType);
}
