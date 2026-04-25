package com.company.Arrays.Practice_Easy;

public class Missing_number {

    public static int  findMissingNumber(int [] nums){
        int n = nums.length;

        int expectSum = n * (n + 1)/2;
        int currSum = 0;

        for (int num : nums){
            currSum += num;
        }
        return expectSum - currSum;
    }
    public static void main(String[] args) {
        int nums [] = {3,0,1};
        int nums1 [] ={0,1};
        int nums2 []  = {9,6,4,2,3,5,7,0,1};
        System.out.println(findMissingNumber(nums));
        System.out.println(findMissingNumber(nums1));
        System.out.println(findMissingNumber(nums2));

    }
}
