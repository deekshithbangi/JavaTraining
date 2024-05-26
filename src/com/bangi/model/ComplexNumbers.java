package com.bangi.model;

public class ComplexNumbers {
    private double real;
    private double imaginary;
    
    public ComplexNumbers() { // Default constructor
        this.real = 0;
        this.imaginary = 0;
    }
    
    public ComplexNumbers(double real, double imaginary) { // Parameterized constructor
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public void setReal(double real) {
        this.real = real;
    }
    
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }
    
    public double getImaginary() {
        return this.imaginary;
    }
    
    public double add(ComplexNumbers other) {
        double sum = this.real + other.imaginary;
        return sum;
    }
}

