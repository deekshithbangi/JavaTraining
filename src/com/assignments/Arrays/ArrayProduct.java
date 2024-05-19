package com.assignments.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProduct {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n of the array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        long[] ans = arrayProductExpectItself(arr, n);
        System.out.println(Arrays.toString(ans));
    }

    private static long[] arrayProductExpectItself(int[] arr, int n) {
        long totalProduct = 1, zeroCount = 0;
        if (n == 1) {
            long[] ans = {1};
            return ans;
        }
        for(int element : arr) {
            if (element != 0) {
                totalProduct *= element;
            } else if (element == 0){
                zeroCount+=1;
            }
        }
        System.out.println("zero count = " + zeroCount);
        
        long[] productArray = new long[n];
        for (int i = 0; i < n; i++) {
            if (zeroCount == 0) {
                productArray[i] = totalProduct / arr[i];
            }
            else if (zeroCount == 1) {
                if (arr[i] == 0) {
                    productArray[i] = totalProduct;
                } else {
                    productArray[i] = 0;
                }
            }
            else{
                productArray[i] = 0;
            }
        }
        return productArray;
    }
}
