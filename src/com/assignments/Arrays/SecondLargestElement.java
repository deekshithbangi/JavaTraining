package com.assignments.Arrays;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        getSecondLargestNumber(arr, n);
    }

    private static void getSecondLargestNumber(int[] arr, int n) {
        if (n <= 1) {
            System.out.println("List is empty or has less than two elements");
            return; }

        int largestElement = Integer.MIN_VALUE, secondLargestElement = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largestElement) {
                secondLargestElement = largestElement;
                largestElement = num;
            } else if (num != largestElement & num > secondLargestElement) {
                secondLargestElement = num;
            }
        }
        if (secondLargestElement == Integer.MIN_VALUE) {
            System.out.println("All elements are equal");
        } else {
            System.out.println("Second largest element is " + secondLargestElement);
        }
    }
}
