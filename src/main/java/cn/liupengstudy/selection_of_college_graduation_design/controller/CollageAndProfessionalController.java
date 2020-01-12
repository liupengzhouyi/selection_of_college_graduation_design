package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.CollageAndProfessionalTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.CollageAndProfessionalTableServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @Autowired
    private CollageAndProfessionalTableServiceImpl collageAndProfessionalTableServiceImpl;

    public CollageAndProfessionalTableServiceImpl getCollageAndProfessionalTableServiceImpl() {
        return collageAndProfessionalTableServiceImpl;
    }

    public void setCollageAndProfessionalTableServiceImpl(CollageAndProfessionalTableServiceImpl collageAndProfessionalTableServiceImpl) {
        this.collageAndProfessionalTableServiceImpl = collageAndProfessionalTableServiceImpl;
    }

    @ApiOperation(value = "添加学院-专业关系信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation addCollageAndProfessionalController(@RequestBody CollageAndProfessionalTable collageAndProfessionalTable) {
        ReturnInformation returnInformation = new ReturnInformation();

        returnInformation.setWhatYourDo("add collage and professional infoemation into databases");

        return returnInformation;
    }








}
