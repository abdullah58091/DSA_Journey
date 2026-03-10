package com.company.Sorting_java;

public class Bubble_Sort {

    public static void printArray(int arr[]) {
        System.out.println(" BUBBLE SORT");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7,8,1,3,2};
         // time complexity o(n^2)
        // Bubble sort

        // outer loop
        for (int i = 0; i < arr.length - 1; i++) {  // n -1

            //inner loop
            for (int j = 0; j < arr.length - i - 1; j++) {
                //condition
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);

        // problem 01

        int arr1 [] ={5 ,3 ,8 ,2 ,1};

        for (int i1 = 0 ;i1 <  arr1.length - 1;i1++){
            for (int j1 =0 ; j1< arr1.length -i1 -1;j1++ ){

                if (arr1[j1] > arr1 [j1 +1 ]) {

                    int temp1 = arr1[j1];
                    arr1[j1] = arr1[j1+1];
                    arr1[j1+1] = temp1;
                }
            }
        }
        printArray(arr1);


        // problem 02

        int arr2 [] = {1 ,2 ,3 ,4 ,5};

        // find array length
        int n = arr2.length;

        //Boolean variables
        boolean swapped;

        // outer loop
        for (int i2 =0; i2< n-1;i2++){

            swapped = false;

            for (int j2=0 ; j2 < n - i2 -1;j2++) {

                if (arr2[j2] > arr2[j2 + 1]) {

                     // swap
                    int temp2 = arr2[j2];
                    arr2[j2] = arr2[j2 + 1];
                    arr2[j2 + 1] = temp2;

                    swapped = true;
                }
            }

            if (swapped == false){
                System.out.println("Array are sorted ");
                break;
            }
        }
        printArray(arr2);
    }
}
