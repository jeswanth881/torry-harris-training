package com.torryharris.model1;

public class Siwft implements Car{
    @Override
    public void changeGear() {
        System.out.println("Car Siwft is Changed to gear 2.");
    }

    @Override
    public void move() {
        System.out.println("Car swift is moving in the road");

    }
}
