package com.company.Sorting_java;

public class Insertion_sort {
    public static void insertion(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {7, 8, 3, 1, 2};

        // time complexity same  o(n^2) due to Each element may need to be compared with many previous elements, giving about n² operations.
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {

                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        insertion(arr);


        // problem 01

        int arr1 [] = {7,4,5,2,9};

        for (int i1 = 1; i1<arr1.length;i1++){
            int current1 =arr1[i1];
            int j1 = i1 -1;
            while (j1 >= 0 && arr1[j1] > current1) {

                arr1[j1 + 1] = arr1[j1];
                j1--;
            }
            arr1[j1 + 1] = current1;
        }
        insertion(arr1);

        // problem 02

        int arr2 [] ={3,8,1,6,2};

        for (int i2 = 1; i2 < arr2.length;i2++){
            int key = arr2[i2];
            int j2 = i2 -1;
            while (j2 >=0 && arr2[j2] < key){

                arr2[j2 + 1] = arr2[j2];
                j2--;
            }
            arr2[j2 + 1] = key;
        }
        insertion(arr2);
    }
}
