package cn.liupengstudy.selection_of_college_graduation_design.controller;

import cn.liupengstudy.selection_of_college_graduation_design.pojo.StudentsDetailsTable;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType.StringType;
import cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation;
import cn.liupengstudy.selection_of_college_graduation_design.service.impl.StudentsDetailsTableServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        StringType stringType = new StringType();
        stringType.setString(studentsDetailsTable.getStudentid());
        ReturnInformation returnInformation = this.findByStudentID(stringType);
        int has = 0;
        if (returnInformation.isKey()) {
            has = 1;
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("add student details information to databases");
        if (has == 1) {
            returnInformation.setKey(false);
            returnInformation.setWhy("add error,the same information in databases");
        } else {
            int key = this.getStudentsDetailsTableServiceImpl().insert(studentsDetailsTable);
            if (key == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("add success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("add error");
            }
        }
        return returnInformation;
    }

    /**
     * @描述  delete student details information to databases
     * @参数  [stringType]
     * @返回值  cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/14 - 9:17 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "通过学生ID删除学生详细信息")
    @RequestMapping(value = "/delete", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation deleteByID(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = this.findByStudentID(stringType);
        int has = 0;
        int id = -9;
        if (returnInformation.isKey()) {
            has = 1;
            id = returnInformation.getNumber();
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("delete student details information to databases");
        if (has == 0) {
            returnInformation.setKey(false);
            returnInformation.setWhy("delete error,no information in the databases");
        } else {
            int key = this.getStudentsDetailsTableServiceImpl().deleteByPrimaryKey(id);
            if (key == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("delete success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("delete error");
            }
        }
        return returnInformation;
    }

    /**
     * @描述  update student details information to databases
     * @参数  [studentsDetailsTable]
     * @返回值  cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/14 - 9:19 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "更新学生详细信息")
    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation update(@RequestBody StudentsDetailsTable studentsDetailsTable) {
        StringType stringType = new StringType();
        stringType.setString(studentsDetailsTable.getStudentid());
        ReturnInformation returnInformation = this.findByStudentID(stringType);
        int has = 0;
        if (returnInformation.isKey()) {
            has = 1;
            studentsDetailsTable.setId(returnInformation.getNumber());
        }
        returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("update student details information to databases");
        if (has == 0) {
            returnInformation.setKey(false);
            returnInformation.setWhy("update error, no information in databases");
        } else {
            int key = this.getStudentsDetailsTableServiceImpl().updateByPrimaryKey(studentsDetailsTable);
            if (key == 1) {
                returnInformation.setKey(true);
                returnInformation.setWhy("update success");
            } else {
                returnInformation.setKey(false);
                returnInformation.setWhy("update error");
            }
        }
        return returnInformation;
    }

    /**
     * @描述  find student details information in databases by student number
     * @参数  [stringType]
     * @返回值  cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.returnType.ReturnInformation
     * @创建人  liupeng
     * @作者联系方式 LIUPENG.0@outlook.com
     * @创建时间  2020/1/14 - 8:57 下午
     * @修改人和其它信息
     */
    @ApiOperation(value = "通过学号学生详细信息")
    @RequestMapping(value = "/findByStudentID", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ReturnInformation findByStudentID(@RequestBody StringType stringType) {
        ReturnInformation returnInformation = new ReturnInformation();
        returnInformation.setWhatYourDo("find student details information in databases by student number");
        List<StudentsDetailsTable> list = this.getStudentsDetailsTableServiceImpl().findByStudentID(stringType.getString());
        if (list.size() == 0) {
            returnInformation.setKey(false);
            returnInformation.setWhy("find error");
            returnInformation.setNumber(-9);
        } else {
            returnInformation.setKey(true);
            returnInformation.setNumber(list.get(0).getId());
            returnInformation.setWhy("find success");
            returnInformation.setReturnObject(list);
        }
        return returnInformation;
    }

}
