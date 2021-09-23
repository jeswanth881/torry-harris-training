public class Laptop {
    private int RAM,HDD;
    private String processor;
    private double screenSize;
    public void initialize(int R,int H,String p,double s){
        RAM = R;
        HDD = H;
        processor=p;
        screenSize=s;
    }
    public void display(){
        System.out.println("RAM is "+RAM+"GB");
        System.out.println("HDD is "+HDD+"GB");
        System.out.println("processor is "+processor);
        System.out.println("Screen Size is "+screenSize);

    }
}