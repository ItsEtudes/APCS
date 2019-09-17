package com.edhesive.apcs.assignments.assn2;

import java.util.Scanner;

/**
 * This program calculates the year, month, day, hour, minute, and second a file was created
 * given the time since the Unix Epoch, which was January 1, 1970.
 *
 * The calculations assume that each month is 30 days
 */
public class Main {

    public static void main(String[] args) {
        // These values are constants used to make the calculations
        int secondsInMinute = 60;
        int secondsInHour = secondsInMinute * 60;
        int secondsInDay = secondsInHour * 24;
        int secondsInMonth = secondsInDay * 30;
        int secondsInYear = secondsInMonth * 12;

        Scanner scan = new Scanner(System.in);
        System.out.println("Seconds Since Unix Epoch:");
        int nSeconds = scan.nextInt();
        // Buffer value which changes as needed to calculate year, month, day, hour, minute, and second
        int secondsLeft;
        int year = 1970 + (nSeconds / secondsInYear);
        secondsLeft = nSeconds % secondsInYear;
        int month = secondsLeft / secondsInMonth;
        secondsLeft = nSeconds % secondsInMonth;
        int day = secondsLeft / secondsInDay;
        secondsLeft = nSeconds % secondsInDay;
        int hour = secondsLeft / secondsInHour;
        secondsLeft = nSeconds % secondsInHour;
        int minute = secondsLeft / secondsInMinute;
        secondsLeft = nSeconds % secondsInMinute;
        int seconds = secondsLeft;

        System.out.println("\nYear: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Min: " + minute);
        System.out.println("Sec: " + seconds);
    }

}
