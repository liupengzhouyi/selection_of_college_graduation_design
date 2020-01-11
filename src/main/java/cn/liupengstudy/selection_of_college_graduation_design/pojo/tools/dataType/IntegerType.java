package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;

/**
 * @author liupeng
 * @version 1.0.0
 * @ClassName IntegerType.java
 * @Description TODO
 * @createTime 2020年01月08日 22:25:00
 */

@ApiModel(value = "数字类型参数")
public class IntegerType {

    @ApiModelProperty(value = "数字")
    private Integer integer;

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    @Override
    public String toString() {
        return "IntegerType{" +
                "integer=" + integer +
                '}';
    }
}


