package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.getNowTime;


import java.text.SimpleDateFormat;

/**
 * funtion:获取当前日期
 * author：刘鹏
 * date:2019年8月29日
 * time:11点40分
 */
public class GetNowDate extends BaseTime {

    /**
     * 构造函数
     */
    public GetNowDate() {
        super();
        this.function();
    }

    /**
     * core function : get date
     */
    public void function() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.setInformation(dateFormat.format(this.getDate()));
    }

    public java.sql.Date strToDate(String strDate) {
        String str = strDate;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date d = null;
        try {
            d = format.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.sql.Date date = new java.sql.Date(d.getTime());
        return date;
    }



}
