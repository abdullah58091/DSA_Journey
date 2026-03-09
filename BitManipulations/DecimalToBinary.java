package com.company.BitManipulations;

public class DecimalToBinary {
    public static void  decimalToBinary(int n) {
            int binary[] = new int[32];
            int i = 0;

            while (n > 0) {
                binary[i] = n % 2;
                n = n / 2;
                i++;
            }

            for (int j = i - 1; j >= 0; j--) {
                System.out.print(binary[j]);
            }
        }

        public static int DecimalToBinary (int binary) {

            int decimal = 0;
            int power = 0;

            while (binary > 0) {
                int lastDigit = binary % 10;
                decimal += lastDigit * Math.pow(2, power);

                power++;
                binary = binary / 10;
            }

            return decimal;
        }

        public static void main(String[] args) {

            decimalToBinary(10);
            System.out.println();

            System.out.println(DecimalToBinary(1010)); // --->> the time complexity O(log n)
        }
    }

