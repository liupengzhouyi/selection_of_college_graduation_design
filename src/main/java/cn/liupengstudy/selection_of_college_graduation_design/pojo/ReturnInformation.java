package cn.liupengstudy.selection_of_college_graduation_design.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author liupeng
 * @version 1.0.0
 * @ClassName ReturnInformation.java
 * @Description TODO
 * @createTime 2020年01月08日 23:15:00
 */
@ApiModel(value = "返回信息实体")
public class ReturnInformation {

    @ApiModelProperty(value = "做了什么")
    private String whatYourDo;

    @ApiModelProperty(value = "returnNumber")
    private int number;

    @ApiModelProperty(value = "return boolean")
    private boolean key;

    @ApiModelProperty(value = "returnObject")
    private Object returnObject;

    @ApiModelProperty(value = "为什么")
    private String why;

    public String getWhatYourDo() {
        return whatYourDo;
    }

    public void setWhatYourDo(String whatYourDo) {
        this.whatYourDo = whatYourDo;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

    public Object getReturnObject() {
        return returnObject;
    }

    public void setReturnObject(Object returnObject) {
        this.returnObject = returnObject;
    }

    public String getWhy() {
        return why;
    }

    public void setWhy(String why) {
        this.why = why;
    }

    @Override
    public String toString() {
        return "ReturnInformation{" +
                "whatYourDo='" + whatYourDo + '\'' +
                ", number=" + number +
                ", key=" + key +
                ", returnObject=" + returnObject.toString() +
                ", why='" + why + '\'' +
                '}';
    }
}
