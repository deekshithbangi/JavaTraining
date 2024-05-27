package com.assignments.Arrays;

import java.util.Random;
import java.util.Scanner;

public class PigGameReConstruction {
    static int score = 0;
    static int totalScore = 0;
    static int turns = 0;
    static int currentScore = 0;

    public static void main(String[] args) {
        rollDice(score, totalScore);
    }

    public static void rollDice(int score, int totalScore) {
        Scanner input = new Scanner(System.in);
        while (totalScore < 20) {
            String choice = input.next();
            if (choice.equalsIgnoreCase("r"))
                roll();
            if(choice.equalsIgnoreCase("h"))
                totalScore = hold();
        }
    }

    public static int hold() {
        turns+=1;
        totalScore += currentScore;
        System.out.println("Score for the " +turns+ "th turn = " + currentScore+ " and the Total Score = " + totalScore);
        currentScore = 0;
        return totalScore;
    }

    public static void roll() {

        Random rand = new Random();
        int rollDice = rand.nextInt(1, 7);
        System.out.println("Die Shows: "+rollDice);

        currentScore += rollDice;
        if(rollDice == 1) {
            turns+=1;
            currentScore = 0;
            System.out.println("Turn over. No Score for this turn.");
        }

        System.out.println("current turn Score " + currentScore + " total score " + totalScore );
    }
}
