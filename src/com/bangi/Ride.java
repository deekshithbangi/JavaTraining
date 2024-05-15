package com.bangi;

import java.util.Scanner;

public class Ride {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int height, age, totalBill = 0;

        System.out.print("Enter your height in centimeters ");

        height = input.nextInt();
        if (height > 120) {
            System.out.print("Enter you age ");

            age = input.nextInt();
            if (age < 12) totalBill += 5;
            else if (age >= 12 && age < 18)  totalBill += 7;
            else if (age >= 18 && age < 45) totalBill += 12;
            else if (age >= 45 && age <= 55) totalBill += 50;

            System.out.print("Do you want to take photos(yes or no)?");

            String wantPhotos = input.next();
            if (wantPhotos.equals("yes"))  totalBill += 3;
        } else {
            System.out.println("Can't ride");
        }
        System.out.print("The total bill is " +totalBill+ "$");
        System.gc();
    }
}
