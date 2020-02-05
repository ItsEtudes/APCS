package com.edhesive.apcs.lessons.term1.unit3.lesson26;

import java.util.Scanner;

public class Insertion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100) + 1;
        }
        System.out.println("Pre-sort values:");
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Enter index of where to insert value:");
        int insert = scanner.nextInt();
        System.out.println("Enter value to insert:");
        int value = scanner.nextInt();

        for(int i = arr.length - 1; i > insert; i--) {
            arr[i] = arr[i - 1];
        }
        arr[insert] = value;
        System.out.println("Post-sort values:");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

}
