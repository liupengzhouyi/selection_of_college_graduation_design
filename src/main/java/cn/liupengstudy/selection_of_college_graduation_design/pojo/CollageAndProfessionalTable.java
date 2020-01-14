package cn.liupengstudy.selection_of_college_graduation_design.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "学院专业关系")
public class CollageAndProfessionalTable {
    @ApiModelProperty(value = "自增ID")
    private Integer id;

    @ApiModelProperty(value = "学院ID")
    private Integer collageid;

    @ApiModelProperty(value = "学院名称")
    private String collagename;

    @ApiModelProperty(value = "学院ID")
    private Integer professionalid;

    @ApiModelProperty(value = "学院名称")
    private String professionalname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCollageid() {
        return collageid;
    }

    public void setCollageid(Integer collageid) {
        this.collageid = collageid;
    }

    public String getCollagename() {
        return collagename;
    }

    public void setCollagename(String collagename) {
        this.collagename = collagename == null ? null : collagename.trim();
    }

    public Integer getProfessionalid() {
        return professionalid;
    }

    public void setProfessionalid(Integer professionalid) {
        this.professionalid = professionalid;
    }

    public String getProfessionalname() {
        return professionalname;
    }

    public void setProfessionalname(String professionalname) {
        this.professionalname = professionalname == null ? null : professionalname.trim();
    }
}