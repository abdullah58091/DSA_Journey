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

        // problem 2    Take an array of names as input from the user and print them on the screen.
        int size = sc.nextInt();
        String name [] = new String[size];
        for (int i=0;i<size;i++){
            name[i] =sc.next();
        }
        for (int i=0;i< name.length;i++){
            System.out.println("name " + (i+1) + "is :" + name[i]);
        }

        //  problem 3 Find the maximum & minimum number in an array of integers.

        int numbers[] = new int[size];
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
            }
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);


        // Take an array of numbers as input and check if it is an array sorted in ascending order.

        int numbers1[] = new int[size];
        for(int i=0; i<size; i++) {
            numbers1[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for(int i=0; i<numbers1.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
            if(numbers1[i] > numbers1[i+1]) { // This is the condition for descending order
                isAscending = false;
            }
        }
        if(isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }


    }
}
