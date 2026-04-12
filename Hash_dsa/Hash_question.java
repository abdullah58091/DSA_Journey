package com.company.Hash_dsa;

import java.util.HashMap;
import java.util.HashSet;

public class Hash_question {

    // problem 01 majority element
    public static void  majorityElement( int nums []) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > n / 3) {
                System.out.println(key);
            }
        }
    }
    // problem 02 union of set (A U B)

    public static int union(int arr1 [],int arr2 []){   // o(n)
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i< arr1.length;i++){
            set.add(arr1[i]);
        }
        for (int j =0 ; j< arr2.length;j++){
            set.add(arr2[j]);
        }
        return set.size();
    }

    //problem 03 intersection of set in array (A intersection B)

    public static int intersection(int Arr1 [], int Arr2 []) {
        HashSet<Integer> set2 = new HashSet<>();
            int count =0;
        for (int i =0;i< Arr1.length;i++){
            set2.add(Arr1[i]);
        }
        for (int j=0;j< Arr2.length;j++) {
            if (set2.contains(Arr2[j])) {
                count++;
                set2.remove(Arr2[j]);
            }
        }
        return count;
    }

    // problem 04 "Itinerary loop : "

    public static  String getStart(HashMap<String,String> tick){
        HashMap<String,String> revMap = new HashMap<>();

        for (String  key : tick.keySet()){
            revMap.put(tick.get(key) , key);
        }

        for (String key : tick.keySet()){
            if (!revMap.containsKey(key)) {
                return  key;
            }
        }
        return  null;
    }

    //problem 05 Subarray sum equal to k



    public static void main(String[] args){
        int nums[] = {1, 3, 2, 5, 1, 3, 1, 5,1};
        System.out.println(" ------>>>>>MAJORITY <<<<----");
        majorityElement(nums);

        int arr1 [] = {7,3,9};
        int arr2 [] = {6,3,9,2,9,4};
        System.out.println(".UNION of SET :" + union(arr1,arr2));

        int Arr1 [] = {7,3,9};
        int Arr2 [] ={6,3,9,2,9,4};
        System.out.println(" Intersection : " + intersection(Arr1,Arr2));

        HashMap<String ,String > Ticket = new HashMap<>();
        Ticket.put("Chennai" , "Bengaluru");
        Ticket.put("Mumbai"  , "Delhi");
        Ticket.put("Goa"     , "Chennai");
        Ticket.put("Delhi"   , "Goa");

        String start = getStart(Ticket);

        while (Ticket.containsKey(start)){
            System.out.print(start+ "->");
            start =Ticket.get(start);
        }
        System.out.println(start);


        int arr[] = {10,2,-2,-20,10};
        int k = -10;
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        int ans = 0;
        int sum = 0;
        for (int j =0; j< arr.length;j++){
            sum += arr[j];

            if (map.containsKey(sum-k)){
                ans += map.get(sum-k);
            }
            if (map.containsKey(sum)){
                map.put(sum,map.get(sum) + 1);
            }else {
                map.put(sum,1);
            }
        }
        System.out.println(ans);
    }
}
