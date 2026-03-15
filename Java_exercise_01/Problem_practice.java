package com.company.Java_exercise_01;

import java.util.Scanner;

public class Problem_practice {


    public static double findAvg(int num1, int num2, int num3) {
        double Avg = (num1 + num2 + num3) / 3.0;
        return Avg;
    }

    // problem 02

    public static void oddsum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of odd number is : " + sum);
    }


    // problem 03

    public static int findgreater(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }


    // problem 04

    public static double findCircumference(double r) {
        return 2 * Math.PI * r;
    }


    // problem 05
    public static int findVote(int age) {
        if (age >= 18) {
            System.out.println(" You are eligible for vote");
        } else {
            System.out.println("  You are not eligible  vote ");
        }
        return age;
    }

    // problem 08

    public static int power(int x, int n1) {
        int result3 = 1;
        for (int i = 1; i <= n1; i++) {
            result3 = result3 * x;
        }
        return result3;
    }

    // problem 09

    public static double findGCD(int a1, int b1) {

        int gcd = 1;
        for (int i = 1; i <= a1 && i <= b1; i++) {
            if (a1 % i == 0 && b1 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER FOR AVERAGE ");
        int num1 = sc.nextInt();

        System.out.println("ENTER THE SECOND NUMBER  FOR AVERAGE ");
        int num2 = sc.nextInt();


        System.out.println("ENTER THE THIRD NUMBER  FOR AVERAGE");
        int num3 = sc.nextInt();


        double result = findAvg(num1, num2, num3);
        System.out.println(" Average is : " + result);


        System.out.println(" ENTER THE NUMBER FOR ODD NUMBERS  N: ");
        int n = sc.nextInt();

        oddsum(n);


        System.out.println(" enter the first number greater a: ");
        int a = sc.nextInt();
        System.out.println("enter number second number greater b: ");
        int b = sc.nextInt();

        int result1 = findgreater(a, b);
        System.out.println(" Greater number  =  " + result1);


        System.out.println("enter radius of circumference : ");
        double radius = sc.nextInt();

        double result2 = findCircumference(radius);
        System.out.println("circumference =  " + result2);


        System.out.println(" enter the age ");
        int age = sc.nextInt();

        int eligible = findVote(age);
        System.out.print("your is age " + eligible);
        System.out.println("\n");


        // problem 06

        /* do {
             System.out.println("this is will run");
         }while(true);

     */


        // problem 07

        int positive = 0, Negative = 0, zero = 0;
        String  choice = "yes";
        while(choice.equals("yes")) {

            System.out.print("enter a number end should it display  ");
            int num = sc.nextInt();

            if (num > 0) {
                positive++;
            } else if (num < 0) {
                Negative++;
            } else {
                zero++;
            }
            System.out.print("Do you want to continue? (yes/no): ");
            choice = sc.next();
        }

        System.out.println("positive numbers :  " + positive);
        System.out.println("Negative numbers :  " + Negative);
        System.out.println("zero numbers : " + zero);


        System.out.println("enter of base x  : ");
        int x = sc.nextInt();
        System.out.println("enter power n1 : ");
        int n1 = sc.nextInt();

        int ans = power(x, n1);
        System.out.println(" result = " + ans);







        //Example: GCD of 12 and 18
        //Divisors of 12 → 1, 2, 3, 4, 6, 12
        //Divisors of 18 → 1, 2, 3, 6, 9, 18
        //Common divisors → 1, 2, 3, 6
        //Greatest → 6



        System.out.println("enter numbers GCD a1: ");
        int a1 = sc.nextInt();
        System.out.println("enter the numbers GCD b1");
        int b1 = sc.nextInt();

        double ans1 = findGCD(a1, b1);
        System.out.println(" GCD =  " + ans1);


        // problem 10  Explanation:  Each number = sum of previous two numbers.


        System.out.println("enter the number of fibonacci  N  : ");
        int n4 = sc.nextInt();

        int a2 = 0, b2 = 1;

        System.out.print(a2 + " " + b2 + " ");

        for (int i = 2; i < n4; i++) {
            int c = a2 + b2;
            System.out.println("The fibonacci series of n term " + c + " ");

            a2 = b2;
            b2 = c;
        }
    }
}


