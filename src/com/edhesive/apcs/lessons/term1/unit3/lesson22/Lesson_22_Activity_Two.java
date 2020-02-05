package com.edhesive.apcs.lessons.term1.unit3.lesson22;
/*
 * Lesson 22 Coding Activity 2
 * Write the code to take a String and print it diagonally.

  Sample run:

  Enter a string:
  bought
  b
      o
          u
              g
                  h
                      t
  Use a tab character for every four spaces in the sample.

  Hint: You may need more than one loop.
  
*/ 

import java.util.Scanner;

class Lesson_22_Activity_Two {
    public static void main(String[] args) {
        /*
         * Write your code here
         * Copy and paste your entire program to Code Runner
         * to complete the activity, from the first import statement
         * to the last bracket.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word = scanner.nextLine();
        int index = 0;
        while(index < word.length()) {
            int nTabs = 0;
            while(nTabs < index) {
                System.out.print('\t');
                nTabs++;
            }
            System.out.println(word.charAt(index));
            index++;
        }
    }
}