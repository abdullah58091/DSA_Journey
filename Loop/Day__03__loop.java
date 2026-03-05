package com.company.Loop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Day__03__loop {
    public static void main(String[] args) {

        // Arithmetic  Progression
        System.out.println("....._____THIS IS ARITHMETIC PROGRESSION _____...");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number (a) ");
        int a = sc.nextInt();
        System.out.println("Enter the  common difference number (d) ");
        int d = sc.nextInt();
        System.out.println("Enter the term number (n) ");
        int n= sc.nextInt();

        int AN = a + (n - 1) * d;
        System.out.println("NTH number is  : "  + AN );



        // FOR LOOP USING AND THEN FIND THE ARITHMETIC PROGRESSION

        System.out.println("ENTER THE FIRST TERM (A)");
        int a1 = sc.nextInt();
        System.out.println("ENTER THE COMMON DIFFERENCE (D)");
        int d1 = sc.nextInt();
        System.out.println("ENTER THE nTH TERM (N) ");
        int n1= sc.nextInt();

        for(int i = 0;i<n1;i++){
            int Ap = a1 + i * d1 ;
            System.out.println("  THE  AP nth TERM IS : " + Ap);
        }
                // this is sum and how many of term

        System.out.println("ENTER THE FIRST TERM (A)");
        int a2 = sc.nextInt();
        System.out.println("ENTER THE COMMON DIFFERENCE (D)");
        int d2 = sc.nextInt();
        System.out.println("ENTER THE nTH TERM (N) ");
        int n2= sc.nextInt();
        int sum = 0;
        for(int i = 0;i<n2;i++) {
            int AP = a2 + i * d2;
         sum += AP;
            System.out.println("  THE  AP nth TERM IS : " + AP);
        }
        System.out.println("sum : " + sum );


                       // Enter number to check:


        int a3 = 2;
        int d3 = 4;

        System.out.print("Enter number to check: ");
        int num = sc.nextInt();

        boolean found = false;

        for(int i3 = 0; i3 < 100; i3++) {
            int term = a3 + i3 * d3;

            if(term == num) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println("Yes, it is a term of AP.");
        else
            System.out.println("No, it is not a term of AP.");
    }
}
// Fibonacci series ,ap,gp