package cn.liupengstudy.selection_of_college_graduation_design.pojo.tools.dataType;

public class CollageAndProfessionalType {

    private String collage;

    private String professional;

    public CollageAndProfessionalType() {
    }

    public CollageAndProfessionalType(String collage, String professional) {
        this.collage = collage;
        this.professional = professional;
    }

    public String getCollage() {
        return collage;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    @Override
    public String toString() {
        return "CollageAndProfessionalType{" +
                "collage='" + collage + '\'' +
                ", professional='" + professional + '\'' +
                '}';
    }
}
