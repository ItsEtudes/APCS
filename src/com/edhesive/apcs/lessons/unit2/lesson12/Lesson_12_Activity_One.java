package com.edhesive.apcs.lessons.unit2.lesson12;
/*
 * Lesson 12 Coding Activity 1 
 * Write a program to input three integers. 
 * Test if the average is greater than or equal to 89.5. 
 * If so, print out the phrase "ABOVE AVERAGE" (without the quotes).
 */


import java.util.Scanner;

class Lesson_12_Activity_One {
    public static void main(String[] args) {
         /*
         * Write your code here
         * Copy and paste your entire program to Code Runner
         * to complete the activity, from the first import statement
         * to the last bracket.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three integers:");
        // 3 ints to be averaged
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        // calculate average as double
        double average = ((double)(a + b + c) / 3);

        if(average >= 89.5) {
            System.out.println("ABOVE AVERAGE");
        }
    }
}