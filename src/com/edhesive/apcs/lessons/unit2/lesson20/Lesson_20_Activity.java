package com.edhesive.apcs.lessons.unit2.lesson20;
/*
 * Lesson 20 Coding Activity 
 * 
 * Computer science jobs are in demand. Right now we have a shortage 
 * of people that can do computer programming, and one of the fastest
 * growing areas of new jobs in the sector are so-called hybrid jobs. 
 * This means you specialize in an area like biology, 
 * and then use computer programming to do your job. 
 * 
 * These hybrid jobs exist in the arts, sciences,
 * economics, healthcare, and entertainment fields.
 * 
 * One of these jobs is computational biology. Computational Biology, 
 * sometimes referred to as bioinformatics, is the science of 
 * using biological data to develop algorithms and relations
 * among various biological systems.
 * 
 * In this lab we are going to investigate the data from a
 * grey seal named Gracie. We'll input the longitude and
 * latitude data from a tracking device. We want to investigate 
 * the farthest north, south, east and west Gracie has been.
 * 
 * We will use the latitude to measure this.
 * Gracie's data:
 * http://www2.whalenet.org/whalenet-stuff/Stop39382-09/data39382-09.html
 * 
 * Write a program to enter Gracie's longitude and Latitude data. 
 * Each time through the loop it should ask if you want to continue. 
 * Enter 1 to repeat, 0 to stop.
 * 
 * Any value for latitude not between -90 and 90 inclusive should be ignored.
 * 
 * Any value for longitude not between -180 and 180 inclusive should be ignored.
 *
 *
 *          Sample Run:
 *
 *              Please enter the latitude:
 *              41.678
 *              Please enter the longitude:
 *              69.938
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.755
 *              Please enter the longitude:
 *              69.862
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              41.829
 *              Please enter the longitude:
 *              69.947
 *              Would you like to enter another location?
 *              1
 *              Please enter the latitude:
 *              300
 *              Please enter the longitude:
 *              69.947
 *              Incorrect Latitude or Longitude
 *              Please enter the latitude:
 *              41.827
 *              Please enter the longitude:
 *              69.904
 *              Would you like to enter another location?
 *              0
 *              Farthest North: 41.829
 *              Farthest South: 41.678
 *              Farthest East: 69.947  
 *              Farthest West: 69.862
 */

import java.util.Scanner;
import java.lang.Math;

class Lesson_20_Activity {
    public static void main(String[] args) {
        /*
         * Write your code here Copy and paste your entire program to Code Runner to
         * complete the activity, from the first import statement to the last bracket.
         */
        double farthestNorth = Double.MIN_VALUE;
        double farthestSouth = Double.MAX_VALUE;
        double farthestEast = Double.MIN_VALUE;
        double farthestWest = Double.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        int flag = 1;
        while(flag == 1) {
            System.out.println("Please enter the latitude:");
            double latitude = scanner.nextDouble();
            System.out.println("Please enter the longitude:");
            double longitude = scanner.nextDouble();
            if((latitude >= -90.0 && latitude <= 90.0) && (longitude >= -180.0 && longitude <= 180.0)) {
                farthestNorth = Math.max(farthestNorth, latitude);
                farthestSouth = Math.min(farthestSouth, latitude);
                farthestEast = Math.max(farthestEast, longitude);
                farthestWest = Math.min(farthestWest, longitude);
            } else {
                System.out.println("Incorrect Latitude or Longitude");
                continue;
            }
            System.out.println("Would you like to enter another location?");
            int choice = scanner.nextInt();
            if(choice == 0) {
                flag = 0;
            }
        }
        System.out.println("Farthest North: " + farthestNorth);
        System.out.println("Farthest South: " + farthestSouth);
        System.out.println("Farthest East: " + farthestEast);
        System.out.println("Farthest West: " + farthestWest);
    }
}