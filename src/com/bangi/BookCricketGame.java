package com.bangi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BookCricketGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter player-1 and player-2 names ");
        String player1 = input.next();
        String player2 = input.next();

        System.out.println("player-1 " + player1 + " starts now! ");
        int[] player1Scores = playGame(player1, 0, 0);

        System.out.println("\n\nplayer-2 " + player2 + " starts now! ");
        int[] player2Scores = playGame(player2, 0, 0);

        if (player1Scores[0] > player2Scores[0]) {
            System.out.println(player1 + " is the winner");
        } else if (player1Scores[0] < player2Scores[0]) {
            System.out.println(player2 + " is the winner");
        } else if (player1Scores[1] > player2Scores[1]) {
            System.out.println(player1 + " is the winner");
        } else if (player1Scores[2] > player1Scores[1]){
            System.out.println(player2 + " is the winner");
        } else {
            System.out.println("draw!!");
        }
    }

    private static int[] playGame(String player1, int score, int turn) {
        Scanner input = new Scanner(System.in);
        int[] game = new int[2];
        int currScore = 0, totalScore = 0, pageNumber;
        Random rand = new Random();

        while (turn  != 301) {
            System.out.print("Continue playing yes(y) or no(n) ");
            char playAgain = input.next().charAt(0);
            if (playAgain == 'y') {
                pageNumber = rand.nextInt(1,301);
                System.out.println("page number generated = " + pageNumber);
                score = pageNumber % 7;
                if (score != 0) {
                    currScore += score;
                    totalScore += score;
                    System.out.println("Score = " + score + ", Total Score = " + totalScore);
                } else if (score == 0) {
                    game[0] = totalScore;
                    game[1] = turn;
                    System.out.println("Score = " + score + "\n" +
                            "Total Score = " + totalScore);
                    return game;
                }
            } else if (playAgain == 'n'){
                break;
            }

            turn++;
        }
        game[0] = totalScore;
        game[1] = turn;
        return game;
    }
}
