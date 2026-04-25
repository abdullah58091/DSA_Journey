package com.company.Arrays.Practice_Easy;

public class MIn_Sub_Arrays {

    public static void main(String[] args) {

        int[] num = {1,2,3,1,0};
        int target = 5;

        int result =  minSubArrayLen(target, num);

        System.out.println("Minimum Length : " + result);
    }

    public static  int minSubArrayLen(int target, int[] nums){
        int left =0 ;
        int currSum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int i =0 ; i< nums.length; i++){
            currSum += nums[i];

            while (currSum >= target){

                minLen = Math.min(minLen , i - left + 1);

                currSum -= nums[left];
                left++;
            }
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
