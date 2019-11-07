package com.edhesive.apcs.lessons.unit3.lesson30half;
/*
 * Lesson 30 1/2 Coding Activity 
 * 
 * For this program you will input an int to represent the octal number 
 * and translate to the base ten number. The octal number must be 8 digits or less.
 * 
 * Your program should also check that all the digits are 0 - 7, then translate the 
 * number to base ten. 
 * 
 * Sample Run 1: 
 * Enter a number in base 8: 
 * 1287 
 * ERROR: Incorrect Octal Format 
 * 
 * Sample Run 2: 
 * Enter a number in base 8: 
 * 123 
 * 83 
 * 
 * Sample Run 3: 
 * Enter a number in base 8: 
 * 1111111111 
 * ERROR: Incorrect Octal Format
 *   
 */ 

import java.util.Scanner;
import java.lang.Math; 

class Lesson_1011_Activity {
    public static void main(String[] args) {
        /*
         * Write your code here
         * Copy and paste your entire program to Code Runner
         * to complete the activity, from the first import statement
         * to the last bracket.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number in base 8:");
        int value = scanner.nextInt();
        int result = 0;
        boolean flag = true;
        for(int i = 7; i >= 0; i--) {
            int place = (int) Math.pow(10, i);
            int placeValue = value / place;
            if(placeValue > 7) {
                flag = false;
            }
            result += placeValue * Math.pow(8, i);
            value %= place;
        }
        if(flag) {
            System.out.println(result);
        } else {
            System.out.println("ERROR: Incorrect Octal Format");
        }
    }
}