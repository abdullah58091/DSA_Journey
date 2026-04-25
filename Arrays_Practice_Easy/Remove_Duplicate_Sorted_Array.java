package com.company.Arrays.Practice_Easy;

import java.util.*;
public class Remove_Duplicate_Sorted_Array {

        public static int removeDuplicates(int[] nums) {
            int i = 0;

            for (int j = 1; j < nums.length; j++) {
                if (nums[i] != nums[j]) {
                    i++;
                    nums[i] = nums[j];
                }
            }

            return i + 1;
        }

        public static void main(String[] args) {
            int[] nums = {1, 1, 2, 2, 3};

            int k = removeDuplicates(nums);

            System.out.println("Unique count: " + k);

            for (int i = 0; i < k; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }

