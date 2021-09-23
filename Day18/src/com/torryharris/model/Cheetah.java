package com.torryharris.model;

public class Cheetah implements Animal{
    @Override
    public void eat() {
        System.out.println("Cheetah eats 2 galans of food");
    }

    @Override
    public void speed() {
        System.out.println("Cheetah runs at a speed of 100kmph");
    }
}
