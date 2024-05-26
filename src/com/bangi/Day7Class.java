package com.bangi;

import java.util.Scanner;

import static com.bangi.Day5Class.isPrime;

public class Day7Class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter range to print prime numbers: ");
        int range = input.nextInt();
        primeRange(range);
        primePattern();
    }

    private static void primePattern() {
        int count = 0, row = 1;
        System.out.println("Printing the prime pattern");
        for (int i = 2; i < 50; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
            if (count == row) {
                System.out.println(" ");
                row++;
                count = 0;
            }
        }
    }

    private static void primeRange(int range) {
        for(int i = 2; i <= range; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }
}
