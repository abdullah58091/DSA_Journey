package com.company.Abstract_Classes_and_Interface;
abstract class parents2{
    public parents2(){
        System.out.println(" this is a base 2 constructor ");
    }
    public void  hello (){
        System.out.println("welcome");
    }
    abstract  public  void greet();
    abstract  public void greet2();
}

class child2 extends  parents2{
    @Override
    public void greet() {
        System.out.println("good mornng");
    }

    @Override
    public void greet2() {

    }
}
abstract  class child3 extends child2{

    public void th(){
        System.out.println(" i am good ");
    }
}
public class introductionhai {
    public static void main(String[] args) {
              // parent2 p = new parent2(); -- error
        child2 c = new child2();
        // child c3 = new child3(); -- error
    }
}
