package com.company.Arrays.Practice_Easy;


import java.util.Arrays;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int nums [] = { 2,5,1,2,3,5,1};
        for (int i=0;i< nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if (nums[i] == nums[j]){
                    System.out.println("First Duplicate: " + nums[i]);
                    return;
                }
            }
        }
        System.out.println( "not found ");

    }
}
