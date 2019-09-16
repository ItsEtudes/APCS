/*
 * Lesson 3 Coding Activity Question 2
 * 
 * Write a program that asks the user for three names, then prints the names in reverse order.
 * 
 * Sample Run:

Please enter three names:
Zoey 
Zeb 
Zena 

Zena Zeb Zoey

*/
package com.edhesive.apcs.lessons.unit1.lesson3;

import java.util.Scanner;

class Lesson_3_Activity_Two {
    public static void main(String[] args) {
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */
        Scanner scan = new Scanner(System.in);
        String name1;
        String name2;
        String name3;
        System.out.println("Please enter three names:");
        name1 = scan.nextLine();
        name2 = scan.nextLine();
        name3 = scan.nextLine();
        System.out.println(name3 + ' ' + name2 + ' ' + name1);

    }
}