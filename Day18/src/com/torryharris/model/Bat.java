package com.torryharris.model;

public class Bat implements Mammal,Animal{
    @Override
    public void speed() {
        System.out.println("Bat spped is 12kmph");
    }

    @Override
    public void feed() {
        System.out.println("fedds bat baby");
    }

    @Override
    public void eat() {
        System.out.println("meat");
    }
}
