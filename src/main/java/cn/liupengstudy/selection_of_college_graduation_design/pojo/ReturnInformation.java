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

    @ApiModelProperty(value = "结果")
    private String results;

    @ApiModelProperty(value = "为什么")
    private String whay;

    @ApiModelProperty(value = "是否")
    private boolean key;

    @ApiModelProperty(value = "returnObject")
    private Object returnObject;

    public String getWhatYourDo() {
        return whatYourDo;
    }

    public void setWhatYourDo(String whatYourDo) {
        this.whatYourDo = whatYourDo;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getWhay() {
        return whay;
    }

    public void setWhay(String whay) {
        this.whay = whay;
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

    @Override
    public String toString() {
        return "ReturnInformation{" +
                "whatYourDo='" + whatYourDo + '\'' +
                ", results='" + results + '\'' +
                ", whay='" + whay + '\'' +
                ", key=" + key +
                ", returnObject=" + returnObject.toString() +
                '}';
    }
}
