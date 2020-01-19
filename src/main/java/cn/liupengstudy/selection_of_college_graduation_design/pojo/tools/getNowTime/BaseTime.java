package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.getNowTime;

import java.util.Date;

public abstract class
BaseTime {

    private Date date;

    private String information;

    public BaseTime() {
        this.init();
    }

    public void init() {
        this.setDate(new Date());
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
