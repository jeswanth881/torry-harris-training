package com.torryharris.model;

public abstract class Shape {
    private int noOfSides;
    abstract public void area();

    public int getNoOfSides() {
        return noOfSides;
    }

    public void setNoOfSides(int noOfSides) {
        this.noOfSides = noOfSides;
    }
}
