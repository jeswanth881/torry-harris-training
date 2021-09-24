public class Main {
    public static void main(String[] args) {
        College college=new College("RIT",2117,"Chennai");
        Branch branch=new Branch("RIT",2117,"Chennai","EEE",105);
        Student student=new Student("RIT",2117,"Chennai","EEE",105,"Jeswanth Kumar K R",5014);
        System.out.println(college.toString());
        System.out.println(branch.toString());
        System.out.println(student.toString());
        student.display();
    }
}
