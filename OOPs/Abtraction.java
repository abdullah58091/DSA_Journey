package com.company.OOPs;

 abstract  class Animal {
    abstract   void  sound ();

    Animal(){
        System.out.println(" display the animal ");
    }

    public  void eat (){
        System.out.println("energy food ");
    }

    public void race (){
        System.out.println("running  my pet ");
    }
}
class cat extends  Animal{
    public void sound (){
        System.out.println("meow , meow ");
    }
}
class dog extends Animal{
    @Override
    public void sound() {
        System.out.println("bark , bark ");
    }
}
class  horse extends Animal{
     horse(){
         System.out.println("only horse display ");
     }
    public void sound () {
        System.out.println("heeeeee,hheeeueue");
    }
}

    /*
    String dog ;
    String cat ;

    public void setCat(String cat) {
        this.cat = cat;

    }

    public void setDog(String dog) {
        this.dog = dog;
    }
    class dog extends Animal{

    }
}

     */

public class Abtraction {
    public static void main(String[] args) {

      /*  Animal d1 = new Animal();
        d1.setCat("meow,meow");
        d1.setDog("bark , bark ");
        System.out.println(d1.dog);
        System.out.println(d1.cat);

       */

        cat billi =new cat();
        horse godha = new horse();
        dog kutta = new dog();

        billi.sound();
        godha.sound();
        kutta.sound();
        billi.eat();
        godha.race();

    }
}

