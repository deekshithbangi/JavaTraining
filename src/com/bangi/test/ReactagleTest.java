package com.bangi.test;

import com.bangi.model.Rectangle;

import java.util.Scanner;

public class ReactagleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rectangle1 = new Rectangle();

        System.out.print("Length of the rectangle: ");
        int length = input.nextInt();
        rectangle1.setLength(length);

        System.out.print("Breadth of the rectangle: ");
        int breadth = input.nextInt();
        rectangle1.setBreadth(breadth);

        System.out.println("length of the rectangle is: " + rectangle1.getLength());
        System.out.println("breadth of the rectangle is: " + rectangle1.getBreath());

        rectangle1.displayAreaOfRectangle();

    }
}
