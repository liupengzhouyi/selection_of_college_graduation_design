package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType;

/**
 * @文件名 cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType
 * @描述
 * @创建人 liupeng
 * @作者联系方式 LIUPENG.0@outlook.com
 * @创建时间 2020/1/20 - 4:39 下午
 * @修改人和其它信息
 */
public class GetYearsForFindPaper {

    private YearTpyeForFindPaper yearTpyeForFindPaper;

    private String beginYear;

    private String endYear;

    public GetYearsForFindPaper() {
    }

    public GetYearsForFindPaper(YearTpyeForFindPaper yearTpyeForFindPaper) {
        this.setYearTpyeForFindPaper(yearTpyeForFindPaper);
    }

    public YearTpyeForFindPaper getYearTpyeForFindPaper() {
        return yearTpyeForFindPaper;
    }

    public void setYearTpyeForFindPaper(YearTpyeForFindPaper yearTpyeForFindPaper) {
        this.yearTpyeForFindPaper = yearTpyeForFindPaper;
        this.setBeginYear(this.getYearTpyeForFindPaper().getYear() + "-01-01");
        this.setEndYear(this.getYearTpyeForFindPaper().getYear() + "-12-31");
    }

    public String getBeginYear() {
        return beginYear;
    }

    public void setBeginYear(String beginYear) {
        this.beginYear = beginYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }
}
