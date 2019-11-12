package com.edhesive.apcs.assignments.assn6;

import java.util.Scanner;

/**
 * Assignment 6: Merge Arrays
 *
 * This program generates two arrays with a length specified by the
 * user, and then it merges the arrays into one single array with
 * no duplicates
 *
 * The program begins by asking the user for a length of an array.
 * It stop asking once the user enters a valid length of 10 or
 * greater. The program then fills two arrays of this length
 * with randomly generated numbers between 1 and 100 inclusive.
 * These arrays are then printed. Finally, the program megres these
 * arrays into a single array, removing duplicate values along the
 * way. This merged array is then printed.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        while(length < 10) {
            System.out.println("Enter an array length (must be 10 or greater):");
            length = scanner.nextInt();
        }
        int[] firstArr = new int[length];
        int[] secondArr = new int[length];
        // fill arrays with random numbers
        for(int i = 0; i < length; i++) {
            firstArr[i] = (int) (Math.random() * 100) + 1;
            secondArr[i] = (int) (Math.random() * 100) + 1;
        }

        // print arrays
        System.out.print("First Array: ");
        for(int i = 0; i < firstArr.length; i++) {
            System.out.print(firstArr[i] + " ");
        }
        System.out.print("\n\nSecond Array: ");
        for(int i = 0; i < secondArr.length; i++) {
            System.out.print(secondArr[i] + " ");
        }

        int[] resultArray = new int[length * 2];

        int currentArrayIndex = 0; // this value represents the location of the next value to be put into the array
        for(int i = 0; i < length; i++) {
            // flag tests for duplicate values in the array
            boolean flag = false;
            for(int j = 0; j <= i * 2; j++) {
                if(firstArr[i] == resultArray[j]) {
                    flag = true;
                    break;
                }
            }
            // adds value as long as no duplicates were found
            if(!flag) {
                resultArray[currentArrayIndex] = firstArr[i];
                currentArrayIndex++;
            }
            flag = false;
            for(int j = 0; j <= i * 2; j++) {
                if(secondArr[i] == resultArray[j]) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                resultArray[currentArrayIndex] = secondArr[i];
                currentArrayIndex++;
            }
        }

        System.out.print("\n\nMerged Array: ");
        for(int i = 0; i < resultArray.length; i++) {
            if(resultArray[i] != 0) {
                System.out.print(resultArray[i] + " ");
            }
        }

    }

}
