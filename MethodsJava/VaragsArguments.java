package com.company.MethodsJava;

public class VaragsArguments {

//    static int sum(int a, int b) {
//        return a + b;
//    }
//    static int sum(int a,int b, int c){
//        return a+b+c;
//    }
//
//    public static void main(String[] args) {
//        System.out.println("welcome to the varargs tutorial");
//        System.out.println("the sum is 4 and 9: " + sum(4, 9));
//        System.out.println("the sum is 45 an 89: "+ sum(45,49));
//        System.out.println("the sum is 23 ,56 and 78: " + sum(23,56,78));

        // YAHA PER KESE VARARGS KESE USE HAI (int...arr) yahi hai  easy hai

    static int sum(int...arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
        public static void main (String[]args){
            System.out.println("welcome to the varargs tutorial");
            System.out.println("the sum is 4 and 9: " + sum(4, 9));
            System.out.println("the sum is 45 an 89: " + sum(45, 89));
            System.out.println("the sum is 23 ,56 and 78: " + sum(23, 56, 78));
            System.out.println("the sum is 23,45,67,89,90,56,23,1,30 and76: " + sum(23,45,67,89,90,56,23,1,76,30));
            System.out.println("the sum is nothing : " + sum());
        }
    }





