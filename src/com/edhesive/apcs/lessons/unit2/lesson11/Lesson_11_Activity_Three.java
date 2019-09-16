package com.edhesive.apcs.lessons.unit2.lesson11;
/*
 * Lesson 11 Coding Activity 3
 * Get two integers from the keyboard and test if they are equal.
 * If they are, print "YES" (without the quotes).
*/

import java.util.Scanner;
import java.lang.Math;


class Lesson_11_Activity_Three {   
    public static void main(String[] args) {
        /* Write your code here
         * Copy and paste your entire program to Code Runner to complete the activity,
         * from the first import statement to the last bracket.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two integers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a == b) {
            System.out.println("YES");
        }
    }
}