package com.assignments.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AveragePairElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        boolean ans = isAveragePairExists(arr, n);
        System.out.println(ans);
    }

    private static boolean isAveragePairExists(int[] arr, int n) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        int average = sum / n;
        System.out.println();
        List<Integer> visited = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (visited.contains(average - arr[i])) {
                return true;
            } else {
                visited.add(arr[i]);
            }
        }
        return false;
    }
}
