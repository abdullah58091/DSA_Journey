package com.company.Linked_List;

import java.util.Collections;
import java.util.LinkedList;

public class Collection_Framework_LL {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("list");
        list.addFirst("this");
        System.out.println(list);
        System.out.println(list.size());

        for (int  i =0 ; i < list.size() ;i++){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        //Collections Method
        //Time complexity - O(n)
        //Space complexity - O(1)

        LinkedList<Integer> list3 = new LinkedList<>();

        list3.add(1);
        list3.add(2);

        System.out.println(" THIS IS ARRAY  ELEMENTS ");
        System.out.println(list3);
        System.out.println("THIS IS REVERSE  METHOD ");
        Collections.reverse(list3);
        System.out.println(list3);
    }
}
