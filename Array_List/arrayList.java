package com.company.Array_List;

import  java.util.ArrayList;
import java.util.Collections;

public class arrayList {
    public static void main(String[] args) {
       ArrayList<Integer> num = new ArrayList<Integer>();

       // Add element
        num.add(12);
        num.add(6);
        num.add(9);

        System.out.println(num);


        // Get element

        int element = num.get(1);
        System.out.println(element);


        // add  element in between

        num.add(2,8);
        System.out.println(num);

        // set element

        num.set(1,7);
        System.out.println(num);

        // delete element

        num.remove(0);
        System.out.println(num);

        // size

        int size = num.size();
        System.out.println(size);

        //loops   -- THIS KEYWORD ARE ITERATE

        for (int i = 0; i < num.size();i++){
            System.out.print(num.get(i));
        }
        System.out.println();

        //add

        num.add(0,12);
        System.out.println(num);


        // sorting

        Collections.sort(num);
        System.out.println(num);

    }
}
