public class Student extends Branch{
    private String studentName;
    private int universitySeatNumber;

    public Student(String collegeName, int collegeId, String collegePlace, String branchName, int branchId) {
        super(collegeName, collegeId, collegePlace, branchName, branchId);
    }

    public Student(String collegeName, int collegeId, String collegePlace, String branchName, int branchId, String studentName, int universitySeatNumber) {
        super(collegeName, collegeId, collegePlace, branchName, branchId);
        this.studentName = studentName;
        this.universitySeatNumber = universitySeatNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getUniversitySeatNumber() {
        return universitySeatNumber;
    }

    public void setUniversitySeatNumber(int universitySeatNumber) {
        this.universitySeatNumber = universitySeatNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", universitySeatNumber=" + universitySeatNumber +
                '}';
    }
    public void display(){
        System.out.println("College Name is : "+getCollegeName()+" "+"College Id is : "+getCollegeId()+" "+"College Place is : "+getCollegePlace()+" "+"Branch Name is : "+getBranchName()+" "+"Branch Id is : "+getBranchId()+" "+"Student Name is : "+getStudentName()
        +" "+"Student Id is : "+getUniversitySeatNumber());
    }
}
