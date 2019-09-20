package com.edhesive.apcs.lessons.unit2.lesson13;
/*
 * Lesson 13 Coding Activity 4
 * Input an integer grade from the keyboard and translate it to a letter grade. 
 * For example, if a user enters 4, print "A", and if they enter 0 print "F." 
 * You can assume that an integer between 0 and 4 will be input.
 */


import java.util.Scanner;

class Lesson_13_Activity_Four {
    public static void main(String[] args) {
         /*
          * Write your code here
          * Copy and paste your entire program to Code Runner
          * to complete the activity, from the first import statement
          * to the last bracket.
          */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a grade number:");
        int gradeVal = scanner.nextInt();
        if(gradeVal == 0) {
            System.out.println('F');
        } else if(gradeVal == 1) {
            System.out.println('D');
        } else if(gradeVal == 2) {
            System.out.println('C');
        } else if(gradeVal == 3) {
            System.out.println('B');
        } else {
            System.out.println('A');
        }
    }
}