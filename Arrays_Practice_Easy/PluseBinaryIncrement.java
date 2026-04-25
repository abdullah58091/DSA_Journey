package com.company.Arrays.Practice_Easy;

import java.util.Arrays;

public class PluseBinaryIncrement {
    public static void main(String[] args) {
        int digit [] = { 1,0,1,1};
        for (int i= digit.length -1 ; i >=0 ;i--) {
            if (digit[i] == 0) {
                digit[i] = 1;
                System.out.println(Arrays.toString(digit));
                return;
            }
            digit[i] = 0;
           }
            int result [] = new int[digit.length+1];
            result[0] = 1;
            System.out.println(Arrays.toString(result));

    }
}
