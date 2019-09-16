package com.edhesive.apcs.assignments.assn1;

import java.util.Scanner;

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

        double webAverage = (double) (web1 + web2 + web3) / 3;
        double focusAverage = (focus1 + focus2) / 2;

        System.out.println("Average website rating: " + webAverage);
        System.out.println("Average focus group rating: " + focusAverage);
        System.out.println("Average movie critic rating: " + criticAverage);

        double overallAverage = (webAverage * 0.2) + (focusAverage * 0.3) + (criticAverage * 0.5);
        System.out.println("Overall movie rating: " + overallAverage);
    }

}
