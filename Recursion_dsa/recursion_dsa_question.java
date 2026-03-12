package com.company.Recursion_dsa;


import java.util.HashSet;

public class recursion_dsa_question {


    public static void Tower_of_Hanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println(" transfer  disk " + n + " from " + source + " to " + destination);
            return;
        }
        Tower_of_Hanoi(n-1,source,destination,helper);
        System.out.println(" transfer  disk " + n + " from " + source + " to " + destination);
        Tower_of_Hanoi(n-1,helper,source, destination);
    }

    // problem 02 reverse string

    public static  void revrse ( String str, int index){
        if ( index == 0){
            System.out.print(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        revrse(str,index -1 );
    }

    //- Find first & last occurrence of element

     public static  int first = -1 ;
    public static  int last = -1 ;

    public static void  findoccurance (String str1 , int idx,char element) {
        if (idx == str1.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char current = str1.charAt(idx);
        if (current == element) {
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }

        findoccurance( str1,idx+1,element);
    }


    //  Check if the array is sorted (strictly increasing)
    public static   boolean  sortted (  int arr [],int index1 ){
        if (index1 == arr.length -1){
            return true;
        }
        if(arr[index1] < arr[ index1 + 1]){    // unsorted condition is( >=)
            // array is sortted till now
            return sortted(arr,index1+1);
        }else{
            return false;
        }
    }

    // Move all 'x' to the end


    public static void  move_all( String str2, int index3 , int count ,String  newString){
        if ( index3  == str2.length()){
            for(int i =0 ; i < count;i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char current = str2.charAt(index3);
        if (current == 'x') {
            count++;
            move_all(str2,index3+1,count,newString);
        }else {
            newString += current;
            move_all(str2, index3 + 1, count, newString);
        }
    }

    //Remove all duplicates in String

    public static boolean [] map = new boolean[26];

    public static  void removeduplicate ( String str3 , int index4 ,String newString ){
         if (index4 == str3.length()){
             System.out.println(newString);
             return;
         }
        char current = str3.charAt(index4);
        if ( map[current -'a']  ==  true){
            removeduplicate(str3,index4 + 1 , newString);
        }else{
            newString += current;
            map[current - 'a'] =true;
            removeduplicate(str3,index4+1,newString);
        }
    }

     //  Print all subsequences     are important

    public static  void subsequences (String str5, int index5,String newString){
        if (index5 == str5.length()){
            System.out.println(newString);
            return;
        }
        char currentchar = str5.charAt(index5);

        // to be
        subsequences(str5 , index5+ 1,newString + currentchar);

        // or not  to be

        subsequences(str5 , index5+ 1, newString);
    }


       //Print all unique subsequences

    public static void unisubsequence(String str6, int idx6, String newString, HashSet<String> set) {

        if (idx6 == str6.length()){
            if (set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char current = str6.charAt(idx6);

        // to be
        unisubsequence(str6,idx6+1,newString+current,set);

        // or  not to be

        unisubsequence(str6,idx6+1,newString,set);
    }


    //  Print Keypad Combinations

    public static String [] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static  void printcomb(String str7,int idx7,String combination){
            if (idx7 == str7.length()){
                System.out.println(combination);
                return;
            }
        char currentcharacters = str7.charAt(idx7);
        String mapping = keypad[currentcharacters - '0'];

        for (int i =0; i< mapping.length(); i++){
            printcomb(str7,idx7 +1,combination+mapping.charAt(i));
        }
    }



        public static void main(String[] args) {
         int n = 1;
         Tower_of_Hanoi(n ,"S","H","D");

        System.out.println( "REVERSE STRING___");
        String str= "abcd";
        revrse(str,str.length() -1 ); // the time complexity o(n) due to equal of length

        System.out.println(" FIND   FIRST AND LAST  OCCURRENCE OF ELEMENT ");
        String str1 = "abaacdaefaah";
        findoccurance(str1,0,'a'); // the time complexity of o(n) due to string of length

        System.out.println(" sortted array");
        int arr[] = { 1,3,3};
        System.out.println(sortted(arr,0));  // the time complexity is o(n) due to depend on arr length

        System.out.println("MOVE ALL X NEAT ");
        String str2 = "abdxxx";
        move_all(str2,0,0,"");  // the time complexity is o(n) due to loop max value bego n  i am reduce constant

        System.out.println(" REMOVE DUPLICATE  VALUE");
        String str3 = "abbccda";
        removeduplicate(str,0,"newString : ");  //  THE TIME complexity  is o(n) it revers only not others

        System.out.println(" subsequence ");
        String str5 = "abc";
        subsequences(str5,0,""); // the time complexity is o(n) is due to


            System.out.println(" unique subsequence ");
            String str6 = "aaa";
            HashSet<String>set = new HashSet<>();
            unisubsequence(str6,0,"",set);  // the time complexity same


            System.out.println(" keypads keywords");
          String str7 = "2";
          printcomb(str7, 0,""); // the time complexity is o(4^n)

    }
}
