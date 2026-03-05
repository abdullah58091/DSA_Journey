package com.company.Abstract_Classes_and_Interface;


interface   Bicylce {


    int a= 34;
    void Applybreak( int decrement);
    void  speedup(int increment);
}

interface   spelendorbike {

    void blowhorn();
    void blowpop();

}

class bullet implements Bicylce{
   // int x =45;
    void  horn(){
        System.out.println("pee ,pee peep");
    }
    public  void  Applybreak(int decrement){
        System.out.println("stop");
    }
    public  void speedup( int increment){
        System.out.println("go ready 50 speed");

    }

      public void blowhorn(){
          System.out.println("excuse me");
      }
     public void blowpop(){
         System.out.println("site haato");
     }
        }


public class Interface {
    public static void main(String[] args) {
        bullet b =new bullet();
        b.horn();
        b.speedup(60);
        b.Applybreak(20);
        // you can creat properties in interface
        System.out.println(b.a);
        //you cannot modify the properties in intrface as they are final
        //b.a= 4546;
        System.out.println(b.a);
        b.blowhorn();
        b.blowpop();
        System.out.println(b);


    }
}
