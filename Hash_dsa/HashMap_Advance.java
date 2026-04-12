package com.company.Hash_dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class HashMap_Advance {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private  int n;
        private int N;
        private LinkedList<Node> bucket[];

        @SuppressWarnings("unchecked")
        public HashMap (){
            this.N =4;
            this.bucket =new LinkedList[4];
            for (int i=0;i<4;i++){
                this.bucket[i] = new LinkedList<>();
            }
        }
        private  int hashFunction(K key){ // 0 N - 1
            int bi = key.hashCode();
           return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi ){
            LinkedList<Node> ll = bucket[bi];
            int di = 0;
            for(int i =0; i <ll.size();i++){
                if (ll.get(i).key == key){
                    return i; // di
                }
            }
            return  -1;
        }

        private  void  rehash (){
            LinkedList<Node> oldBucket [] = bucket;
            bucket = new LinkedList[N*2];

            for (int i =0; i<N*2;i++){
                bucket[i] = new LinkedList<>();
            }
            for (int i=0; i<oldBucket.length;i++){
                LinkedList<Node> ll = oldBucket[i];
                for (int j =0 ; j<ll.size();j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public  void  put(K key ,V value){
            int bi  = hashFunction(key);
            int di = searchInLL(key ,bi);
            if (di == -1){
                bucket [bi].add(new Node(key,value));
                n++;
            }else{
                Node node = bucket[bi].get(di);
                node.value =value;
            }

            double lambda = (double)n/N;
            if (lambda > 2.0){
                rehash();
            }
        }
        public  boolean containKey(K key){
            int bi  = hashFunction(key);
            int di = searchInLL(key ,bi);
            if (di == -1){
               return false;
            }else{
              return  true;
            }
        }
        public V remove(K key ){
            int bi  = hashFunction(key);
            int di = searchInLL(key ,bi);
            if (di == -1){
                return null;
            }else{
                Node node = bucket[bi].remove(di);
                n--;
                return node.value ;
            }
        }
        public  V get (K key){
            int bi  = hashFunction(key);
            int di = searchInLL(key ,bi);
            if (di == -1){
                return  null;
            }else{
                Node node = bucket[bi].get(di);
                return node.value;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for (int i =0;i<bucket.length;i++){
                LinkedList<Node> ll = bucket[i];
                for (int j=0;j<ll.size();j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
        public  boolean isEmpty(){
            return n == 0 ;
        }
    }


        public static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>();
            map.put("india",190);
            map.put("china",200);
            map.put("US",50);

            ArrayList<String> keys = map.keySet();
            for (int i =0 ;i< keys.size();i++){
                System.out.println(keys.get(i)+ " " +map.get(keys.get(i)));
            }
            map.remove("india");
            System.out.println(map.get("india"));
            System.out.println(map.containKey("china"));
        }
    }

