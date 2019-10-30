package com.edhesive.apcs.assignments.assn5;

import java.util.Scanner;

/**
 * Assignment 5: Array Statistics
 *
 * This program allows the user to construct an array of decimal
 * numbers with a length specified by the user. It then calculates
 * some information about the array and prints it.
 *
 * The program first asks the user how long the array should be. If
 * the length entered isn't positive, the program will exit. It then
 * asks the user what to set each value to in the array. Once the
 * array is complete, the program prints the mean of values, the
 * range of values, and it prints the order in which the elements
 * are arranged in the array (increasing, decreasing, or unsorted).
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How long do you want the array?");
        int size = scanner.nextInt();
        // make sure the length is valid
        if(size > 0) {
            double[] nums = new double[size];
            // loop through the array and prompt the user for values
            for (int i = 0; i < size; i++) {
                System.out.println("Enter a number");
                double value = scanner.nextDouble();
                nums[i] = value;
            }

            // print the array
            System.out.print("Your array is {");
            for (int i = 0; i < size; i++) {
                System.out.print(nums[i]);
                if (i != nums.length - 1) System.out.print(", ");
            }
            System.out.println("}");

            // values needed to calculate mean and range
            double largestValue = -Double.MAX_VALUE;
            double smallestValue = Double.MAX_VALUE;
            double sum = 0;

            boolean increasing = true;
            boolean decreasing = true;

            for(int i = 0; i < size; i++) {
                // find largest and smallest values
                if(nums[i] > largestValue) {
                    largestValue = nums[i];
                }
                if(nums[i] < smallestValue) {
                    smallestValue = nums[i];
                }
                sum += nums[i];
                // check the order
                if(i < size - 1) {
                    if (nums[i] > nums[i + 1]) {
                        increasing = false;
                    } else if (nums[i] < nums[i + 1]) {
                        decreasing = false;
                    }
                }
            }
            double average = sum / size;
            // range is an absolute value because it can't be negative
            double range = Math.abs(largestValue - smallestValue);
            System.out.println("The average is " + average);
            System.out.println("The range is " + range);

            if(increasing) {
                System.out.println("The array is sorted in increasing order");
            } else if(decreasing) {
                System.out.println("The array is sorted in decreasing order");
            } else {
                System.out.println("The array is unsorted");
            }
        } else {
            System.out.println("Not a valid length!");
        }
    }

}
