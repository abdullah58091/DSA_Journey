package com.company.OOPs;
// class hai

 class Employee {
     int id;
     String name;
     int salary ;
     public  void printdetailed  (){
         System.out.println("my id : " +  id);
         System.out.println("my name is : " +  name);
         System.out.println(" my salary is : "  + salary);
     }
 }


public class IntroductionOOPs {
    public static void main(String[] args) {
        System.out.println("this is my company empolyee detailed ");
         // object hai
        Employee abdullah = new Employee();
        Employee harry = new Employee();

        // employee abdullah ki hai
        abdullah.id = 1234;
        abdullah.name = "md. abdullah";
        abdullah.salary= 45000;

        // employee harry ki hai

        harry.id = 4356;
        harry.name = "Harry";
        harry.salary = 78000;



        // print detailed  attribute adjective

        abdullah.printdetailed();
        harry.printdetailed();


    }
}
