public class Branch extends College{
    private String branchName;
    private int branchId;

    public Branch(String collegeName, int collegeId, String collegePlace) {
        super(collegeName, collegeId, collegePlace);
    }

    public Branch(String collegeName, int collegeId, String collegePlace, String branchName, int branchId) {
        super(collegeName, collegeId, collegePlace);
        this.branchName = branchName;
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchName='" + branchName + '\'' +
                ", branchId=" + branchId +
                '}';
    }
}
