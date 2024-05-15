package com.bangi;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter to choose b/w month(1) or weekdays(2)");
        int choose = input.nextInt();
        switch (choose) {
            case 1 -> {
                System.out.println("Enter month number ");
                int month = input.nextInt();

                switch (month) {
                    case 1, 2, 12 -> System.out.println("winter");
                    case 3,4,5 -> System.out.println("summer");
                    case 6,7,8 -> System.out.println("Monsoon");
                    case 9, 10, 11 -> System.out.println("Post-monsoon");
                }
            }
            case 2 -> {
                System.out.println("Enter week nuber ");
                int weekNumber = input.nextInt();
                switch (weekNumber) {
                    case 1 -> System.out.println("Sunday");
                    case 2 -> System.out.println("Monday");
                    case 3 -> System.out.println("Tuesday");
                    case 4 -> System.out.println("Wednesday");
                    case 5 -> System.out.println("Thursday");
                    case 6 -> System.out.println("Friday");
                    case 7 -> System.out.println("Saturday");
                }
            }
        }
    }
}
