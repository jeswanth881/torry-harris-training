package com.torryharris.model;

public class Triangle extends Shape {
    private int height;
    private int length;

    public Triangle(int height, int length) {
        this.height = height;
        this.length = length;
        setNoOfSides(3);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void area() {
        System.out.println("Area of a triangle is : "+(length*height)/2);
    }
}
