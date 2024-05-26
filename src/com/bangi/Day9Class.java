package com.bangi;

import java.util.ArrayList;
import java.util.Scanner;

public class Day9Class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        peekElements(arr, n);
    }

    private static void peekElements(int[] arr, int n) {

        ArrayList<Integer> list = new ArrayList<>();

        if (arr.length >= 2) {
            if (arr[0] > arr[1]) list.add(arr[0]);
            if (arr[arr.length - 2] < arr[arr.length - 1]) list.add(arr[arr.length - 1]);
        }

        for (int i = 1; i < arr.length - 1 ; i++) {
            if (arr[i] > arr[i - 1] & arr[i] > arr[i + 1]) list.add(arr[i]);
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
