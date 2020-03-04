package com.edhesive.apcs.lessons.term1.unit3.lesson26;

import java.util.Scanner;

public class Deletion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[20];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 99) + 1;
        }
        System.out.println("Pre-Delete Values:");
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nEnter index to delete value from:");
        int index = scanner.nextInt();
        for(int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println();
        System.out.println("Post-Delete Values:");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

}
