package cn.liupengstudy.selection_of_college_graduation_design.service.impl;

import cn.liupengstudy.selection_of_college_graduation_design.mapper.CollageAndProfessionalTableMapper;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.CollageAndProfessionalTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.CollageIDAndProfessionalIDType;
import cn.liupengstudy.selection_of_college_graduation_design.service.CollageAndProfessionalTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollageAndProfessionalTableServiceImpl implements CollageAndProfessionalTableService {

    @Autowired
    private CollageAndProfessionalTableMapper collageAndProfessionalTableMapper;

    public CollageAndProfessionalTableMapper getCollageAndProfessionalTableMapper() {
        return collageAndProfessionalTableMapper;
    }

    public void setCollageAndProfessionalTableMapper(CollageAndProfessionalTableMapper collageAndProfessionalTableMapper) {
        this.collageAndProfessionalTableMapper = collageAndProfessionalTableMapper;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(CollageAndProfessionalTable record) {
        return this.getCollageAndProfessionalTableMapper().insert(record);
    }

    @Override
    public int insertSelective(CollageAndProfessionalTable record) {
        return this.getCollageAndProfessionalTableMapper().insert(record);
    }

    @Override
    public CollageAndProfessionalTable selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(CollageAndProfessionalTable record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(CollageAndProfessionalTable record) {
        return this.getCollageAndProfessionalTableMapper().updateByPrimaryKey(record);
    }

    @Override
    public List<CollageAndProfessionalTable> findColleageAndProfessionalRelationshipByID(CollageIDAndProfessionalIDType collageIDAndProfessionalIDType) {
        return this.getCollageAndProfessionalTableMapper().findColleageAndProfessionalRelationshipByID(collageIDAndProfessionalIDType.getCollageID(), collageIDAndProfessionalIDType.getProfessionalID());
    }
}
