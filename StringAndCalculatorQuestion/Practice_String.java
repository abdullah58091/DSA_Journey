package com.company.StringAndCalculatorQuestion;

import java.util.Scanner;

public class Practice_String {
    public static void main(String[] args) {
        String name = new String("Abdullah");
        String name1 = "Abdullah";
        System.out.print("my name is ");
        System.out.println(name1);
        System.out.printf("5334.0020");


        //question 01 hai

        String value =  name.toLowerCase();
        System.out.println(value);
        int  value2 = name.length();
        System.out.println(value2);
        String value3 = name.toUpperCase();
        System.out.println(value3);
        String value4 = name.substring((4));
        System.out.println(value4);
        String trimmed = "      Mohammad   abdullah     ";
        System.out.println(trimmed);
        System.out.println(trimmed.trim());


        String value6 =  name.substring(2,6);
        System.out.println(value6);
        String value7 = name.replace('a','h');
        System.out.println(value7);
        String value8 = name.replace('d','c');
        System.out.println(value8);
        System.out.println(value.startsWith("mod"));
        System.out.println(value.startsWith("abd"));
        System.out.println(value.endsWith("llah"));
        System.out.println(value.endsWith("mod"));
        System.out.println(value.charAt(2));
        System.out.println(value.indexOf("ll"));
        System.out.println(value.indexOf("A",2));
        System.out.println(value.lastIndexOf("l"));
        System.out.println(value.lastIndexOf("l",3));
        System.out.println(value.equals("abdullah"));
        System.out.println(value.equalsIgnoreCase("Abdullah"));
        System.out.println("the name is abdullah\t5554" );
        // question practice one
        System.out.println(value.toLowerCase());
        //question practice 2
        System.out.println(value.replace('a','s'));
        //quetion practise 3
        System.out.println("\"Dear < | name | >,Trans a lot");
        System.out.println(value.replace("a","<\\| name |\\"));
        //quetion practice 4

        String mysteing ="md abdullah  java";
        System.out.println(mysteing.indexOf(" "));
        System.out.println(mysteing.indexOf("  "));


        // question practice 05
        System.out.println("\"Dear abdullah, this java course is nice .thanks you");






        // day second practise02 java dsa

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR NAME  PLEASE: ");
        String name4 = sc.next();
        System.out.println(name4);
        System.out.print("ENTER THE FIRST ");
        String firstname = sc.next();
        System.out.print("ENTER THE LAST");
        String lastname = sc.next();
        System.out.print("THIS IS YOUR FULL NAME  :");
        String fullname = firstname + " " + lastname;
        System.out.println(fullname);


        String sentence = " my name is mr abdullah and this is my java code practice ";
        System.out.println(sentence.length());

       // for (int i = 0; i < sentence.length(); i++) {
         //   System.out.println(sentence.charAt(i));
       // }

       // System.out.println("enter first vale ");
         String first = "welcome";

       // System.out.println("enter second value");
        String second = "welcome";
        System.out.println("THE VALUE ARE : ");


        if (first.equals(second) ){
            System.out.println(" this are equal");
        }else {
            System.out.println("this is not equal");
        }
            //DO NOT USE == to check for string equality
            //Gives correct answer here

            if (first == second){
                System.out.println(" are same and  equal");
            }else {
                System.out.println("are not same and equal");
            }
                //Gives incorrect answer here
        if (new String ("welcome")  ==  new String("welcome")) {
            System.out.println("that are same string  value");
        }else{
            System.out.println("that are not same string value");
        }
        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        int number2 = 345;
        String str2 = Integer.toString(number2);
        System.out.println(str2.length());

        // homework problem  01

       System.out.println("Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.");
        int size =sc.nextInt();
        String arr [] = new String[size];
        int tolength =0;
        for (int i=0;i<size;i++){
            arr[i] = sc.next();
            tolength += arr[i].length();
        }
        System.out.println(tolength);



        // problem 02

        String original = sc.next();
        String result = original.replace("e","i");
        System.out.println(result);

        // problem 03

        String email = sc.next();
        String userName = "";


        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }


        System.out.println(userName);




        String email2 = sc.next();
        String userName2 = "";


        for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
                break;
            } else {
                userName2 += email.charAt(i);
            }
        }


        System.out.println(userName2);
    }
}
