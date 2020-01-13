package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.ClassInformationTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.StringType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.ClassInformationServiceImpl;
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
 * @ClassName ClassInformationController.java
 * @Description TODO
 * @createTime 2020年01月13日 16:59:00
 */
@RestController
@RequestMapping("/classInformation")
@Api(tags = "班级人员分配控制器", description = "提供班级班级人员分配控制器的增删改查方法")
public class ClassInformationController {

    @Autowired
    private ClassInformationServiceImpl classInformationServiceImpl;

    /*
     * @Title getClassInformationServiceImpl
     * @Description //TODO get class information service
     * @Param []
     * @return cn.liupengstudy.selection_of_college_graduation_design.service.impl.ClassInformationServiceImpl
     * @Date 1/13/2020 5:03 PM
     * @Author liupeng
     **/
    public ClassInformationServiceImpl getClassInformationServiceImpl() {
        return classInformationServiceImpl;
    }

    /*
     * @Title setClassInformationServiceImpl
     * @Description //TODO set class information service
     * @Param [classInformationServiceImpl]
     * @return void
     * @Date 1/13/2020 5:04 PM
     * @Author liupeng
     **/
    public void setClassInformationServiceImpl(ClassInformationServiceImpl classInformationServiceImpl) {
        this.classInformationServiceImpl = classInformationServiceImpl;
    }

    /*
     * @Title add
     * @Description //TODO add class information innto databases
     * @Param [classInformationTable]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @Date 1/13/2020 5:15 PM
     * @Author liupeng
     **/
    @ApiOperation(value = "添加班级成员信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation add(@RequestBody ClassInformationTable classInformationTable) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("add class information into databases");
        int k = this.getClassInformationServiceImpl().insert(classInformationTable);
        if (k == 1) {
            returnInformation.setKey(true);
            returnInformation.setWhy("add success");
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("add error");
        }

        return returnInformation;
    }

    /*
     * @Title findInformationByStudentID
     * @Description //TODO find class information by student id
     * @Param [stringType]
     * @return cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @Date 1/13/2020 5:46 PM
     * @Author liupeng
     **/
    @ApiOperation(value = "通过学生ID查找班级成员信息")
    @RequestMapping(value = "/finByID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation findInformationByStudentID(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("find class information by student id");
        List<ClassInformationTable> list = this.getClassInformationServiceImpl().selectClassByStudentID(stringType.getString());
        if (list.size() == 0) {
            returnInformation.setKey(false);
            returnInformation.setNumber(-9);
            returnInformation.setWhy("find error, no information in databases");
        } else {
            returnInformation.setKey(true);
            returnInformation.setNumber(list.get(0).getId());
            returnInformation.setWhy("find success");
            returnInformation.setReturnObject(list);
        }
        return returnInformation;
    }






}
