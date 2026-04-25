package com.company.Arrays.Practice_Easy;

public class Maximum_Subarray {
    public  int printMaxSubArr(int nums[]){
        int currSum = 0;
        int maxSum = nums[0];

        for (int num : nums ){
            currSum = currSum + num ;

            if (currSum < num){
                currSum = num;
            }
            if (currSum > maxSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
      }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        Maximum_Subarray call = new Maximum_Subarray();

        System.out.println(call.printMaxSubArr(arr));


    }
}
