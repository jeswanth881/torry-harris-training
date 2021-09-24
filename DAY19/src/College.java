public class College {
    private String collegeName;
    private int collegeId;
    private String collegePlace;

    public College(String collegeName, int collegeId, String collegePlace) {
        this.collegeName = collegeName;
        this.collegeId = collegeId;
        this.collegePlace = collegePlace;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegePlace() {
        return collegePlace;
    }

    public void setCollegePlace(String collegePlace) {
        this.collegePlace = collegePlace;
    }

    @Override
    public String toString() {
        return "College{" +
                "collegeName='" + collegeName + '\'' +
                ", collegeId=" + collegeId +
                ", collegePlace='" + collegePlace + '\'' +
                '}';
    }
}
