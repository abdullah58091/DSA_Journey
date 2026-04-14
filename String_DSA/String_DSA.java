package com.company.String_DSA;

public class String_DSA {
    public static void main(String[] args) {

        // problem 01 in string reverse

        String name = "abdullah";
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));
        }


        // problem 02 Reverse a String (using StringBuilder class)
        System.out.println("Reverse a String (using StringBuilder class)");

        StringBuilder reverse = new StringBuilder("abdullah");
        for (int i = 0; i < reverse.length() / 2; i++) {
            int front = i;
            int back = reverse.length() - 1 - i;
            char frontchar = reverse.charAt(front);
            char backchar = reverse.charAt(back);

            reverse.setCharAt(front, backchar);
            reverse.setCharAt(back, frontchar);
        }
        System.out.println(reverse);

        System.out.println(" this is advance java  string ");
        StringBuilder sb = new StringBuilder("abdullah");
        System.out.println(sb);

        sb.delete(1, 7);
        System.out.println(sb);
        sb.append("mhod");
        System.out.println(sb);

        sb.setCharAt(0, 'P');
        System.out.println(sb);
        StringBuilder sb1 = new StringBuilder("mr");
        sb1.append("abdullah");
        System.out.println(sb1);
        System.out.println(sb1.length());


        // problem a

        String name1 = "abdullah";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name1.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("vowels " + count);

        //problem b

        System.out.println(" this is very are simple  to reverse  sentence  StringBuilder");
       String str = "hello";
       StringBuilder sb2 = new StringBuilder(str);
       sb2.reverse();
        System.out.println(sb2);

        //  problem c

        String str2 = "MADAM";
        StringBuilder sb3 = new StringBuilder(str2);
        sb3.reverse();
        if (str2.equals(sb3.toString())){
            System.out.println("Palindrome");
        }else{
            System.out.println("not Palindrome");
        }


          // problem d


        String str3 = "my name is abdullah ";
        String result = str3.replace(" ","");
        System.out.println(result);

        // problem e

        String str4 = "aaabbccccd";
        StringBuilder result2 = new StringBuilder();

        int count1 = 1;

        for (int i = 0; i < str4.length() - 1; i++) {

            if (str4.charAt(i) == str4.charAt(i + 1)) {
                count1++;
            } else {
                result2.append(str4.charAt(i));
                result2.append(count1);
                count1 = 1;
            }
        }

        result2.append(str4.charAt(str4.length() - 1));
        result2.append(count1);

        System.out.println(result2);
    }
}

