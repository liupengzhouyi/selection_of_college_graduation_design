package cn.liupengstudy.selection_of_college_graduation_design.service;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ClassInformationTable;

public interface ClassInformationService {

    int deleteByPrimaryKey(Integer id);

    int insert(ClassInformationTable record);

    int insertSelective(ClassInformationTable record);

    ClassInformationTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassInformationTable record);

    int updateByPrimaryKey(ClassInformationTable record);

}
