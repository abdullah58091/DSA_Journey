package com.company.OOPs;

interface  Animal1 {
     void walk ();

}

interface  herbivore {

}
class HORSE  implements  Animal1 , herbivore{
    public  void walk(){
        System.out.println(" 4leg walk ");
    }
}

public class Interface {
    public static void main(String[] args) {
        HORSE pet1 = new HORSE();
        pet1.walk();

    }
}
