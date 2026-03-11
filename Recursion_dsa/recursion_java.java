package com.company.Recursion_dsa;

public class recursion_java {

    public static void printnumber(int n) {

        // base

        if (n == 0) {
            return;
        }
        System.out.println(n); // print
        printnumber(n - 1);  //  recursion it means call function itself
    }


    // problem 2  Print numbers from 1 to 5.

    public  static void increase( int a) {

        if (a == 6) {
            return;
        }
        System.out.println(a);
        increase(a+1);
    }

    // problem 03 Print the sum of first n natural numbers.
    public  static  void  sum (int i, int x, int sum){
        if ( i == x){
            sum +=i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sum(i +1, x,sum);
        System.out.println(i); // is optional
    }

    //   problem 4 Print the sum of first n natural numbers.

    public  static int calclualtefactorial (int f ){

        // base
        if ( f == 1 || f == 0) {
            return 1;
        }
        int  fact = calclualtefactorial( f - 1); // recursion
        int fact_f = f * fact;
        return fact_f;
    }

    //Q5. Print the fibonacci sequence till nth term.

    public static void printfib(int a1,int b,int n1){
        if ( n1 == 0){
            return;
        }
        int c = a1 + b;
        System.out.println(c);
        printfib(  b ,  c , n1 -1 );
    }


    //Q6. Print x^n (with stack height = n)


    public static int calculatePower(int x1, int n2){
        if ( n2 == 0) {    // base 1
            return 1;
        }
        if (x1 == 0) {     // base 2
            return 0;
        }
        int x1Power = calculatePower(x1,n2-1);
        int x1pown = x1 * x1Power;
        return x1pown;
    }


    // Q7. Print x^n (with stack height = logn)


    public static  int calcpower( int  q, int w){
      if ( w == 0 ){   // base 1
          return 1;
      }
      if (q == 0){    // base2
          return 0;
      }
      // n is even
      if (w % 2 == 0){
          return calcpower(q,w/2) * calcpower(q,w/2);
      }
      else{   // n is odd
          return  calcpower(q,w/2) * calcpower(q,w/2) * q;
      }
    }


    public static void main(String[] args) {

        System.out.println("print number 5 to 1 reverse");
        int n = 5;
        printnumber(n); // (n-1)

        System.out.println("  print number 1 to 5 ");
        int a =1;
        increase(a);
        System.out.println(" sum natural numbers");
        sum(1,6,0);


        System.out.println(" factorial numbers");
        int f = 5;
        int answer = calclualtefactorial(f);
        System.out.println(answer);

        System.out.println(" fibonacci  sequence");

        int a1 =0 , b = 1;
        System.out.println(a1);
        System.out.println(b);
        int n1 =7;
        printfib(a1,b,n1-2);

        System.out.println(" power of x");

        int x1 = 2,n2 =5;
        int Answer = calculatePower(x1,n2);
        System.out.println(Answer);

        System.out.println(" power of x^n");
        int q= 2, w = 5;
        int ANS = calcpower(q,w);
        System.out.println(ANS);
    }
}


