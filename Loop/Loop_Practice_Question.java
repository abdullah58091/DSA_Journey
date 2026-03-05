package com.company.Loop;

public class Loop_Practice_Question {
    public static void main(String[] args) {

//        // qurtion no 01
//        int n = 4;
//        for (int i = n; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }


        // quetion 2
//        int sum = 6;
//        int i = 4;
//        for (int n = 0; i < n; i++) {
//            sum = sum + (2 * i);
//        }
//        System.out.println("sum is even number ");
//        System.out.println(sum);
//        // qution 03
        //int n = 5;

//        for (int i = 0; i<=10; i++) {
//            System.out.printf("%d X %d = %d\n ",n, i, n*i);
//
//        }
        // qution 04
        // int n = 10;

//        for (int i = 10; i >= 0; i--) {
//            System.out.printf("%d X %d = %d\n ", n, i, n * i);
//        }

        // quetion 5
//        int n = 5;
//        int factorial = 1;
//        for (int i = 1; i <= n; i++) {
//            factorial *= i;
//
//            System.out.println(factorial);
        //quetion 6
//        int n = 5;
//        // what is factorial value 5!=5*4*3*2*1
//        int i = 1;
//        int factorial = 1;
//        while (i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);

//             quetion 07
//        int n = 4;
//        int i = n;
//
//        do {
//            i--;
//            int j = 0;
//
//            do {
//                System.out.print("*");
//                j++;
//            } while (j < i);
//
//            System.out.println();
//
//        } while (i > 0);

        // quteion 09
//        int n = 8;
//        int sum = 0;
//        for (int i = 1; i <=2; i++) {
//            sum += n * i;
//        }
//        System.out.println(sum);
//    }
        // quetion 08


        //quetion  10


        //quetion 11
//        int sum = 6;
//        int i = 4;
//        int n = 0;
//        while (i < n) {
//            sum = sum + (2 * i);
//        }
//        System.out.println("sum is evene nuber ");
//        System.out.println(sum);
//         i++;

        //    problem 1
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int g = 6;
        for (int t = g; t > 0; t--) {
            for (int y = 1; y <= t; y++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // problem 02

        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;


        }
        int k = 5;
        for (int e = k; e >= 1; e--) {
            for (int u = 1; u <= e; u++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //decrease pattern

        int x = 6;
        for (int y = x; y >= 1; y--) {
            for (int z = 1; z <= y; z++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // increase pattern

        int a = 6;
        for (int b = 1; b <= a; b++) {
            for (int c = 1; c <= b; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

        int r = 30;
        for (int w = r; w >= 15; w--) {
            System.out.println(w);
        }
        // int naturalnumber = 5;
        for (int p = 9; p >= 0; p--) {
            System.out.println(p);
        }
        int h = 10;

        System.out.println(2 * h);



/*
                int[] nums = {2, 7, 11, 15};
                int target = 9;

                int[] result = twoSum(nums, target);

                if (result.length == 2) {
                    System.out.println("[" + result[0] + ", " + result[1] + "]");
                } else {
                    System.out.println("Koi solution nahi mila");
                }
            }

            public static int[] twoSum(int[] nums, int target) {
                for (int i = 0; i < nums.length; i++) {
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[i] + nums[j] == target) {
                            return new int[]{i, j};
                        }
                    }
                }
                return new int[]{};
            }
        }

 */


        int t = 56;
        while(t >= 0){
            System.out.println(t);
            t--;
        }
    }
}









