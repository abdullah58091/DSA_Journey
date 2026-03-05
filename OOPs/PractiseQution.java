/*
    //   problem 1
package com.company.OOPs;
class Employee1{

    int salary;
    String name ;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class PractiseQution {
    public static void main(String[] args) {

        Employee1 abdullah =new Employee1();
        abdullah.setName("MOHD.abdullah");
        abdullah.salary = 890000;


        System.out.println(abdullah.getName());
        System.out.println(abdullah.getSalary());

    }
}

 */

/*
    //problem 2

package com.company.OOPs;

   class cellphone{


     public   void ring() {
         System.out.println("ring");

     }

     public void Vibrat() {
         System.out.println("vibrat");
     }
 }


public class PractiseQution {
      public static void main(String[] args) {
           cellphone vivo = new cellphone();

           vivo.Vibrat();
           vivo.ring();
    }
}

        */

 // problem 3
/*
package com.company.OOPs;
 class Square{
     int side;
     public int area() {
     return side*side;
 }
 public  int perimeter (){
      return 4*side;
     }
 }
public class PractiseQution {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 8;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }

}

 */


     // problem 4
/*
package com.company.OOPs;
class rectangle{
    int length;
    int breath;
    public int rectangle(){
        return length*breath;
    }
    public int perimeter(){
        return 4*length;
    }
}
 public class PractiseQution {
     public static void main(String[] args) {
         rectangle rec = new rectangle();
          rec.length = 4;
          rec.breath= 8;

         System.out.println( rec.rectangle());
         System.out.println(rec.perimeter());

     }
 }

 */


      // problem 5
/*
package com.company.OOPs;
  class Tommy {
       public void hit(){
           System.out.println("monster destroyed");
       }
       public void running(){
           System.out.println(" monster running ");
       }
       public void fir(){
           System.out.println("monster attack in city ");
       }
  }
public class PractiseQution {
    public static void main(String[] args) {
        Tommy Monster = new Tommy();
        Monster.hit();
        Monster.fir();
        Monster.running();
    }

    }

 */




     // problem 06

 package com.company.OOPs;

   // ye class hai
  class Circle {
      float r = 7;
      float pi = 3.14f ;
      float  peremeter = 2 * pi * r;
      float area = 3.14f * r;
      public  void peremeter() {
          System.out.println("the total number of circumfrence : " + peremeter);
      }
       public void  arae(){
           System.out.println("the circle area is : " + area);
       }
   }
      // ye fir object hai
public class PractiseQution {
    public static void main(String[] args) {
             Circle c = new Circle();
             // ye fir method hai
              c.peremeter();
              c.arae();
    }
}


   //  isko kehte hai oops ka concepts
/*
package com.company.OOPs;

class circle{
    int r=8;
    float area=3.14f*r*r;
    float perimeter=2*3.14f*r;
    public void area(){
        System.out.println("Area of a circle is : "+area);
    }
    public void perimeter(){
        System.out.println("Perimeter of a circle is : "+perimeter);
    }

}

public class PractiseQution {
    public static void main(String[] args) {
        circle c=new circle();
        c.area();
        c.perimeter();
    }
}

 */