//package com.company.Arrays.Practice_Medium;

public class Search_Rotate_sorted {

    public  static  int  search( int[] nums , int target){

        int low = 0 ;
        int high = nums.length -1;

        while (low <= high){
            int mid = (low + high ) /2;

            if (nums[mid] == target){
                return mid;
            }


            // Left sorted
            if (nums[low]  <= nums[mid]){

                if (target >= nums[low] && target < nums[mid]){
                    high = mid -1 ;
                } else {
                    low = mid + 1;
                }
            }


            // Right sorted
            else {
                if (target > nums [mid] && target <= nums[high]){
                    low = mid +1;
                }else{
                    high =mid -1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        //🧠 Important Rule (VERY IMPORTANT ⚡)
        //this  algorithm only rotated sorted array ke liye kaam karta hai or time complexity binary search same hai o(log n )

        int [] num = {6,7,8,1,2,3,4,5};

        System.out.println(search(num,3));
    }
}
