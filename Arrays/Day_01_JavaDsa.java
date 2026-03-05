package com.company.Arrays;

import java.util.Scanner;

public class Day_01_JavaDsa  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
     /*   int [] marks = new int[size];
        for (int i = 0;i<size;i++){
            marks[i]= sc.nextInt();
        }
        for (int i=0;i< marks.length;i++){
            System.out.println(marks[i]+ " ");
        }

      */

        /*
        String name [] = new String[size];
        for (int i=0;i<size;i++){
            name[i] =sc.next();
        }
        for (int i=0;i< name.length;i++){
            System.out.println("name " + (i+1) + "is :" + name[i]);
        }

         */

        /*
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

         */


        int numbers[] = new int[size];
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean isAscending = true;
        for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
            if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
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
