package com.assignments.Arrays;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter rows and columns of the first array: ");
        int m = input.nextInt();
        int n = input.nextInt();

        int[][] matrix1 = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter rows and columns of the second array: ");
        int p = input.nextInt();
        int q = input.nextInt();

        int[][] matrix2 = new int[m][q];

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        additionOfMatrixs(matrix1, matrix2);
        multiplicationOfMatrixs(matrix1, matrix2);
    }

    private static void multiplicationOfMatrixs(int[][] matrix1, int[][] matrix2) {
        int m = matrix1.length, n = matrix1[0].length, p = matrix2.length, q = matrix2[0].length;

        int[][] multiplication = new int[m][q];
        if ((m == p & n == q) || (m == q & n ==p )) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = i; k < m; k++) {
                        multiplication[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            System.out.println("printing muliplication \n");
            printMatrix(multiplication);
        }
        else{
            System.out.println("muliplication of matrices can't be possible");
        }
    }

    private static void additionOfMatrixs(int[][] matrix1, int[][] matrix2) {
        int m = matrix1.length, n = matrix1[0].length, p = matrix2.length, q = matrix2[0].length;

        int[][] addition = new int[m][n];
        if (m == p && n == q) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    addition[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            System.out.println("printing addition \n");
            printMatrix(addition);
        }
        else{
            System.out.println("Sizes of Matrix Should be Same");
        }
    }
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int x : row) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }
    }
}
