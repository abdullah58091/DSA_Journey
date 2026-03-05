
/*


package com.company.Inheritance;

 class  Base{
     public int x;

     public int getX() {
         return x;
     }
     public void setX(int x) {
         System.out.println(" the value of x is :");
         this.x = x;
     }
 }
 class derived extends  Base{
     public int y ;

     public int getY() {
         return y;
     }

     public void setY(int y) {
         System.out.println("the value of y is : ");
         this.y = y;
     }
 }

public class IntroductionInheritance {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        derived d = new derived();
        d.setX(7);
        System.out.println(d.getX());
    }
}

 */

package com.company.Inheritance;
class  Vehicle{
    public int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println(" the fortuner  car number is :");
        this.x = x;
    }
}
class car extends  Vehicle{
    private String y ;

    public String getY() {
        return y;
    }

    public void setY(String y) {
        System.out.println("the scorpio car number is : ");
        this.y = y;
    }
}

public class IntroductionInheritance {
    public static void main(String[] args) {
        Vehicle b = new Vehicle();
        b.setX(5554);
        System.out.println(b.getX());

        car d = new car();
        d.setY("0020");
        System.out.println( d.getY());
    }
}
   // more example or hai karo ge to ho jaye ga
