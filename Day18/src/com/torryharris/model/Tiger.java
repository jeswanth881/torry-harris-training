package com.torryharris.model;

public class Tiger implements Mammal{


    @Override
    public void feed() {
        System.out.println("Feeds new born tiger baby");

    }

    @Override
    public void eat() {
        System.out.println("tiger eats meat");
    }
}
