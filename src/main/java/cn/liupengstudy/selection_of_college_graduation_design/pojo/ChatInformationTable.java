package cn.liupengstudy.selection_of_college_graduation_design.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "聊天信息")
public class ChatInformationTable {
    @ApiModelProperty(value = "自增ID")
    private Integer id;

    @ApiModelProperty(value = "小组ID")
    private Integer groupid;

    @ApiModelProperty(value = "发言人身份")
    private Integer idtype;

    @ApiModelProperty(value = "发言人ID")
    private String bodyid;

    @ApiModelProperty(value = "聊天信息")
    private String chat;

    @ApiModelProperty(value = "日期")
    private Date date;

    @ApiModelProperty(value = "时间")
    private Date time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Integer getIdtype() {
        return idtype;
    }

    public void setIdtype(Integer idtype) {
        this.idtype = idtype;
    }

    public String getBodyid() {
        return bodyid;
    }

    public void setBodyid(String bodyid) {
        this.bodyid = bodyid == null ? null : bodyid.trim();
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat == null ? null : chat.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}