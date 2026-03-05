package com.company.MethodsJava;

import java.util.Scanner;

public class MethodInJava {

    // Static use 1 option hai
//       static int  logic  (int x , int y){
//        int z;
//        if(x>y){
//            z = x+y;
//        }
//        else{
//            z  = (x + y) * 5;
//        }
//        return z;
//    }
//

//      int a= 9;
//      int b= 7;
//      int c ;
//      c =  logic(a ,b);
//      int a1 =4;
//      int b1 =8;
//      int c1;
//      c1 = logic(a1 , b1);
//        System.out.println(c);
//        System.out.println(c1);
//    }
    // ARE YOUSING FOR NON STATICS HAI OBJECT KE SATH

       int  logic  (int x , int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z  = (x + y) * 5;
        }
        return z;
    }
/*
    public static void main(String[] args) {
      int a= 9;
      int b= 7;
      int c ;
      MethodInJava  obj = new MethodInJava();
      c =   obj.logic(a ,b);
      int a1 =4;
      int b1 =8;
      int c1;
        c1 =  obj.logic(a1 , b1);
        System.out.println(c);
        System.out.println(c1);


 */


        // this is cod eis apna college for dsa level
    public static int subtrac (int e, int g){
        return e - g ;
    }

         public  static int  calculate_sum  (int a , int b) {
            return a+b;
         }
         public static int multiple_product(int a1,int b1) {
             return a1 * b1;
         }
         public static  int division (int i,int j){
             return i/j;
         }
         public static  void  factorial_number (int n){
             if (n<0){
                 System.out.println("this invalids numbers ");
             }
           int factorial =1;
             for (int i = n;i>=1;i--){
                 factorial = factorial *i;
             }
             System.out.println(factorial);
         }
         public static int even (int n1) {
                 if (n1 % 2 == 0)
                     return 1;
                 else
                     return 0;

         }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number a:");
        int a =sc.nextInt();
        System.out.println("Enter the second number is b:");
        int b = sc.nextInt();
       // int sum = calculate_sum(a,b);
        System.out.println("the two numbers of sum is :" + calculate_sum(a,b));
        System.out.println("enter the multiple first number is a");
        int a1 = sc.nextInt();
        System.out.println("enter the multiple second number is b :");
        int b1 = sc.nextInt();
        //int multiple = multiple_product(a1,b1);
        System.out.println("the two multiple product  is " + multiple_product(a1,b1));
        System.out.println("the first is div i : ");
        int i = sc.nextInt();
        System.out.println("the second div j :");
        int j =sc.nextInt();
       // int div = division(i,j);
        System.out.println("the division is : " + division(i,j) );
        int n=sc.nextInt();
        System.out.print( " the factorial numbers is :" ); factorial_number(n);
            int n1 = sc.nextInt();
            if (even(n1) == 1) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
            System.out.println(" the  e");
            int  e = sc.nextInt();
            System.out.println("the  g is ");
            int g = sc.nextInt();
            System.out.println("the sutrac is " + subtrac(e,g));
     }
 }

