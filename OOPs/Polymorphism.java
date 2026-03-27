package com.company.OOPs;


class Student1 {

    String name ;
    int age ;
    int phoneNum;

    public void printInfo (String name){
        System.out.println(name);
    }

    public void printInfo (int age){
        System.out.println(age);
    }
    public void printIfo (int phoneNum){
        System.out.println(phoneNum);
    }

    public void printInfo(String name ,int age ,int phoneNum){
        System.out.println(name + " " + age + " " + phoneNum);
    }
}


public class Polymorphism {
    public static void main(String[] args) {

        Student1 student = new Student1();

        student.name = "Abdullah";
        student.age =  23;
        student.phoneNum = 12345678;

        student.printInfo(student.name);
        student.printInfo(student.age);
        student.printInfo(student.phoneNum);
        student.printInfo(student.name, student.phoneNum, student.age);


    }
}
