package com.company.Array_List;

import java.util.ArrayList;
import java.util.Collections;

 // import java.util.*;     --->>> THIS SYNTAX ARE FOR SAVE MEMORY AND LESS CODE  LINE   FOR (*) MULTIPLE KEYWORDS  ---<<<

public class Question_day_01 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(" ---- >>> data  in array  --- <<<<");
        list.add(45);
        list.add(45);
        list.add(44);
        list.add(43);
        list.add(42);
        list.add(41);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);


        System.out.println(" --- >>>  Size of array ---<<<");

        for (int i =0 ; i < list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        System.out.println(" ----->>>> ✔Q1: Remove Even Numbers ----<<<<<<  ");


        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) % 2 == 0) {
                list.remove(j);
                j--;
            }

            System.out.println(list);
        }


        System.out.println("  ---->>>Q2: Find Duplicates (without Set)  ----<<< ");

        for (int a = 0; a <list.size();a++){
            for (int b = a + 1 ; b <list.size();b++){
                if (list.get(a).equals(list.get(b))){
                    System.out.println( "Duplicate : " + list.get(a));
                }
            }
        }

        System.out.println("  --->>>> Q3: Reverse ArrayList -----<<<<<  ");

        for (int y =0 ; y < list.size() /2 ;y++){
            int temp = list.get(y);
            list.set(y , list.get(list.size() - 1 - y));
            list.set(list.size() - 1 -y,temp);
        }
        System.out.println(list);
    }
}
