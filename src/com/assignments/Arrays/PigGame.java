package com.assignments.Arrays;

import java.util.Random;
import java.util.Scanner;

public class PigGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Game Rules:\n" +
                "1. See how many turns it takes you to get to 20.\n" +
                "2. Turn ends when you hold or roll a 1.\n" +
                "3. If you roll a 1, you lose all points for the turn.\n" +
                "4. If you hold, you save all points for the turn.\n");
        System.out.println("Game Starts now!!");

        int totalScore = 0, currentTurnScore = 0, turns = 0;

        while(totalScore <= 20) {
            System.out.print("Roll or hold? (r/h): ");
            String option = input.next();

            if (option.equalsIgnoreCase("r")) {
                Random rand = new Random();
                int rollDice = rand.nextInt(1, 7);
                System.out.println("Die Shows: "+rollDice);
                if(rollDice != 1) {
                    currentTurnScore += rollDice;
                } else {
                    turns++;
                    currentTurnScore = 0;
                    System.out.println("Turn over. No Score for this turn.");
                }
            } else if(option.equalsIgnoreCase("h")) {
                turns++;
                totalScore += currentTurnScore;
                System.out.println("Score for the " +turns+ " turn's = " + currentTurnScore+ " and the Total Score = " + totalScore);
                currentTurnScore = 0;
            } else {
                System.out.println("Please enter 'h' for hold or 'r' for roll");
            }
        }
        System.out.println("You Finished in " +turns+ " turns! \nGame Over!");
    }
}
