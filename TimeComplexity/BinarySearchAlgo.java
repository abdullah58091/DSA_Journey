package com.company.TimeComplexity;

import java.util.Scanner;

public class BinarySearchAlgo {
    public static void main(String[] args) {
        int arr[]  = new int[10];
        Scanner sc = new Scanner(System.in);
        // take input by user:
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // print this array:
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
