package com.company.Hash_dsa;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        //country(key),population(value)
        HashMap<String,Integer> map = new HashMap<>();

        //Insertion
        map.put("India" ,120);
        map.put("china", 150);
        map.put("america" ,30);

        System.out.println(map);

        map.put("china",180);
        System.out.println(map);

        //Search
        if (map.containsKey("america")){
            System.out.println("yes is present ");
        }else{
            System.out.println("not is present");
        }

        System.out.println(map.get("china"));
        System.out.println(map.get("russia")); // null why show that  not present in data

        // // first iteration is basic  normal code use
//        int arr [] = {11,12,13};
//        for (int i = 0 ; i<3;i++){
//            System.out.print(arr [i] +" ");
//        }
//        System.out.println();
//

       // second iteration use key word
//        for (int val : arr){
//            System.out.print(val + " ");
//        }
//        System.out.println();

        // first iteration use key word
        for (Map.Entry<String ,Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
            //second iteration use key word
        Set<String>keys = map.keySet();
        for (String key : keys){
            System.out.println(key + " "+ map.get(key));
        }

        // Delete keywords
        map.remove("china");
        System.out.println(map);
    }
}
