package cn.liupengstudy.selection_of_college_graduation_design.pojo;

import java.util.Date;

public class ChatInformationTable {
    private Integer id;

    private Integer groupid;

    private Integer idtype;

    private String bodyid;

    private String chat;

    private Date date;

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