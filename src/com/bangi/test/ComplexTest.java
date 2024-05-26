package com.bangi.test;

import com.bangi.model.ComplexNumbers;

public class ComplexTest {
    public static void main(String[] args) {
        ComplexNumbers complex1 = new ComplexNumbers(1, 2);
        ComplexNumbers complex2 = new ComplexNumbers(3, 4);
//        ComplexNumbers sum = complex1;
        System.out.println("Sum: " + complex1.getReal() + " + " + complex1.getImaginary() + "i");
    }
}
