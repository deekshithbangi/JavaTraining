package com.bangi.model;

public class Rectangle  {

    private double length;
    private double breath;

    public Rectangle() {
        length = 1;
        breath = 1;
    }

    public Rectangle(double width) {
        this (5, width);
    }   
    
    public Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breath) {
        this.breath = breath;
    }

    public double getLength() {
        return this.length;
    }

    public double getBreath() {
        return this.breath;
    }

    public void displayAreaOfRectangle() {
        System.out.println("area : "+getLength() * getBreath());
    }
}