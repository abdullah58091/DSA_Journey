package com.company.OOPs;


//  ---------- b) Run time polymorphism :---------
// ------ parent class -------


class shape {
    public void area (){
        System.out.println("Display Area of Shape ");
    }
}
             // ----------- Single Inheritance -----------
            // Triangle inherits properties of shape (Parent → Child)


class Triangle extends shape {
    public void area( int  h , int b ) {
        System.out.println( " Triangle  Area " +  (0.16 * b * h));
    }
}

        // ---------------- 2. Multilevel Inheritance ----------------
       // Polygon inherits from Shape

class  polygon extends  shape {
    public  void area(){
        System.out.println(" THIS  IS A POLYGON ");
    }
}


// Rectangle inherits from Polygon (Shape → Polygon → Rectangle)
 class  Rectangle extends polygon {
    public void area (int l , int w){
        System.out.println("RECTANGLE  AREA : " + (l * w));
    }
 }

        // ----------- Hierarchical Inheritance -----------
       // Circle1 is another child of shape (multiple classes inherit same parent)


class Circle1 extends   shape {
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

// ---------------- 4. Multiple Inheritance using Interface ----------------
interface Color {
    void color();
}

interface Border {
    void border();
}

// Square inherits Shape + implements two interfaces
class Square extends shape implements Color, Border {
    public void squareArea(int s) {
        System.out.println("Square Area: " + (s * s));
    }

    public void color() {
        System.out.println("Square Color: Red");
    }

    public void border() {
        System.out.println("Square Border: Thick");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        // single Inheritance

        Triangle t = new Triangle();
        t.area();
        t.area(10,5);
        System.out.println("--------------");

        // multilevel inheritance

        Rectangle r = new Rectangle();
        r.area();
        r.area(8,4);
        System.out.println("--------------");

        // Hierarchical Inheritance

        Circle1 c1 = new Circle1();
        c1.area();
        c1.area(7);
        System.out.println("-----------");

        // Multiple Inheritance using Interface

        Square sq = new Square();
        sq.area();
        sq.squareArea(6);
        sq.border();
        sq.color();
    }
}
