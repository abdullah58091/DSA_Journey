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

 // problem 02

class Student {
     String   StudentName ;
     int      rollnumber ;
     String   section ;
     int      studentClass ;
     double   marks ;

      public  void StudentDetailed (){
          System.out.println(" all detailed student ");
          System.out.println("Name "         +   StudentName);
          System.out.println("Roll numbers " +   rollnumber);
          System.out.println("section"       +   section);
          System.out.println("class"         +   studentClass);
          System.out.println("Student marks" +   marks);
      }
}

// problem 03

class  pen {
     String color;
     String type;

     public void penDetailed (){
         System.out.println("THE PEN COLOR IS : "  +  this.color);
         System.out.println("THE PEN TYPE IS  : "  +  this.type);
     }
}

// problem 4

class  Student2 {
     String name ;
     int marks ;

      public void result() {
        System.out.println( " name " + name );
        System.out.println(" mareks "+ marks );

        if ( marks >= 33)
            System.out.println("pass");
        else
            System.out.println("fail");

    }
}


// problem 05

class student3{
     String name ;
     int mathmarks ;
     int hindimarks ;
     int englishmarks ;

     public  int totalmarks (){
         return mathmarks+hindimarks+englishmarks;
     }
     public double  averagemarks (){
         return totalmarks()/3.0;
     }
     public void displaygrade (){
         double avg = averagemarks();

         System.out.println("Name: " + name);
         System.out.println("Total: " + totalmarks());
         System.out.println("Average: " + averagemarks());

         if ( avg >= 80)
             System.out.println("grade : A");
         else if (avg >= 60)
             System.out.println("grade : b");
         else if (avg >= 30)
             System.out.println("grade c");
         else
             System.out.println("grade fail");



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



        // student  1

        Student s1 = new Student();

        s1.StudentName  = " Abdullah";
        s1.rollnumber   =   12;
        s1.studentClass =   11;
        s1.section      = " c  ";
        s1.marks        =   78.56;

        // student 2

        Student s2 = new Student();
        s2.StudentName  = " Riya ";
        s2.studentClass =   12;
        s2.section      = " d ";
        s2.rollnumber   =   14;
        s2.marks        =   88.23;


       s1.StudentDetailed();
       s2.StudentDetailed();


       // pen

        pen write = new pen();
        write.color = " black ";
        write.type  = " dot ";

        write.penDetailed();


        Student2 stu1 = new Student2();
        stu1.name = "Abdullah";
        stu1.marks =  80 ;

        stu1.result();


        student3 stu3 =new student3();
        stu3.name = "Abdullah";
        stu3.mathmarks = 45;
        stu3.hindimarks =  78;
        stu3.englishmarks = 23;

        stu3.displaygrade();
    }
}
