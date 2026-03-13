package com.company.Recursion_dsa;

import java.util.ArrayList;

public class recursion_Advance_question {

    //  q1 print all  permutation (it means all combination of letter)

    public static void printpermutation(String str, int idx, String prem) {
        if (str.length() == 0) {
            System.out.println(prem);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            // "abc"  --<< a = bc, b =ac
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printpermutation(newStr, idx + 1, prem + current);
        }
    }

    // Q2. CountPathMaze
    public static int countpath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // move downwards
        int downPath = countpath(i + 1, j, n, m);

        //  move right
        int rightPath = countpath(i, j + 1, n, m);

        return downPath + rightPath;
    }

    // Q3. Tiling problem

    public static int tile(int n1, int m1) {

        if (n1 == m1) {
            return 2;
        }
        if (n1 < m1) {
            return 1;
        }
        // vertically
        int vertPlacement = tile(n1 - m1, m1);

        // horizontally

        int horPlacement = tile(n1 - 1, m1);

        return vertPlacement + horPlacement;

    }


    //Q4. Friends pairing problem

    public static int callGuests(int n2) {

        if (n2 <= 1) {
            return 1;
        }
            // single
            int ways1 = callGuests(n2 - 1);

            // pair
            int ways2 = (n2 -1)*callGuests(n2 - 2);

            return ways1 + ways2;
        }



        //Q5. Subsets of a set

        public static void Subset(ArrayList<Integer>subset){
             for (int i =0;i< subset.size();i++ ){
                 System.out.print(subset.get(i)+ " ");
             }
                System.out.println();
             }
            public  static void findsubset(int n3,ArrayList<Integer> subset){
        if (n3 == 0){
            Subset(subset);
            return;
        }
                // not add
            findsubset(n3 - 1,subset);
             // not add
            subset.add(n3);
            findsubset(n3 - 1,subset);
              // remove (backtracking
                subset.remove(subset.size() - 1);
                findsubset(n3 -1,subset);
        }




        public static void main (String[]args){

            System.out.println("PERMUTATION PRINT  ");
            String str = "abc";
            printpermutation(str, 0, "");  //Time complexity - O(n*n!)

            System.out.println(" count path maze");
            int n = 3, m = 3;
            int totalpath = countpath(0, 0, n, m);
            System.out.println(totalpath); //  Time complexity - O(2^(m+n))

            System.out.println(" the placement tile  ");

            int n1 = 4, m1 = 2;
            System.out.println(tile(n1, m1));

            System.out.println( " PAIRING ");
            int n2 = 4;
            System.out.println(callGuests(n2));

            System.out.println("SUBSET");
            int n3 =3;
            ArrayList<Integer>subset = new ArrayList<>();
            findsubset(n3,subset); // the time complexity is o(2^n)


    }
}

