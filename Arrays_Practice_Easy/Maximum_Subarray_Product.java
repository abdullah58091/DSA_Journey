package com.company.Arrays.Practice_Easy;

public class Maximum_Subarray_Product {
        public static  int maxProduct(int nums[]) {
            int maxPro = nums[0];
            int minPro = nums[0];
            int result = nums[0];

            for (int i = 1; i < nums.length; i++) {
                int num = nums[i];

                if (num < 0) {
                    int temp = maxPro;
                    maxPro = minPro;
                    minPro = temp;
                }

                maxPro = Math.max(num, maxPro * num);
                minPro = Math.min(num, minPro * num);

                result = Math.max(result, maxPro);
            }

            return result;
        }

        public static void main(String[] args) {

             int [] nums1  = {2,3,-2,1};

             System.out.println(maxProduct(nums1));
    }
}
