package com.bangi;

import java.util.Arrays;
import java.util.Scanner;

public class Day8Class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n = input.nextInt();
        int[] arr = new int[n];
        for(int i =0; i <n; i++) {
            arr[i] = input.nextInt();
        }
        sumOfElements(arr,n);
        maxElement(arr,n);
        squareAndSort(arr,n);
    }

    private static void squareAndSort(int[] arr, int n) {
        int[] squareArray = new int[n];
        for(int element : arr) {
            int square = element * element;
            squareArray[0] = square;
            for(int i = 0; i < arr.length - 1; i++) {
                if (squareArray[i] > squareArray[i + 1]) {
                    int temp = squareArray[i];
                    squareArray[i] = squareArray[i + 1];
                    squareArray[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(squareArray));
    }

    private static void maxElement(int[] arr, int n) {
        int maxElement = Integer.MIN_VALUE;
        for(int element : arr) {
            if (element > maxElement) {
                maxElement = element;
            }
        }
        System.out.println("Max element = " + maxElement);
    }

    private static void sumOfElements(int[] arr, int n) {
        int sum = 0;
        for(int element : arr) {
           sum+= element;
        }
        System.out.println("sum = " + sum);
    }
}
