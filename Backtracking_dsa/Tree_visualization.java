package com.company.Backtracking_dsa;

public class Tree_visualization {


   // Backtracking in RecursionJava
    //Print all Permutations


    public static  void printPermutation(String str,String prem , int index){

        if (str.length() == 0){
            System.out.println(prem);
            return;
        }
        for (int i =0; i<str.length();i++){
            char current = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            printPermutation(newstr,  prem+current, index+1);
        }
    }

    public static void main(String[] args) {
        System.out.println("tree visualization step recursion");
        String str ="ABC";
        printPermutation(str, "", 0);  // Time complexity - O(n*n!)
    }
}
