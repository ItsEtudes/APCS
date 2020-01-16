package com.edhesive.apcs.lessons.term2.lesson2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.println("Please enter words, enter STOP to stop the loop.");

        String word;
        while(!((word = scanner.nextLine()).equals("STOP"))) {
            words.add(word);
        }

        for(String str : words) {
            if(str.contains("a")) {
                System.out.println(str);
            }
        }
    }

}
