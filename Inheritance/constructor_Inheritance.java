/*
package com.company.Inheritance;
class Base1 {
    Base1(){
        System.out.println("I AM THE CONSTRUCTOR");
    }
    Base1(int x){
        System.out.println("I AM THE OVERLOADED CONSTRUCTOR WITH  VALUE OF X IS : " + x);
    }
}
 class derived1 extends  Base1{
    derived1(){
        System.out.println(" I AM THE DERIVED CLASS");
    }
    derived1(int x, int y){
        super(x);
        System.out.println("I AM THE OVERLOADED CONSTRUCTOR  DERIVED WITH  VALUE OF y IS : " + y );
    }
}

class child extends derived1{
    child(){
        System.out.println("I AM THE CHILD OF DERIVED CONSTRUCTOR");
    }

    child( int x, int y, int z){
        super(x,y);
        System.out.println("I AM THE OVERLOADED CONSTRUCTOR  DERIVED WITH  VALUE OF z IS : " + z);
    }
}


public class constructor_Inheritance {
    public static void main(String[] args) {
        Base1 b = new Base1();
        derived1 d = new derived1();
        derived1 f = new derived1(6,8);
        child c = new child();
        child c1 = new child(5,9,2);

    }
}

 */


/*

package com.company.Inheritance;
class base2 {
    int a;

    public int getA() {
        return a;
    }

    base2(int a) {
        this.a = a;
    }

    public int returnone() {
        return 1;
    }
}
    class base3 extends base2{
        base3(int c){
            super(c);
            System.out.println(" this is a constructor ");
        }
}
public class constructor_Inheritance {
    public static void main(String[] args) {
        base2 t = new base2(6);
        base3 u = new base3(9);
        System.out.println(t.getA());
        System.out.println(u.getA());

    }
}

 */
   // dynemic method dispatch

    /*
package com.company.Inheritance;

class phone {
    public void showtime() {
        System.out.println("time is 5:34 pm");
    }

    public void on() {
        System.out.println("turnning on phone ");
    }
}

class smartphone extends phone {
    public void music (){
        System.out.println("taylor swift");

    }

    @Override
    public void on () {
        System.out.println("turnning on smart phone ");
    }
}

public class constructor_Inheritance {
    public static void main(String[] args) {
       // phone obj = new phone();
        //smartphone oppo = new smartphone();
        // obj.name();


        phone obj =new smartphone(); //yes allowed
       // smartphone nokia = new phone(); // not allowed
           obj.showtime();
           obj.on();
            //obj.music();  not allowed
    }
}

     */
 // example hai

package com.company.Inheritance;

import org.w3c.dom.ls.LSOutput;

class animal {
    void sound (){
        System.out.println("animal sound");
    }
}
class dog extends animal{
    @Override
    void sound() {
        System.out.println("dog bark ");
    }
}
class cat extends  animal {
    void sound(){
        System.out.println("meow meow");
    }
}
public class constructor_Inheritance {
    public static void main(String[] args) {
        animal a = new dog();
        a.sound();
        animal b = new cat();
        b.sound();

    }
}
