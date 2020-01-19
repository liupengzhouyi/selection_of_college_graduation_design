package cn.liupengstudy.selection_of_college_graduation_design.mapper;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.PaperTable;

public interface PaperTableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PaperTable record);

    int insertSelective(PaperTable record);

    PaperTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PaperTable record);

    int updateByPrimaryKey(PaperTable record);
}