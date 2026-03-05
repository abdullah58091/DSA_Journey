package com.company.Loop;

import java.util.Scanner;

public class Day__02__loop {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println(" THIS IS THE PRIME NUMBERS\n__ Enter the number___");
        int a = sc.nextInt();
        boolean prime = true;
        if (a <= 1) {
            prime = false;
        } else {
            for (int i = 2; i < a; i++) {
                // for(int i=2;i <= Math.sqrt(a);i++){          //  --->> this is fast prime code for number purpose
                if (a % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime) {
            System.out.println("this is prime ");
        } else {
            System.out.println("this is not prime ");
        }

        // user send the natural number find the prime


        Scanner xy = new Scanner(System.in);
        System.out.println("THS IS NATURAL PRIME NUMBER \n____ enter the natural number : ");
        int num = xy.nextInt();
        for (int j = 2; j < num; j++) {

            boolean prime1 = true;

            for (int z = 2; z < j; z++) {

                if (j % z == 0) {
                    prime1 = false;
                    break;
                }
            }
            if (prime1) {
                System.out.println(j);
            }
        }



        Scanner ab = new Scanner(System.in);
        System.out.println("Enter number:");
        int num1 = ab.nextInt();
        boolean numberPrime = true;

        if (num1 <= 1) {
            numberPrime = false;
        }

        System.out.println("Prime numbers till " + num1 + " are:");

        for (int i1 = 2; i1 <= num1; i1++) {

            boolean prime2 = true;

            for (int j1 = 2; j1 < i1; j1++) {
                if (i1 % j1 == 0) {
                    prime2 = false;
                    break;
                }
            }

            if (prime2) {
                System.out.println(i1);
            }

            // 🔥 yaha check kar rahe hain ki num khud prime hai ya nahi
            if (i1 == num1 && !prime2) {
                numberPrime = false;
            }
        }

        if (numberPrime && num1 > 1) {
            System.out.println(num1 + " is Prime");
        } else {
            System.out.println(num1 + " is Not Prime");
        }
    }
}


