
package com.company.AccessModifiersAndConstructor;

class Cylinder {
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
        public class Practiceset_09 {

            public static void main(String[] args) {
                Cylinder cy= new Cylinder();
                cy.setHeight(12);
                int h = cy.getHeight();
                System.out.println(h);
                cy.setRadius(5);
                System.out.println(cy.getRadius());
            }
        }


  // problem 02  // problem 03 // problem 04 //problem 05
/*
package com.company.AccessModifiersAndConstructor;
class cylinder {

}
public class Practiceset_09 {
    public static void main(String[] args) {

    }
}

 */