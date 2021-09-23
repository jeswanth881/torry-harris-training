package com.torryharris.model1;

public class AirIndia implements AiroPlane{
    @Override
    public void fly() {
        System.out.println("Airoplane AirIndia is flying in the sky");
    }

    @Override
    public void move() {
        System.out.println("Airoplane AirIndia is moving");

    }
}
