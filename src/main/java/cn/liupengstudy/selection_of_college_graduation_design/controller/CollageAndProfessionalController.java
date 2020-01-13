package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.CollageAndProfessionalTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.CollageAndProfessionalType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.CollageIDAndProfessionalIDType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.CollageAndProfessionalTableServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author liupeng
 * @version 1.0.0
 * @ClassName ClassRelationshipTableController.java
 * @Description TODO
 * @createTime 2020年01月11日 21:40:00
 */
@RestController
@RequestMapping("/collageAndProfessional")
@Api(tags = "学院-专业关系控制器", description = "提供学院-专业关系控制器的增删改查方法")
public class CollageAndProfessionalController {

    // collage and professional relationship service
    @Autowired
    private CollageAndProfessionalTableServiceImpl collageAndProfessionalTableServiceImpl;

    /*
     * @Title getCollageAndProfessionalTableServiceImpl
     * @Description //TODO get collage and professional relationship service
     * @Param []
     * @return cn.liupengstudy.selection_of_college_graduation_design.service.impl.CollageAndProfessionalTableServiceImpl
     * @Date 1/13/2020 12:24 PM
     * @Author liupeng
     **/
    public CollageAndProfessionalTableServiceImpl getCollageAndProfessionalTableServiceImpl() {
        return collageAndProfessionalTableServiceImpl;
    }

    /*
     * @Title setCollageAndProfessionalTableServiceImpl
     * @Description //TODO set collage and professional relationship service
     * @Param [collageAndProfessionalTableServiceImpl]
     * @return void
     * @Date 1/13/2020 12:24 PM
     * @Author liupeng
     **/
    public void setCollageAndProfessionalTableServiceImpl(CollageAndProfessionalTableServiceImpl collageAndProfessionalTableServiceImpl) {
        this.collageAndProfessionalTableServiceImpl = collageAndProfessionalTableServiceImpl;
    }

    /*
     * @Title addCollageAndProfessionalController
     * @Description //TODO add collage and professional information into databases
     * @Param [collageAndProfessionalTable]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @Date 1/13/2020 12:22 PM
     * @Author liupeng
     **/
    @ApiOperation(value = "添加学院-专业关系信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation addCollageAndProfessionalController(@RequestBody CollageAndProfessionalTable collageAndProfessionalTable) {
        CollageIDAndProfessionalIDType collageIDAndProfessionalIDType = new CollageIDAndProfessionalIDType();
        collageIDAndProfessionalIDType.getCollageIDAndProfessionalIDTypeByCollageAndProfessionalTable(collageAndProfessionalTable);
        ReturnInformation returnInformation = this.findColleageAndProfessionalRelationshipByID(collageIDAndProfessionalIDType);
        int has = 0;
        if (returnInformation.isKey()) {
            has = 1;
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("add collage and professional infoemation into databases");
        if (has == 0) {
            int key = this.getCollageAndProfessionalTableServiceImpl().insert(collageAndProfessionalTable);
            if (key == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("add success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("add error");
            }
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("add error, because there is the same information in databases");
        }
        return returnInformation;
    }



    /*
     * @Title update
     * @Description //TODO update collage and professional information
     * @Param [collageAndProfessionalTable]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @Date 1/13/2020 12:21 PM
     * @Author liupeng
     **/
    @ApiOperation(value = "更新学院-专业关系信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation update(@RequestBody CollageAndProfessionalTable collageAndProfessionalTable) {
        CollageIDAndProfessionalIDType collageIDAndProfessionalIDType = new CollageIDAndProfessionalIDType();
        collageIDAndProfessionalIDType.getCollageIDAndProfessionalIDTypeByCollageAndProfessionalTable(collageAndProfessionalTable);
        ReturnInformation returnInformation = this.findColleageAndProfessionalRelationshipByID(collageIDAndProfessionalIDType);
        int has = 0;
        if (returnInformation.isKey()) {
            has = 1;
            collageAndProfessionalTable.setId(returnInformation.getNumber());
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("update collage and professional infoemation into databases");
        if (has == 1) {
            int key = this.getCollageAndProfessionalTableServiceImpl().updateByPrimaryKey(collageAndProfessionalTable);
            if (key == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("update success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("update error");
            }
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("update error, because there is the same information in databases");
        }
        return returnInformation;
    }

    /*
     * @Title findColleageAndProfessionalRelationshipByID
     * @Description //TODO find collage and professional relationship
     * @Param [collageIDAndProfessionalIDType]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @Date 1/13/2020 12:20 PM
     * @Author liupeng
     **/
    @ApiOperation(value = "查询学院-专业关系信息")
    @RequestMapping(value = "/findByID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation findColleageAndProfessionalRelationshipByID(@RequestBody CollageIDAndProfessionalIDType collageIDAndProfessionalIDType) {
        ReturnInformation returnInformation = new ReturnInformation();
        List<CollageAndProfessionalTable> list = this.getCollageAndProfessionalTableServiceImpl().findColleageAndProfessionalRelationshipByID(collageIDAndProfessionalIDType);
        returnInformation.setWhatYourDo("find collage and professional");
        if (list.size() == 1) {
            returnInformation.setKey(true);
            returnInformation.setNumber(list.get(0).getId());
            returnInformation.setWhy("find success");
        } else {
            returnInformation.setKey(false);
            returnInformation.setNumber(-9);
            returnInformation.setWhy("find error, no information in databases");
        }
        return returnInformation;
    }
}
