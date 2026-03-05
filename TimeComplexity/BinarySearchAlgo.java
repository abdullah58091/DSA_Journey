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

    }
}
