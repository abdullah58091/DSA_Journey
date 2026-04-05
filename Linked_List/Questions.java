package com.company.Linked_List;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {


        // problem 01 Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.

        LinkedList<Integer> num = new LinkedList<Integer>();

        num.add(1);
        num.add(5);
        num.add(7);
        num.add(3);
        num.add(8);
        num.add(2);
        num.add(3);

        System.out.println(num);

        int index = num.indexOf(7);


        System.out.println("Index is of 7 is : " + index);


        // this extra practice method not question  include method

        Collections.sort(num);
        System.out.println(num);
        num.remove(3);
        System.out.println(num);


        //problem 02 Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.
        LinkedList<Integer> num1 = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers (1-50):");
        for (int i = 0; i < 5; i++) {
            num1.add(sc.nextInt());
            System.out.println(num1);
        }
        System.out.println("Original List: " + num1);
        Iterator<Integer> it = num1.iterator();
        while (it.hasNext()) {
            if (it.next() > 25) {
                it.remove();
            }
        }
        System.out.println("After Deletion (>25 removed): " + num1);
    }
}

