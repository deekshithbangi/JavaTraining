package com.assignments;

import java.util.Scanner;

public class TresureIsland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String rightLeft, swimWait, door;

        System.out.println("Welcome to Treasure Island.\n" +
                "Your mission is to find the treasure.");

        System.out.print("Choose left or right? ");
        rightLeft = input.next();
        if (rightLeft.equals("right"))
            System.out.println("Fall into a hole.\n" + "Game Over");

        else if (rightLeft.equals("left")) {
            System.out.print("Choose b/w swim or wait ");
            swimWait = input.next();

            if (swimWait.equals("swim"))
                System.out.println("Attacked by trout.\n" + "Game Over");

            else if (swimWait.equals("wait")) {
                System.out.print("Which choose a door b/w Red, Blue, Yellow ");
                door = input.next();
                switch (door) {
                    case "red" -> System.out.println("Burned by fire.\n" + "Game Over");
                    case "blue" -> System.out.println("Eaten by beasts.\n" + "Game Over");
                    case "yellow" -> System.out.println("You Win!");
                    default -> System.out.println("Game Over.");
                }
            }
        }
    }
}