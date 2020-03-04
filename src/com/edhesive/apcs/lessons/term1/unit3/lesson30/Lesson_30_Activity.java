package com.edhesive.apcs.lessons.term1.unit3.lesson30;
/*
 * Lesson 30 Coding Activity 
 * Due to a problem with a scanner an array of words was created 
 * with spaces in incorrect places. Write the code to process the 
 * list of words and trim any spaces out of the words.
 *
 * So if the list contains:
 *      {"every", " near ing ", " checking", "food ", "stand", "value "}
 *
 * It should be changed to hold:        
 *      {"every", "nearing", "checking", "food", "stand", "value"}
 *         
 * Note that this activity does not require you to print anything. 
 * Your code should end with the array list still declared and
 * containing the resulting words.
 * 
 */


class Lesson_30_Activity {
     
   /*
    * Your code should end with the following array modified as the 
    * instructions above specify. You may modify the elements in 
    * this list but make sure you do not add or remove anything from it. 
   */
    public static String [] list = {"every", "near ing", " checking", "food ", "stand", "value "};
  
    public static void main(String[] args) {
         /*
          * Write your code here
          * Copy and paste your entire program to Code Runner
          * to complete the activity, from the first import statement
          * to the last bracket.
          */
         for(int i = 0; i < list.length; i++) {
             String fixedWord = "";
             for(int j = 0; j < list[i].length(); j++) {
                 if(list[i].charAt(j) != ' ') fixedWord += list[i].charAt(j);
             }
             list[i] = fixedWord;
         }
    }
}