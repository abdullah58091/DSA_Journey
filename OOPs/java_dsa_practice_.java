package com.company.OOPs;

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

public class java_dsa_practice_ {
    public static void main(String[] args) {


        Book sub1 = new Book(" atom " , "abdullah");
        sub1.display();

    }
}
