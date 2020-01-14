package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsDetailsTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.StudentsDetailsTableServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.controller
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/14 - 8:27 下午
 * @修改人和其它信息
 */

@RestController
@RequestMapping("/studentsDetailsInformation")
@Api(tags = "学生详细信息控制器", description = "提供学生详细信息的增删改查方法")
public class StudentsDetailsContrller {

    @Autowired
    private StudentsDetailsTableServiceImpl studentsDetailsTableServiceImpl;

    public StudentsDetailsTableServiceImpl getStudentsDetailsTableServiceImpl() {
        return studentsDetailsTableServiceImpl;
    }

    public void setStudentsDetailsTableServiceImpl(StudentsDetailsTableServiceImpl studentsDetailsTableServiceImpl) {
        this.studentsDetailsTableServiceImpl = studentsDetailsTableServiceImpl;
    }

    /**
     * @描述  add student details information to databases
     * @参数  [studentsDetailsTable]
     * @返回值  cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/14 - 8:31 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "添加学生详细信息")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation add(@RequestBody StudentsDetailsTable studentsDetailsTable) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("add student details information to databases");
        int key = this.getStudentsDetailsTableServiceImpl().insert(studentsDetailsTable);
        if (key == 1) {
            returnInformation.setKey(true);
            returnInformation.setWhy("add success");
        } else {
            returnInformation.setKey(false);
            returnInformation.setWhy("add error");
        }
        return returnInformation;
    }

}
