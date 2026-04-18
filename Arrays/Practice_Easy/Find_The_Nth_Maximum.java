package com.company.Arrays.Practice_Easy;

public class Find_The_Nth_Maximum {
    public static void  main(String[] args) {
        int nums [] ={ 2,6,3};

        Integer first = null;
        Integer second = null;
        Integer third = null;

        for (int x : nums){
            int n = x;

            if (first != null && n == first) continue;
            if (second != null && n == second) continue;
            if (third != null && n ==  third) continue;

            if ( first == null || n > first){
                third = second ;
                second = first;
                first = n;
            }
            else if (second == null || n > second) {
                   third =second;
                   second = n;
            } else if (third == null || n > third) {
                    third =n;
            }
        }
        System.out.println((third == null) ? first : third );
    }
}
