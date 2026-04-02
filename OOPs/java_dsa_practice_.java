package com.company.OOPs;

        // problem 01

class  Book {

    String title ;
    String author ;

    // construct
     Book (String title, String author) {
         this.title = title;
         this.author = author;
     }

    public  void  display() {
        System.out.println(" title " + title);
        System.out.println("author " + author);
    }
}

        // problem 02

class StudentCollege {
       private String name;
      private int marks ;

      public  void setName(String name){
          this.name = name;
      }
      public  void setMarks(int marks){
          this.marks= marks;
      }

      public String getName() {
        return name;
      }

      public int getMarks() {
        return marks;
      }

    public  void printStudentDetails (){
          System.out.println("Student detailed");
          System.out.println("Name : " + name);
          System.out.println("marks : " + marks);
      }
  }

  // problem 0 3

  class EmployeeCompany {

      private String name;
      private int salary;

      public void setName(String name) {
          this.name = name;
      }

      public void setSalary(int salary) {
          this.salary = salary;
      }

      public String getName() {
          return name;
      }

      public int getSalary() {
          return salary;
      }

      public void printEmployeeDetails() {
          System.out.println(" Employee detailed ");
          System.out.println("Name : " + name);
          System.out.println("salary : " + salary);
      }
  }

public class java_dsa_practice_ {
    public static void main(String[] args) {


        Book sub1 = new Book(" atom " , "abdullah");
        sub1.display();

        StudentCollege detail = new StudentCollege();
        detail.setName("abdullah");
        detail.setMarks(98);

        detail.printStudentDetails();

        EmployeeCompany detailed = new EmployeeCompany();
        detailed.setName("abdullah");
        detailed.setSalary(50000);

        detailed.printEmployeeDetails();
    }
}
