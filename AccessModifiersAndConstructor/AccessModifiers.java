/*
package com.company.AccessModifiersAndConstructor;


class MyEmployee{
    private int id ;
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee a =new MyEmployee();
        //a.id = (4353336);
         //a.name = ("mhod abdullah")
        // a.setName("mhod abdullah"); --> this is error show because it is using private in a class .
        a.setId(65755848);
        a.setName("abdullah");
        System.out.println(a.getName());
       System.out.println(a.getId());


    }
}
*/
package com.company.AccessModifiersAndConstructor;

class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee() {
        id = 23;
        name = "your name- is ";
    }
    public MyMainEmployee (String myName , int myid){
        id = myid;
        name = myName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

public class AccessModifiers {
    public static void main(String[] args) {
        MyMainEmployee a = new MyMainEmployee();
    }
}