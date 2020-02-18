package cn.liupengstudy.selection_of_college_graduation_design.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.pojo
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/2/18 - 11:52 下午
 * @修改人和其它信息
 */

@ApiModel(value = "聊天信息第二版")
public class CharInformationVersionII {

    @ApiModelProperty(value = "聊天ID")
    private int id;

    @ApiModelProperty(value = "聊天人")
    private int IDtype;

    @ApiModelProperty(value = "聊天人ID")
    private String bodyID;

    @ApiModelProperty(value = "聊天人姓名")
    private String name;

    @ApiModelProperty(value = "聊天日期")
    private String data;

    @ApiModelProperty(value = "聊天时间")
    private String timee;

    @ApiModelProperty(value = "聊天信息")
    private String chat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIDtype() {
        return IDtype;
    }

    public void setIDtype(int IDtype) {
        this.IDtype = IDtype;
    }

    public String getBodyID() {
        return bodyID;
    }

    public void setBodyID(String bodyID) {
        this.bodyID = bodyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTimee() {
        return timee;
    }

    public void setTimee(String timee) {
        this.timee = timee;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    @Override
    public String toString() {
        return "CharInformationVersionII{" +
                "id=" + id +
                ", IDtype=" + IDtype +
                ", bodyID='" + bodyID + '\'' +
                ", name='" + name + '\'' +
                ", data='" + data + '\'' +
                ", timee='" + timee + '\'' +
                ", chat='" + chat + '\'' +
                '}';
    }
}
