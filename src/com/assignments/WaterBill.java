package com.assignments;

import java.util.Scanner;

public class WaterBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter No.of Units consumed ");
        int noUnitsConsumed = input.nextInt();

        int meterCharge = 75, charge, totalWaterBill;

        if (noUnitsConsumed <= 100)
            charge = noUnitsConsumed * 5;
        else if (noUnitsConsumed <= 250)
            charge = noUnitsConsumed * 10;
        else
            charge = noUnitsConsumed * 20;

        totalWaterBill = charge + meterCharge;

        System.out.println(totalWaterBill);
    }
}
