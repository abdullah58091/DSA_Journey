package com.company.Arrays.Practice_Easy;
import java.util.*;
public class Pluse_One {
    public static void main(String[] args) {


        int digit[] = {1, 2, 3};
        for (int i = digit.length - 1; i >= 0; i--) {
            if (digit[i] < 9) {
                digit[i]++;
                System.out.print(Arrays.toString(digit));
                return;
            }
            digit[i] = 0;
            int[] result = new int[digit.length + 1];
            result[0] = 1;
            System.out.println(Arrays.toString(result));

        }
    }
}
