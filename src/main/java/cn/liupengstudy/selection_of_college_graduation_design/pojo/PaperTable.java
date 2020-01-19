package cn.liupengstudy.selection_of_college_graduation_design.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "论文表")
public class PaperTable {
    @ApiModelProperty(value = "自增ID")
    private Integer id;

    @ApiModelProperty(value = "论文题目")
    private String papername;

    @ApiModelProperty(value = "角色ID")
    private String teacherid;

    @ApiModelProperty(value = "上传时间")
    private Date releasedate;

    @ApiModelProperty(value = "文件下载地址")
    private String url;

    @ApiModelProperty(value = "是否被选")
    private Integer isselect;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPapername() {
        return papername;
    }

    public void setPapername(String papername) {
        this.papername = papername == null ? null : papername.trim();
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getIsselect() {
        return isselect;
    }

    public void setIsselect(Integer isselect) {
        this.isselect = isselect;
    }
}