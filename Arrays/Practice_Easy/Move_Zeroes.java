package com.company.Arrays.Practice_Easy;

import java.util.Arrays;

public class Move_Zeroes {


    public static void main(String[] args) {
        int nums [] = {0,4,6,0,3,0,5};
        int j = 0;
            for (int i = 0; i < nums.length ; i++) {
                if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

            // this array.sort is a keyword for array in java that use and very simple eny element are arrange in oder from
        Arrays.sort(nums,0,j);

            // print
            for (int result : nums) {
                System.out.print(" " + result);
            }
    }
}
