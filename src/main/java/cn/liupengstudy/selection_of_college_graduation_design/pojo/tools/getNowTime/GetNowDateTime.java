package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.getNowTime;


import java.text.SimpleDateFormat;

/**
 * funtion:获取当前日期-时间
 * author：刘鹏
 * date:2019年8月29日
 * time:11点53分
 */
public class GetNowDateTime extends BaseTime {

    /**
     * constructors
     */
    public GetNowDateTime() {
        super();
        this.function();
    }

    /**
     * core function : get date time
     */
    public void function() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.setInformation(dateFormat.format(this.getDate()));
    }
}
