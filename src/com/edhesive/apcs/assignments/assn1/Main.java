package com.edhesive.apcs.assignments.assn1;

import java.util.Scanner;

/**
 * This program takes in various movie ratings from different groups. It takes the following:
 *  - 3 ratings from a review website
 *  - 2 ratings from a focus group
 *  - 1 average rating from movie critics
 *
 *  It takes these ratings and creates an overall weighted average score for the movie:
 *  - The website rating counts for 20% of the score
 *  - The focus group rating counts for 30% of the score
 *  - The movie critic rating counts for 50% of the score
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter ratings from the movie review website.");
        int web1 = scan.nextInt();
        int web2 = scan.nextInt();
        int web3 = scan.nextInt();

        System.out.println("Please enter ratings from the focus group.");
        double focus1 = scan.nextDouble();
        double focus2 = scan.nextDouble();

        System.out.println("Please enter the average movie critic rating.");
        double criticAverage = scan.nextDouble();

        // Get the averages from the website and focus group ratings
        double webAverage = (double) (web1 + web2 + web3) / 3;
        double focusAverage = (focus1 + focus2) / 2;

        System.out.println("Average website rating: " + webAverage);
        System.out.println("Average focus group rating: " + focusAverage);
        System.out.println("Average movie critic rating: " + criticAverage);

        // Calculate the weighted average
        double overallAverage = (webAverage * 0.2) + (focusAverage * 0.3) + (criticAverage * 0.5);
        System.out.println("Overall movie rating: " + overallAverage);
    }

}
