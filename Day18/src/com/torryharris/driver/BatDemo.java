package com.torryharris.driver;

import com.torryharris.model.Animal;
import com.torryharris.model.Bat;
import com.torryharris.model.Mammal;

public class BatDemo {
    public static void main(String[] args) {
        Mammal bat=new Bat();
        Animal bat1=new Bat();
        bat.eat();
        bat1.eat();
        bat.feed();
        bat1.speed();
    }
}
