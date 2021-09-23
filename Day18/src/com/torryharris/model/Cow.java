package com.torryharris.model;

public class Cow implements Mammal{

    @Override
    public void feed() {
        System.out.println("Feeds milk for new born cattle");

    }

    @Override
    public void eat() {
        System.out.println("Cow eats grass");
    }
}
