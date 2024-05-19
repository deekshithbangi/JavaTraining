package com.assignments.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SquareOfElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int[] ans = sortingSquaredElements(arr, n);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] sortingSquaredElements(int[] arr, int n) {
        int[] squares = new int[n];

        if (n == 0) {
            return squares;
        } else if (n == 1) {
            squares[0] = arr[0] * arr[0];
            return squares;
        }

        int left = 0, right = n - 1;
        int i = n - 1;
        while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare) {
                squares[i] = leftSquare;
                left++;
            } else {
                squares[i] = rightSquare;
                right--;
            }
            i--;
        }
        return squares;
    }
}
