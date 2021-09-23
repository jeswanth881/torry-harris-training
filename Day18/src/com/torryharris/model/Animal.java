package com.torryharris.model;

public interface Animal {
    void eat();
    void speed();

    static void main(String[] args) {
        Animal tiger= (Animal) new Tiger();
        tiger.eat();
        tiger.speed();
        System.out.println("--------------------------------------------------------------");
        Animal cheetah=new Cheetah();
        cheetah.eat();
        cheetah.speed();
        System.out.println("--------------------------------------------------------------");
        Shape triangle=new Triangle(10,30);
        triangle.setNoOfSides(8);
        triangle.area();
    }
}
