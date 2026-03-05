/*  problem 01
package com.company.Inheritance;
class Circle1 {
    public int radius;

    Circle1(int r){
        System.out.println(" this is a circle paramerte constructor");
        this.radius = r;
    }

    public double area (){
         return  Math.PI * this.radius* this.radius;
    }
}



class Cylinder1 extends Circle1{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println(" this is  the cylinder parameter  ");
        this.height = h;
    }

    public double volume(){
        return  Math.PI*this.radius*this.radius*height;
    }
}

public class Practice_set_Inheritance {
    public static void main(String[] args) {
        //Circle1 obj = new Circle1(12);
     Cylinder1  obj = new Cylinder1(12,4 );
    }
}

 */
  // problem 2 hai
package com.company.Inheritance;

 class BASE {
     BASE(){
         System.out.println("base constructor hai ");
     }

 }
 class DERIVED1 extends BASE {
     DERIVED1(){
         System.out.println("derived 1 constructor hai ");
     }

 }
 class DERIVED2 extends DERIVED1{
     DERIVED2(){
         System.out.println("derived 2 constructor hai");
     }

 }
public class Practice_set_Inheritance {
    public static void main(String[] args) {
        DERIVED2 obj = new DERIVED2();

    }

    }


    // or question hai see the note hai 3 are left
