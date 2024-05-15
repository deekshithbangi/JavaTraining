package com.bangi;

import java.util.Scanner;

public class Day5Class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose to Check if Number\n" +
                "1. Is Prime Number\n" +
                "2. Reverse a number \n" +
                "3. Is Palindrome Number\n" +
                "4. Sum of Digits\n" +
                "5. Armstrong Number \n" + 
                "6. Perfect Number\n");
        int choose = input.nextInt();
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        switch (choose) {
            case 1 -> System.out.println(isPrime(num));
            case 2 -> System.out.println(reverseANumber(num));
            case 3 -> isPalindromeNumber(num);
            case 4 -> System.out.println(sumOfDigits(num));
            case 5 -> ArmstrongNumber(num);
            case 6 -> perfectNumber(num);
            default -> System.out.println("choose a correct operation");
        }
        
    }

    private static void perfectNumber(int num) {
        int sumOfDivisior = 0, divisor = 1; 
        while (divisor < num ){
            if (num % divisor == 0) {
                sumOfDivisior += divisor;
            }
            divisor++;
        }
        if (sumOfDivisior == num) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }

    private static void ArmstrongNumber(int num) {
        int length = counter(num); 
        int temp = num, sum = 0;
        while (temp != 0) {
            sum += (int) Math.pow(temp % 10, length);
            temp /= 10;
        }
        if (sum == num) System.out.println(num + " is a armstrong number");
        else System.out.println(num + " is not a armstrong number");
    }
    
    private static int counter(int num) {
        int count = 0;
        int num1 = num;
        while (num1 > 0){
            count++; 
            num1 /=10;
        }
        return count;
    }

    private static int sumOfDigits(int num) {
        int sum = 0, digit;
        while (num > 0) {
            digit = num % 10;
            sum += digit;
            num /=10;
        }
        return sum;
    }

    private static void isPalindromeNumber(int num) {
        int rev = reverseANumber(num) ;
        if (rev == num) {
            System.out.println(num + " is a palindrome number");
        }
    }

    private static int reverseANumber(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /=10;
        }
        return rev;
    }

    public static boolean isPrime(int num) {
        for(int i = 2; i < (int)Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
