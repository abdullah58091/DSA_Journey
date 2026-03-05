package com.company.MethodsJava;

public class MethodOverloading {
  /*  static  void apple(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        apple();
    }

   */


  //  CHANGING OF  INTEGER

/*
       static void change(int a) {
        a = 48;
    }

        public static void main(String[] args) {
        int[] arr = {52, 34, 67, 89, 78};
        int x = 45;
        change(x);
        System.out.println("the value of x after running change:" + x);
    }


 */
/*
    // CHANGING ARRAY
         static  void change2 (int [] arr){
             arr [0] = 98;
    }

    public static void main(String[] args) {
        int [] arr = {23,45,67,89,69};
        change2(arr);
        System.out.println("the value of x after running  change2 :"  + arr[0]);

    }


 */
    //METHODOVERLOADING
//    static void foo(){
//        System.out.println("good morning");
//    }
//
//    static void foo(int a){
//            System.out.println("good morning :" + a + " bro");
//        }
//    static void foo(int a, int b){
//            System.out.println("good morning " + a  + " bro");
//        System.out.println("good morning " + b + " bro");
//        }
//
//    public static void main(String[] args) {
//        foo();
//        foo(500);
//        foo(600,900);
//     //ARGUMENTS ARE ACTUAL
//    }


    static  void car_start(){
        System.out.println("hmmmm,hmmmmm,hmmmmmmmmmmmmm,hmmmmmmm,hmmh,hmmmh,mmmh,mhhhm,hmmm,");
    }
    static void car_gair(int a){
        System.out.println("ready" + a + "runway");
    }
    static void car_speed(int i,int j){
        System.out.println("min_speed " + i + " max_speed " + j + " is above please alert slow down speed");
    }

    // problem 0a
    static  void sum(){
        System.out.println("this is sum part ");
    }
      static int  sum_two(int t, int u){
        return t+u;
    }
    static int sum_three(int i,int j ,int e){
        return i+j+e;
    }

    // problem 0b
    static  void formula(){
        System.out.println("this is shape formula question ");
    }
    static   int square( int side){
        return side * side;
    }
    static int  rectangle(int l,int b ) {
        return l * b;
    }

    // problem 0c

    static  void max(){
        System.out.println("this is find the maximum number  ");
    }
    static   int max( int a,int b){
        if(a>b)
        return a;
        else
            return b;

    }
    static int max(int m,int n,int d ) {
        int v = m;
        if(n>v)
            v=n;
        if(d>v)
            v=d;
        return v;
    }
    public static void main(String[] args) {
        car_start();
        car_gair(1);
        car_speed(30,150);
        sum();
        System.out.println(sum_two(4,5));
        System.out.println( sum_three(3,4,6));
        System.out.println("this  is square " +square(5));
        System.out.println("this  is rectangle " + rectangle(4,5));
        System.out.println("maximum of two number "+ max(10,20));
        System.out.println("maximum of three numbers is   " + max(10,20,30));
    }

}




