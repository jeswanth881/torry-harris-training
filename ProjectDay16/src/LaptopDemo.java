public class LaptopDemo {
    public static void main(String[] args) {
        Laptop hp = new Laptop();
        hp.initialize(4,256,"intel",15.6);
        hp.display();
        Laptop dell = new Laptop();
        hp.initialize(8,256,"snapdragon",15.6);
        hp.display();
    }
}
