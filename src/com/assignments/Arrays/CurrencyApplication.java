package com.assignments.Arrays;

import java.util.Scanner;

public class CurrencyApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount;
        int[] denomination = {2000, 500, 200, 100};
        int[] currency = new int[4];
        System.out.println("Enter the withdrawal amount (in multiples of 100):");
        amount = input.nextInt();

        if (amount > 50_000 && (amount % 100 != 0)) {
            System.out.println("Amount should be a multiple of 100 and not exceed 50,000.");
            amount = input.nextInt();
        }

        for (int i = 0; i < denomination.length; i++) {
            currency[i] = amount / denomination[i];
            amount %= denomination[i];
        }

        System.out.println("Denominations:");
        System.out.println("2000: " + currency[0] + " notes");
        System.out.println("500: " + currency[1] + " notes");
        System.out.println("200: " + currency[2] + " notes");
        System.out.println("100: " + currency[3] + " notes");
    }
}
