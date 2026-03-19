package com.company.Sorting_java;

public class Merge_sort {

    public static  void conquer(int arr[], int si, int mid ,int ei){
        int merged [] =  new int[ei - si + 1];

        int indx1 =si;
        int indx2 = mid + 1;

        int x = 0;
        //Compare and merge  -- time complexity o(n)
        while (indx1<= mid && indx2<= ei){
            if (arr[indx1] <= arr[indx2]){
                merged [x++] = arr[indx1++];
            }else {
                merged[x++] = arr[indx2++];
            }
        }
        while (indx1 <= mid){
            merged[x++] = arr [indx1++];
        }
        while(indx2 <= ei){
            merged[x++] = arr[indx2++];
        }

        for (int i =0, j =si; i< merged.length;i++,j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[], int si ,int ei){

        // base case

        if ( si >= ei){
            return;
        }
        // time complexity  o(log n)

        // find mid
        int mid = si + (ei - si)/2 ;   //(si + ei) /2

        // 3. Recursive Divide (Recursion)
        divide(arr,si,mid);
        divide(arr,mid + 1,ei);
        // merge both have l-r
        conquer( arr, si,mid,ei);
    }
    public static void main(String[] args) {

        int arr [] = { 6,3,9,5,2,8};
        int marks = arr.length;


        divide(arr,0,marks -1);
        // print
        for (int i =0; i <marks;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();  // time complexity O(n log n)  // space  O(n) (extra array used)
    }
}
