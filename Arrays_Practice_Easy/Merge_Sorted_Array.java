package com.company.Arrays.Practice_Easy;

import java.util.*;

public class Merge_Sorted_Array {

    public static void main(String[] args) {

        int num1[] = {1,2,3,0,0,0};
        int num2[] = {3,7,9};

        sorted(num1, num2, 3, 3);
        System.out.println(Arrays.toString(num1));
    }

    public static void  sorted(int num1[], int num2[], int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {

            if (num1[i] > num2[j]) {
                num1[k] = num1[i];
                i--;
            } else {
                num1[k] = num2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            num1[k] = num2[j];
            j--;
            k--;
        }
    }
}

