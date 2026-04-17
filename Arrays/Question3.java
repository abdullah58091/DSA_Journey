package com.company.Arrays;

import java.util.*;

public class Question3 {
    public static void main(String[] args) {
      int nums [] = {4, 2, 9, 1, 7};
        int maximum = nums[0];
        for (int i =0;i< nums.length;i++){
            if (nums[i]>maximum){
                maximum = nums[i];
            }
        }
        System.out.println("max is :" + maximum);




        int nums1[] = {1, 2, 3, 4};

        boolean isSorted = true;

        for (int i = 0; i < nums1.length - 1; i++) {
            if (nums1[i] > nums1[i + 1]) {
                isSorted = false;
                break;
            }
        }

        System.out.print(isSorted);
    }
}
