package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.getNowTime;

import java.text.SimpleDateFormat;

/**
 * funtion:获取当前时间
 * author：刘鹏
 * date:2019年8月29日
 * time:11点53分
 */
public class GetNowTime extends BaseTime {

    /**
     * 构造函数
     */
    public GetNowTime() {
        super();
        this.function();
    }

    /**
     * core function : get time
     */
    public void function() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        this.setInformation(dateFormat.format(this.getDate()));
    }

    /**
     * @param 返回java.sql.Time格式的
     */
    public java.sql.Time strToTime(String strDate) {
        String str = strDate;
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        java.util.Date d = null;
        try {
            d = format.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        java.sql.Time time = new java.sql.Time(d.getTime());
        return time.valueOf(str);
    }
}
