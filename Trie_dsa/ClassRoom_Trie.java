package com.company.Trie_dsa;

public class ClassRoom_Trie {

    static  class Node {
        Node [] children ;
        boolean eow ;

        public Node(){
            children = new Node[26];
            for (int i=0;i<26;i++){
                children[i] =null;
            }
            eow =false;
        }
    }
    static  Node root = new Node();

    public  static  void  insert (String word){

        Node curr = root;
        for(int i = 0 ; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            if (i == word.length()-1){
                curr.children[idx].eow =true;
            }
            curr = curr.children[idx];
        }
    }
    public static  boolean search (String key ){
        Node curr = root ;
        for (int i=0; i<key.length();i++){
            int idx = key.charAt(i)-'a';
            Node node =curr.children[idx];

            if (node == null){
                return false;
            }
            if (i == key.length() - 1 && node.eow == false){
                return false;
            }

            curr = curr.children[idx];
        }
        return true;
    }
            // problem 01
    public  static  boolean wordBreak(String key){
        if (key.length() == 0){
            return true;
        }
        for (int i=0;i<=key.length();i++){
          String  firstPart = key.substring(0,i);
          String secPart = key.substring(1);
          if (search(firstPart) && wordBreak(secPart)){
              return true;
          }
        }
        return false;
    }

    public static boolean startWith(String prefix){
        Node curr = root ;
        for (int i=0; i<prefix.length();i++){
            int idx = prefix.charAt(i)-'a';
            if (curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static int countNode(Node root ){
        if ( root == null){
            return 0;
        }
        int count =0;
        for (int i=0; i<26;i++){
          if (root.children[i] != null){
              count+= countNode(root.children[i]);
          }
        }
        return count+1;
    }
    public  static String  ans1 = "";
    public  static  void  longestWord(Node root, StringBuilder temp){
        if (root == null){
            return;
        }
        for (int i =0;i<26;i++){
            if (root.children[i] != null && root.children[i].eow == true){
                temp.append((char) (i+'a'));
                if (temp.length() > ans1.length()){
                    ans1 = temp.toString();
                }
                longestWord(root.children[i],temp );

                temp.deleteCharAt(temp.length()-1);
            }
        }
    }


    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};
        for (String word : words) {
            insert(word);
            System.out.println("inserted " + word);
        }


        System.out.println("thee -> " + search("thee"));
        System.out.println("thor -> " + search("thor"));


       System.out.println("Words break problem  ");
        String words1[] = {"i","like","samsung" ,"mobile"};
        String key = "ilikesamsung";
        for (int i=0; i<words1.length;i++){
            insert(words1[i]);
        }
        System.out.println(wordBreak(key));

        System.out.println("Starts with  problem  ");
        String words2 []= {"apple", "app", "mango","man", "women"};
        String prefix = "app";
        for (int i=0;i<words2.length;i++){
            insert(words2[i]);
        }
        System.out.println(startWith(prefix));
        System.out.println("Count unique Substring");
        String str = "apple";
        for (int i=0; i<str.length(); i++){
            // step 1
            String suffix = str.substring(i);
            System.out.println(suffix);
            // step 2
              // insert(suffix);
        }
       // System.out.println(countNode(root) );

        System.out.println(" Longest word with all prefixes");

        String words3 [] ={"a","banana","app","apply" ,"ap","apple"};
        for (int i=0; i<words3.length;i++){
            insert(words3[i]);
        }

        longestWord(root,new StringBuilder( " "));
        System.out.println(ans1);
    }
}
