package ArraysPractice;

import java.util.HashMap;

// Problem Statement
//
//You are given an array representing the stock quantity of products in a warehouse.
//
//Find the first product whose quantity is repeated in the inventory list.
//
//Return the repeated quantity that appears first according to its first occurrence.
public class Product_Inventory_Alert_med {
    public static void main(String[] args) {
        int arr [] = {5,3,4,3,5,2};
        HashMap<Integer,Integer> map =  new HashMap<>();

        for(int num :arr){
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        for(int num : arr){
            if(map.get(num) > 1){
                System.out.println("first Repeating Element: " + num);
                return;
            }
        }
        System.out.println("No Repeating Element Found");
    }
}
