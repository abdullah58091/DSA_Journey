package com.company.StringAndCalculatorQuestion;

public class Practicecodestring {
    public static void main(String[] args) {
        //String name = new String("Abdullah");
        String name ="Abdullah";
//        System.out.print("my name is ");
//        System.out.println(name);
//        System.out.printf("5334.0020");
        //quetion 01 hai
        String value =  name.toLowerCase();
        System.out.println(value);
        int  vlaue2 = name.length();
        System.out.println(vlaue2);
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
        // quetion pactice one
        System.out.println(value.toLowerCase());
        //quetion practice 2
        System.out.println(value.replace('a','s'));
        //quetion practise 3
        System.out.println("\"Dear < | name | >,Transe a lot");
        System.out.println(value.replace("a","<\\| name |\\"));
        //quetion practice 4

        String mysteing ="md abdullah  java";
        System.out.println(mysteing.indexOf(" "));
        System.out.println(mysteing.indexOf("  "));


        // quetion practice 05
        System.out.println("\"Dear abdullah, this java course is nice .thanksyou");

    }
}
