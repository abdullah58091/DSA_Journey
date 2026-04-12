package com.company.Hash_dsa;
import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {
    public static void main(String[] args) {
        // creating
        HashSet<Integer> set = new HashSet<Integer>();

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5);


        // search
        if (set.contains(3)) {
            System.out.println("set contains  is true ");
        }
        if (!set.contains(6)) {
            System.out.println("does not contains ");
        }
        System.out.println(set);
        set.remove(2);
        System.out.println(set);

        // size
        System.out.println("size of set is : " + set.size());

        // Iterator
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
