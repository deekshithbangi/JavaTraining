package com.assignments;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
    public static void main(String[] args) {
        numberGuessApplication();
    }

    private static void numberGuessApplication() {
        Scanner input = new Scanner(System.in);

        int attemptsRemaining = 10, guessCount = 0;
        int userGuess;
        boolean guessedCorrectly = false;
        String playAgain;

        Random rand = new Random();
        int computerGuess = rand.nextInt(101);
        System.out.println("Computer Generated Number: " + computerGuess);

        while (guessCount < attemptsRemaining) {
            System.out.print("Guess a number between 1 and 100: ");
            userGuess = input.nextInt();

            if (userGuess < computerGuess) {
                System.out.println("Sorry, too low!");
            } else if (userGuess > computerGuess) {
                System.out.println("Sorry, too high!");
            } else {
                guessedCorrectly = true;
                System.out.println("You guessed correctly!");
                System.out.println("Game over. Your attempts to guess correctly: " + guessCount);
                System.out.print("Do you want to play again? (yes or no): ");
                playAgain = input.next();
                if (playAgain.equals("yes")) {
                    numberGuessApplication();
                } else if (playAgain.equals("no")) {
                    System.exit(0);
                }
            }

            System.out.println("You have " + (attemptsRemaining - guessCount) + " attempts left.");
            guessCount++;
        }

        if (!guessedCorrectly) {
            System.out.println("You lose! Game over.");
        }
    }
}
