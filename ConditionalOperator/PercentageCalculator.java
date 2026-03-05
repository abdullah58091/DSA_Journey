  // this percentage calculator
package com.company.ConditionalOperator;

import java.util.Scanner;

public class PercentageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== CBSE Board Exam Percentage Calculator ===");

        // Array to store marks of 5 subjects
        int[] marks = new int[5];
        String[] subjects = {"Physics", "Chemistry", "Mathematics", "English", "Computer Science"};

        // Input marks for each subject
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for " + subjects[i] + " (out of 100): ");
            marks[i] = scanner.nextInt();

            // Validate marks are between 0 and 100
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                System.out.print("Enter marks for " + subjects[i] + " (out of 100): ");
                marks[i] = scanner.nextInt();
            }
        }

        // Calculate total marks
        int totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            totalMarks += marks[i];
        }

        // Calculate percentage
        double percentage = (totalMarks / 500.0) * 100;

        // Display results
        System.out.println("\n=== RESULT ===");
        System.out.println("Subject-wise Marks:");

        for (int i = 0; i < 5; i++) {
            System.out.printf("%-20s: %d/100\n", subjects[i], marks[i]);
        }

        System.out.println("\nTotal Marks: " + totalMarks + "/500");
        System.out.printf("Percentage: %.2f%%\n", percentage);

        // Additional grading (optional)
        System.out.println("\n=== GRADE ===");
        if (percentage >= 90) {
            System.out.println("Grade: A1 (Outstanding)");
        } else if (percentage >= 80) {
            System.out.println("Grade: A2 (Excellent)");
        } else if (percentage >= 70) {
            System.out.println("Grade: B1 (Very Good)");
        } else if (percentage >= 60) {
            System.out.println("Grade: B2 (Good)");
        } else if (percentage >= 50) {
            System.out.println("Grade: C1 (Fair)");
        } else if (percentage >= 40) {
            System.out.println("Grade: C2 (Satisfactory)");
        } else if (percentage >= 33) {
            System.out.println("Grade: D (Marginal)");
        } else {
            System.out.println("Grade: F (Fail)");
        }



                   //  this my own calculator

        System.out.println("this is calculator  ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number is a ");
        int a = sc.nextInt();
        System.out.println("Enter the number is b");
        int b = sc.nextInt();
        System.out.println("Enter the operator");
        int calculator1 = sc.nextInt();
        switch(calculator1){
            case 1:
                System.out.println(" the sum is " + (a+b));
                break;
            case 2:
                System.out.println("the sub is : "  + (a-b) );
                break;
            case 3:
                System.out.println("the mul is : " + (a*b));
                break;
            case 4:
                System.out.println("the modelo is : " + (a%b));
                break;
            case 5 :
                System.out.println("the division is " + (a/b));
                break;
            default:
                System.out.println("this is invalid number  in calculator" + (a/b));
        }
    }
}
