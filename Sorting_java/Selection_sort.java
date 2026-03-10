package com.company.Sorting_java;

public class Selection_sort {

    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr[] = {9, 7, 4, 2, 6, 1};
        // time complexity o(n^2)
        // outer loop
        for (int i = 0; i < arr.length - 1; i++) { //n-1
            int smallest = i;
            // inner loop
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        selection(arr);


        // problem 1

        int arr1[] = {7, 3, 9, 2, 5};

        for (int i1 = 0; i1 < arr1.length - 1; i1++) {
            int smallest1 = i1;

            for (int j1 = i1 + 1; j1 < arr1.length; j1++) {
                if (arr1[j1] < arr1[smallest1]) {
                    smallest1 = j1;
                }
            }
            int temp1 = arr1[smallest1];
            arr1[smallest1] = arr1[i1];
            arr1[i1] = temp1;
        }
        selection(arr1);


        // problem 02

        int arr2[] = {4, 1, 8, 6, 2};
        int n = arr2.length;

        for (int i2 = 0; i2 < n- 1; i2++) {
            int smallest2 = i2;
            for (int j2 = i2 + 1; j2 < n; j2++) {

                if (arr2[j2] > arr2[smallest2]) {  // --->> minor change  in condition for descending oder
                    smallest2 = j2;
                }
            }

            int tenp2 =arr2[i2];  // -->>> minor in swapping time
            arr2[i2] = arr2[smallest2];
            arr2[smallest2]= tenp2;
        }
        System.out.println(" array are sorted in descending ");
        selection(arr2);
    }
}

