package com.torryharris.driver;

import com.torryharris.model.*;

public interface AnimalDemo {
    static void main(String[] args) {
        Mammal tiger=new Tiger();
        tiger.eat();
        tiger.feed();
        System.out.println("--------------------------------------------------------------");
        Mammal cow=new Cow();


    }
}
