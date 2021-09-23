package com.torryharris.driver;

import com.torryharris.model.Rectangle;
import com.torryharris.model.Shape;
import com.torryharris.model.Triangle;

public class ShapeDemo {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(10,20);
        triangle.area();
        Shape shape=new Triangle(10,30);
        shape.area();
        Shape shape1=new Rectangle(10,40);
        shape1.area();
    }

}
