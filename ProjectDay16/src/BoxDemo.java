public class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.intialize(100,50,200);
        b1.display();
        System.out.println("Volume of Box is "+b1.getvolume());
        b1.setLength(b1.getLength()+(b1.getLength()*10/100));
        b1.setHeight(b1.getHeight()+(b1.getHeight()*20/100));
        b1.setWidth(b1.getWidth()+(b1.getWidth()*8/100));
        b1.display();
        System.out.println("Volume of Increased Box is "+b1.getvolume());
    }
}