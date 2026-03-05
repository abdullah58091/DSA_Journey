package com.company.MethodsJava;

import com.sun.tools.javac.Main;

public class PracticeQuestion {
    // QUESTION 01
//    static void multiplication(int n){
//        for(int i =1;i<=10;i++) {
//            System.out.format("%d * %d = %d\n ", n, i, n * i);
//        }
//    }
//
//    public static void main(String[] args) {
//        multiplication(8);
//    }
//}
    //QUESTION 2
//    static void pattern1(int n) {
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern1(10);
//    }
//}
//QUETIONS 03

    //    static int sumrect(int n) {
//        if (n == 1) {
//            return 1;
//        }
//        return n + sumrect(n - 1);
//    }
//
//    public static void main(String[] args) {
//        int c = sumrect(8);
//        System.out.println(c);
//    }
    // QUESTION 4
//    static void pattern(int n) {
//        for (int i = n; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern(4);
//    }
//}

    // question 05
//    static int fib(int n) {
//        if (n == 1) {
//            return 0;
//        } else if (n == 2) {
//            return 1;
//        } else {
//            return fib(n - 1) + fib(n - 2);
//        }
//    }
//
//    public static void main(String[] args) {
//        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34
//        int result = fib(11);
//        System.out.println(result);
//    }
//}
    // question 6
    static int sum(int... arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("the sum 4 and 8 :" + sum(4, 8));
    }
}



    //QUESTION 7 so easy hai

//    static void pattern1_rec(int n) {
//        if (n > 0) {
//
//            for (int i = 0; i < n; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//             pattern1_rec(n-1);
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern1_rec(4);
//    }
//}
    //QUESTION 08

//    static void pattern1_rec(int n) {
//        if (n > 0) {
//            pattern1_rec(n-1);
//            for (int i = 0; i < n; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern1_rec(10);
//    }
//}

//     questin 9



//    static float conv(float n){
//        float temp=(n*1.8f)+32;
//        return temp;
//}
//    public static void main(String[] args) {
//        System.out.println(conv(20f));
//}
//}


// question 10