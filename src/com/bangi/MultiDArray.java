package com.bangi;

import java.util.Scanner;

public class MultiDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        for(int[] row : arr) {
            for(int x : row) {
                System.out.println(x + " ");
            }
            System.out.println();
        }
    }
}
