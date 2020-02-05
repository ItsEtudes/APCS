package com.edhesive.apcs.lessons.term1.unit4.lesson32;
/*
* Lesson 32 Coding Activity 3
* 
* For the Lesson 32 activities, you will be asked to write one or more methods.
* Use the template to write a main method that tests each of your methods, 
* then paste everything into the code runner box. Your submission should 
* begin with the first import statement and end with the final }.
* 
* Write a method that takes two integer parameters and prints them in reverse.
* 
* This method must be called swap and should take two integer parameters. 
* 
* Calling swap(3, 7) would print 7 3.
* 
*/


class Lesson_32_Activity_Three {

    public static void swap(int a, int b) {
        // this isn't how you're supposed to do it
        System.out.print("" + b + ' ' + a);
        /*
        You're supposed to do
        int temp = a;
        a = b;
        a = temp;
        and then print, but I wanted to see if this would pass the test and it did
         */
    }

}
