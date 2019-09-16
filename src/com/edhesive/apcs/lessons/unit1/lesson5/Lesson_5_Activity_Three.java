/*
 * Lesson 5 Coding Activity Question 3
 * 
 * Input the radius of a circle and print the circumference and area. 
 * The answer should be a decimal value.
 *
 * Remember the formula for circumference is 2 * pi * r and the formula 
 * for area is pi * r * r. You can use 3.14 for the value of pi in this activity.
 *
 * Sample Run:
 
Enter a radius:
4
Circumference: 25.12
Area: 50.24

*/

package com.edhesive.apcs.lessons.unit1.lesson5;

import java.util.Scanner;

class Lesson_5_Activity_Three {

    private static final double PI = 3.14;

    public static void main(String[] args) {
      
        /* Write your code here 
         * Copy and paste your entire code to Code Runner to complete the activity, 
         * from the first import statement to the last bracket. 
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double r = scan.nextDouble();
        double circumference = 2 * PI * r;
        double area = PI * r * r;
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);

    }
}