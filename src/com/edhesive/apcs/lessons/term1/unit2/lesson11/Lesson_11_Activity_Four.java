package com.edhesive.apcs.lessons.term1.unit2.lesson11;
/*
 * Lesson 11 Coding Activity 4
 * Test if an integer input from the keyboard is odd or even.
 * 
 *     Sample Run 1:
 *        Enter a Number:
 *        78
 *        Even
 * 
 *     Sample Run 2:
 *        Enter a Number:
 *        17
 *        Odd
 * 
 */

import java.util.Scanner;


class Lesson_11_Activity_Four {
    public static void main(String[] args) {
       /* Write your code here
        * Copy and paste your entire program to Code Runner to complete the activity,
        * from the first import statement to the last bracket.
        */
       Scanner  scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int value = scan.nextInt();
        if(value % 2 == 0) {
            System.out.println("Even");
        }
        if(value % 2 == 1) {
            System.out.println("Odd");
        }
    }
}