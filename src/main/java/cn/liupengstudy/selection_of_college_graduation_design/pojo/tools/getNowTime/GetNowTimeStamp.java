package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.getNowTime;


public class GetNowTimeStamp extends BaseTime {

    /**
     * 构造函数
     */
    public GetNowTimeStamp() {
        super();
        this.function();
    }

    /**
     * core function: get time stamp
     */
    public void function(){
        this.setInformation(this.getDate().getTime() + "");
    }
}
