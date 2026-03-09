package com.company.BitManipulations;

import java.util.Scanner;

public class BinaryNumbers {
    public static void main(String[] args) {

        // GET BITMASK MANIPULATION

        int n = 5 ;
        int position = 2;
        int bitmask = 1<<position;
        if ((bitmask & n) == 0){
            System.out.println("that is bit zero");
        }else{
            System.out.println("that is bit non-zero ");
        }
                // SET BITMASK MANIPULATION

        int n1 =5;  // 0101
        int position1 = 1;
        int bitmask1 = 1<<position1;

        int newNumber = bitmask1 | n;
            System.out.println(newNumber);


            // CLEAR BITMASK MANIPULATION

        int  n2= 5;
        int position2 = 2;
        int bitmask2 = 1<<position2;
        int  notbitmask = ~(bitmask2);

        int newNumber2 = notbitmask & n2;
        System.out.println(newNumber2);


        // clear  bit mask manipulation

        Scanner sc = new Scanner(System.in);

        int nu = 5; // --0101 -->> 0111 --> decimal
        int position3 = 1;

        int operation = 1;    // --<<

        int bitmask3 = 1 << position3;
        if (operation == 1) {
            // set
            int newnumber3 = bitmask3 | nu;
            System.out.println(newnumber3);
        }else{
            // clear
            int  newbitmask = ~(bitmask3);
            int newnumber4 = newbitmask & nu;
            System.out.println(newnumber4);

        }

     // homework problem 01
        System.out.println("ENTER NUMBER ");
        int n5 = sc.nextInt();
        if ( n5 > 0  && (n5 &( n5 -1 )) == 0){
            System.out.println(" number is a power of 2");
        }else{
            System.out.println("number is not of power of 2"); // the time complexity is o(1)
        }

        // problem 02
        System.out.println("enter the number ");
        int n6 = sc.nextInt();
        System.out.println("enter the position ");
        int position6 = sc.nextInt();
        int bitmask6 = 1<<position6;
        int operation2 = n6 ^(bitmask6); // --->> n^(1<<i)
        System.out.println("number after toggling bit : " + operation2); // -->> O(log n) time complexity

        // problem 03

        System.out.println("enter the number " );
        int n7 = sc.nextInt();
        int count = 0 ;

        while(n7 > 0 ){
            if ((n7 & 1) == 1){
                count++;
            }
            n7 = n7 >> 1;
        }
        System.out.println("number of 1 is :" + count);  // -->>  the time time complexity O(log n)

        //
    }
}
