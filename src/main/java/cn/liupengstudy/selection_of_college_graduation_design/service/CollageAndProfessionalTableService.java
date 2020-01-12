package cn.liupengstudy.selection_of_college_graduation_design.service;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.CollageAndProfessionalTable;

public interface CollageAndProfessionalTableService {

    int deleteByPrimaryKey(Integer id);

    int insert(CollageAndProfessionalTable record);

    int insertSelective(CollageAndProfessionalTable record);

    CollageAndProfessionalTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CollageAndProfessionalTable record);

    int updateByPrimaryKey(CollageAndProfessionalTable record);

}
