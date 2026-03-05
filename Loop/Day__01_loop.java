package com.company.Loop;

import java.util.Scanner;

public class Day__01_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("___THIS IS A INCREASE PATTERN__");

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("___THIS IS  A DECREASE PATTERN___");

        int x = 5;
        for (int y = x; y >= 0; y--) {
            for (int z = 1; z <= y; z++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("____THIS IS A REVERSE NUMBERS___ ");
        int t = 26;
        for (int r = t; r >= 0; r--) {
            System.out.println(r);
        }


        System.out.println("____THIS IS A EVEN NUMBERS____");

        for (int p = 1; p <= 10; p++) {
            System.out.println(2 * p);
        }
        System.out.println("____THIS IS A OOD NUMBERS_____");

        for (int g = 1; g <= 10; g++) {
            System.out.println(2 * g + 1);
        }


        System.out.println("____THIS IS A PRIME NUMBERS___  ");

        int nums = 7;
        boolean prime = true;

        for (int w = 2; w <= nums; w++) {
            if (nums % w == 0) {
                prime = false;
                break;
            }
        }
        if (prime == true) {
            System.out.println(" yes it is a prime numbers ");
        } else {
            System.out.println(" prime numbers  it is not ");
        }


        System.out.println("enter the number ");
       // Scanner sc =new Scanner(System.in);
        System.out.println("enter is a = ");
        int  a = sc.nextInt();
        System.out.println("enter is b = ");
        int  b = sc.nextInt();

        System.out.println("the anwers is ");
        int sum = (a*b)/(a-b);
        System.out.println(sum);
       ;




        // this journey is apana college  practise question

        // problem first is solid rectangle pattern

       // Scanner sc = new Scanner(System.in);
        System.out.println("_____this is number of rectangle____");
        System.out.println("how many are  stare you gain in row ");
        int n1 = sc.nextInt();
        System.out.println("how many are star you gain in colum");
        int m = sc.nextInt();
        for (int r = 1; r <= n1; r++) {
            for (int q = 1; q <= m; q++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // problem second is hollow rectangle

        System.out.println("how many are  stare you gain in row ");
        int n4 = sc.nextInt();
        System.out.println("how many are star you gain in colum");
        int m1 = sc.nextInt();

        for (int i = 1; i <= n4; i++) {
            for (int j = 1; j <= m1; j++) {
                if (i == 1 || j == 1 || i == n4 || j == m1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        // pyramid

        System.out.println("how many are star you gain in pyramid4");
        int e = sc.nextInt();
        for (int t1 = 1; t1 <= e; t1++) {
            for (int d = 1; d <= t1; d++) {
                System.out.print("*");
            }
            System.out.println();
        }


        //  Inverted half pyramid
        System.out.println("how many are  stare you gain in reverse pyramid ");
        int s = sc.nextInt();
        for (int u = s; u >= 0; u--) {
            for (int h = 0; h <= u; h++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("how many are  stare you gain in right side  pyramid  ");
        int s1 = sc.nextInt();
        for (int u1 = 1; u1 <= s1; u1++) {

            for (int h1 = 1; h1 <= s1 - u1; h1++) {
                System.out.print(" ");
            }
            for (int h1 = 1; h1 <= u1; h1++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // number pattern
        System.out.println("enter the number of pyramid :  ");
        int s2 = sc.nextInt();
        for (int i1 = 1; i1 <= s2; i1++) {
            for (int j1 = 1; j1 <= i1; j1++) {
                System.out.print(j1 + " ");
            }
            System.out.println();
        }

        // inerted pattern numbers  pyramid

        System.out.println("enter the number ");
        int s3 = sc.nextInt();

        for (int i2 = s3; i2 >= 0; i2--) {
            for (int j2 = 1; j2 <= i2; j2++) {
                System.out.print(j2 + " ");
            }
            System.out.println();
        }


        System.out.println("enter the number ");
        int s4 = sc.nextInt();
        int num = 1;
        for (int i4 = 1; i4 <= s4; i4++) {
            for (int j4 = 1; j4 <= i4; j4++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }



                     // matric ke through araha hai answer  even odd ka
        System.out.println("enter the number ");
        int s5 = sc.nextInt();
        for (int i5 = 1; i5 <= s5; i5++) {
            for (int j5 = 1; j5 <= i5; j5++) {
                int sum1 = i5 + j5;
                if (sum1 % 2 == 0) {  // even
                    System.out.print("1 ");
                } else { //odd
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }



        // Butter fly pattern

        System.out.println("enter the number of butter fly  bigger :___");
        int s6 = sc.nextInt();
        for (int i6 = 1; i6 <= s6; i6++) {
            for (int j6 = 1; j6 <= i6; j6++) {
                System.out.print("*");
            }
            // space
            int space = 2 * (s6 - i6);                                  // 2(n-i) --<<< that are  to formula using for space the name
            for (int j6 = 1; j6 <= space; j6++) {
                System.out.print(" ");
            }
            // stare
            for (int j6 = 1; j6 <= i6; j6++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for (int i6 = s6; i6 >= 1; i6--) {

            for (int j6 = 1; j6 <= i6; j6++) {
                System.out.print("*");
            }
            int space = 2 * (s6 - i6);
            for (int j6 = 1; j6 <= space; j6++) {
                System.out.print(" ");
            }
            for (int j6 = 1; j6 <= i6; j6++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // solid rhombus
        System.out.println("enter the number you can how many types you create");
        int s7 = sc.nextInt();
        for (int i7 = 1; i7 <= s7; i7++) {
            // spaces
            for (int j7 = 1; j7 <= s7 - i7; j7++) {
                System.out.print(" ");
            }
            //star
            for (int j7 = 1; j7 <= s7; j7++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // number pattern

        System.out.println("enter the number of are print in compiler ");
        int s8 = sc.nextInt();
        for (int i8 = 1; i8 <= s8; i8++) {
            //space
            for (int j8 = 1; j8 <= s8 - i8; j8++) {
                System.out.print(" ");
            }
            //number
            for (int j8 = 1; j8 <= i8; j8++) {
                System.out.print(i8 + " ");
            }
            System.out.println();
        }
                // numbers pyramid pattern
        System.out.println(" enter the number of pyramid  which do you like the numbers are print in this pyramid");
        int s9 = sc.nextInt();
        for (int i9 = 1; i9 <= s9; i9++) {

            for (int j9 = 1; j9 <= s9 - i9; j9++) {
                System.out.print(" ");
            }
            for (int j9 = i9; j9 >= 1; j9--) {
                System.out.print(j9);
            }
            for (int j9 = 2; j9 <= i9; j9++) {
                System.out.print(j9);
            }
            System.out.println();
        }


        // 2 hollow rhombus

        System.out.println("enter the number you hollow");
        int n2 = sc.nextInt();

        for (int i0 = 1; i0 <= n2; i0++) {
            // spaces
            for (int j0 = 1; j0 <= n2-i0; j0++) {
                System.out.print(" ");
            }
            //star
            for (int j0 = 1; j0 <= n2 ; j0++) {
                if (i0 == 1 || j0 == 1 || i0 == n2 || j0 == n2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // butterfly hollow pattern

        System.out.println("enter the numbers of hollows pattern are you prints in compiler ");
        int s11 =sc.nextInt();
        //upper
        for (int a9=1;a9<=s11;a9++) {
            //left
            for (int b9 = 1; b9 <= a9; b9++) {
                if (b9 == 1 || b9 == a9 || a9 == s11) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // space
            int space1 = 2 * (s11 - a9);
            for (int b9 = 1; b9 <= space1; b9++) {
                System.out.print(" ");
            }
            //right
            for (int b9 = 1; b9 <= a9; b9++) {
                if (b9 == 1 || b9 == a9 || a9 == s11) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // lower
        for (int a9=s11 - 1;a9>=1;a9--) {
            //left
            for (int b9 = 1; b9 <= a9; b9++) {
                if (b9 == 1 || b9 == a9  ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // space
            int space1 = 2 * (s11 - a9);
            for (int b9 = 1; b9 <= space1; b9++) {
                System.out.print(" ");
            }
            //right
            for (int b9 = 1; b9 <= a9; b9++) {
                if (b9 == 1 || b9 == a9 || a9 == s11) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


