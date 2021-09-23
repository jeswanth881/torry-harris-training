package com.torryharris.driver1;

import com.torryharris.model1.*;

public class VehicleDemo {
    public static void main(String[] args) {
       Car car =new Siwft();
       car.changeGear();
       car.move();
       System.out.println("------------------------------------------------------");
       Boat boat=new Titannic();
       boat.filoat();
       boat.move();
       System.out.println("------------------------------------------------------");
       AiroPlane airoPlane=new AirIndia();
       airoPlane.fly();
       airoPlane.move();
    }
}
