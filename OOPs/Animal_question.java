package com.company.OOPs;
class Animal2 {
    public void sound2() {
        System.out.println(" animal make sound ");
    }
}
     class tiger extends Animal2{
         @Override
         public void sound2() {
             System.out.println("Roarr");
         }
     }
     class cow extends Animal2{
         @Override
         public void sound2() {
             System.out.println(" moo , moo ");
         }
     }


public class Animal_question {
    public static void main(String[] args) {

        Animal2 a1 = new tiger();
        Animal2 a2 = new cow();

        a1.sound2();
        a2.sound2();
    }
}
