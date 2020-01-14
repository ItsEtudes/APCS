package com.edhesive.apcs.lessons.term2.lesson1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter words, enter STOP to stop the loop.");
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String word;
        while(!((word = scanner.nextLine()).equals("STOP"))) {
            words.add(word);
        }

        System.out.println(words.size());
        System.out.println(words);

        if(words.size() > 2) {
            words.remove(0);
            words.remove(words.size() - 1);
        }

        System.out.println(words);
    }

}
