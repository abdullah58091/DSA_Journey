package com.company.ConditionalOperator;

import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class JavaOperator {
    public static void main(String[] args) {
//        int a =  4;
//        int b =  56;
//        int sum= a - b;
//        int sum2 = a + b;
//        int sum3 = a*b;
//        int sum4 = a/b;
//        float sum5 = a/b;
//        System.out.println(sum);
//        System.out.println(sum2);
//        System.out.println(sum3);
//        System.out.println(sum4);
//        System.out.println(sum5);
//        System.out.println(34>4 && 34>6);


        // Calculator

        System.out.println("this is calculator  ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number is a ");
        int a = sc.nextInt();
        System.out.println("Enter the number is b");
        int b = sc.nextInt();
        System.out.println("Enter the operator");
        int calculator1 = sc.nextInt();
            switch(calculator1){
            case 1:
                System.out.println(" the sum is " + (a+b));
                break;
            case 2:
                System.out.println("the sub is : "  + (a-b) );
                break;
            case 3:
                System.out.println("the mul is : " + (a*b));
                break;
            case 4:
                System.out.println("the modelo is : " + (a%b));
                break;
                case 5 :
                    System.out.println("the division is " + (a/b));
                    break;
                     default:
                          System.out.println("this is invalid number  in calculator" + (a/b));
            }
       }
    }

