package com.torryharris.model;

public class Rectangle extends Shape{
    private int length;
    private int breath;
    public Rectangle(int length,int breath) {
        this.length=length;
        this.breath=breath;
        setNoOfSides(4);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreath() {
        return breath;
    }

    public void setBreath(int breath) {
        this.breath = breath;
    }

    @Override
    public void area() {
        System.out.println("Area of a rectanglr is : "+(length*breath));
    }
}
