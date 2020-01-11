package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author liupeng
 * @version 1.0.0
 * @ClassName StringType.java
 * @Description TODO
 * @createTime 2020年01月08日 22:19:00
 */
@ApiModel(value = "String类型参数")
public class StringType {

    @ApiModelProperty(value = "string")
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "StringType{" +
                "string='" + string + '\'' +
                '}';
    }
}
