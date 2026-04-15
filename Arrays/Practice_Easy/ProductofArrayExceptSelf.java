package com.company.Arrays.Practice_Easy;

public class ProductofArrayExceptSelf {


    public static void main(String[] args) {
        int nums [] = { 1,2,3,4} ;
        //int nums []  ={-1,1,0,-3,3};

        int n = nums.length;
         int answer[] = new int[n];
         answer[0] = 1;
         for (int i = 1; i<n;i++){
             answer[i] = answer[i-1] * answer[i -1 ];
         }
         int rigth = 1;
         for (int i=n-1;i >= 0; i--){
             answer[i] = answer[i] * rigth;
             rigth = rigth* nums[i];
         }
         for (int i=0 ;i<n;i++) {

             System.out.print(answer[i] + " ");
         }
    }
}
