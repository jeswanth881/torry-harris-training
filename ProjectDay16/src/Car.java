public class Car {
    private String name,fuelType;
    private int engineCapacity,noOfGears;
    private double power;
    private Tyre tyre;
    private MusicSystem musicSystem;

    public Car(String name, String fuelType, int engineCapacity, int noOfGears, double power, Tyre tyre,MusicSystem musicSystem) {
        this.name = name;
        this.fuelType = fuelType;
        this.engineCapacity = engineCapacity;
        this.noOfGears = noOfGears;
        this.power = power;
        this.tyre = tyre;
        this.musicSystem=musicSystem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getNoOfGears() {
        return noOfGears;
    }

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
    public void accelerate(){
        System.out.println( name+" Car is Accelerating");
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public void applyBrake(){
        System.out.println(name+" Car is stopped slowly");
    }
    public void changeGear(int changedgear){
        if(changedgear<=noOfGears){
            System.out.println(name+" Car is changing it's gear to : "+changedgear);}
        else{
            System.out.println("changed gear should not exceed "+ noOfGears);
        }

    }
    public void steer(){
        System.out.println(name+" Car is changing it's direction");
    }
    public void drive(){
        System.out.println(name+" Car is driving");
    }
    public void dispalyFeatures(){
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Car name is "+name);
        System.out.println("fuel type is "+fuelType);
        System.out.println("power is "+power+"BHP");
        System.out.println("Engine capacity is "+engineCapacity);
        System.out.println("No of Gears "+noOfGears);
        System.out.println("Tyre Name is "+ tyre.getTyreName()+"."+"Tyre Size "+ tyre.getTyreSize());
        System.out.println("Music System name is "+musicSystem.getMusicSystemName());
        System.out.println("No of speakers is "+musicSystem.getNoOfSpeakers());
        System.out.println("Subwoofer is  "+musicSystem.isSubWoofer());
        System.out.println("LCD ScreenSize is "+musicSystem.getLcdScreenSize());
        System.out.println("--------------------------------------------------------------------------------");
    }

}
