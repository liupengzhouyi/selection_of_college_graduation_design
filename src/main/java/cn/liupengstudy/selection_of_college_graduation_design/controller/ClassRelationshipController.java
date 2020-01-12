package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ClassRelationshipTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.ClassTypeByLiupeng;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.service.ClassRelationshipTableService;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.ClassRelationshipTableServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@RequestMapping("/classRelationship")
@Api(tags = "班级关系控制器", description = "提供班级关系控制器的增删改查方法")
public class ClassRelationshipController {

    // class relationship service
    @Autowired
    private ClassRelationshipTableServiceImpl classRelationshipTableServiceImpl;

    /*
     * @Title getClassRelationshipTableServiceImpl
     * @Description //TODO get class relationship service
     * @Param []
     * @return cn.liupengstudy.selection_of_college_graduation_design.service.impl.ClassRelationshipTableServiceImpl
     * @Date 1/11/2020 9:42 PM
     * @Author liupeng
     **/
    public ClassRelationshipTableServiceImpl getClassRelationshipTableServiceImpl() {
        return classRelationshipTableServiceImpl;
    }

    /*
     * @Title setClassRelationshipTableServiceImpl
     * @Description //TODO set class relationship service
     * @Param []
     * @return cn.liupengstudy.selection_of_college_graduation_design.service.impl.ClassRelationshipTableServiceImpl
     * @Date 1/11/2020 9:42 PM
     * @Author liupeng
     **/
    public void setClassRelationshipTableServiceImpl(ClassRelationshipTableServiceImpl classRelationshipTableServiceImpl) {
        this.classRelationshipTableServiceImpl = classRelationshipTableServiceImpl;
    }

    @ApiOperation(value = "添加班级关系信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public String add(@RequestBody ClassRelationshipTable classRelationshipTable) {
        System.out.println(classRelationshipTable.toString());
        int k = this.getClassRelationshipTableServiceImpl().insert(classRelationshipTable);
        if (k == 1) {
            return "Success";
        } else {
            return "Error";
        }
    }


    /**
     * @描述 find class relationship infoermation
     * @参数  [classTypeByLiupeng]
     * @返回值  cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/12 - 2:03 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "查找班级关系信息")
    @RequestMapping(value = "/find", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation findClassRelationship(@RequestBody ClassTypeByLiupeng classTypeByLiupeng) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("find class relationship infoermation");
        System.out.println(classTypeByLiupeng.toString());
        List<ClassRelationshipTable> list = this.getClassRelationshipTableServiceImpl().findClassRelationship(classTypeByLiupeng);
        if (list.size() == 0) {
            returnInformation.setKey(false);
            returnInformation.setWhy("find error, no this information in databases");
        } else {
            returnInformation.setKey(true);
            returnInformation.setWhy("find Success");
            returnInformation.setNumber(list.get(0).getId());
            returnInformation.setReturnObject(list);
        }
        return returnInformation;
    }
}
