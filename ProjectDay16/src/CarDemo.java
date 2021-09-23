public class CarDemo {
    public static void main(String[] args) {
        Tyre mrf = new Tyre("MRF",18) {};
        MusicSystem panasonic = new MusicSystem("panasonic",6,true,15){};
        Car swift = new Car("Swift", "Petrol", 125, 5, 9.5,mrf,panasonic) {

        };
        Car audi = new Car("AUDI", "Diesel", 225, 5, 12.5,mrf,panasonic) {

        };
        Car jaguar = new Car("JAGUAR", "Diesel", 245, 5, 14,mrf,panasonic) {

        };
        Car rollsRoyce = new Car("ROLLSROYCE", "Petrol", 255, 5, 25.5,mrf,panasonic) {

        };
        rollsRoyce.drive();
        rollsRoyce.changeGear(4);
        rollsRoyce.changeGear(7);
        swift.dispalyFeatures();
    }
}
