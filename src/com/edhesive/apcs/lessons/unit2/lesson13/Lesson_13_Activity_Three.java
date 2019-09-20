package com.edhesive.apcs.lessons.unit2.lesson13;
/*
 * Lesson 13 Coding Activity 3 
 * Input two integers and print the largest. If they are equal print "EQUAL". 
 * You should be able to do this with only one if statement but you may use multiple else statements.
 */


import java.util.Scanner;

class Lesson_13_Activity_Three {
    public static void main(String[] args) {
         /*
          * Write your code here
          * Copy and paste your entire program to Code Runner
          * to complete the activity, from the first import statement
          * to the last bracket.
          */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers");
        int valueA = scanner.nextInt();
        int valueB = scanner.nextInt();
        if(valueA > valueB) {
            System.out.println(valueA);
        } else if(valueA < valueB) {
            System.out.println(valueB);
        } else {
            System.out.println("EQUAL");
        }
    }
}