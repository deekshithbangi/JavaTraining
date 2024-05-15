package com.bangi;

import java.util.Scanner;

public class Day4Class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter task number b/w 1-4 \n" +
                "1. To Print name \n" +
                "2. To Print 1 to 100\n" +
                "3. To Print even numbers only\n" +
                "4. To find the factorial of a number\n" +
                "5. To Print table of a Number\n" +
                "6. To print all tables b/w 1 to 10");
        int task = input.nextInt();
        switch (task) {
            case 1 -> {
                String name;
                int count;
                System.out.println("enter name and no.of times you want to print it!!");
                name = input.next();
                count = input.nextInt();
                myName(name, count);
            }
            case 2 -> oneToHunderedPrint();
            case 3 -> evenNumbersOnly();
            case 4 -> {
                System.out.println("Enter a number to find it's factorial");
                int num = input.nextInt();
                int ans = factorial(num);
                System.out.printf("factorial of "+num+ " is " + ans );
            }
            case 5 -> {
                System.out.println("enter a number to get it's table");
                int tableNumber = input.nextInt();
                tablePrint(tableNumber);
            }
            case 6 -> {
                printTables();
            }
        }

    }
    public static void myName(String name, int count) {
        int i = 1;
        while (i <= count) {
            System.out.print(name + " ");
            i++;
        }
    }
    public static void oneToHunderedPrint(){
         int i =1;
         while (i<=100) {
             System.out.print(i + " ");
             i++;
         }
    }
    public static void evenNumbersOnly(){
        int i = 1;
        while(i!=100){
            if (i%2 == 0) System.out.print(i + " ");
            i++;
        }
    }
    public static int factorial(int num) {
        if ((num == 0) | (num == 1)) return 1;
        else return num * factorial(num - 1);
    }
    public static void tablePrint(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " x " + num + " = " + (i*num));
            i++;
        }
    }
    public static void printTables() {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.printf("%4d ", i*j);
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
