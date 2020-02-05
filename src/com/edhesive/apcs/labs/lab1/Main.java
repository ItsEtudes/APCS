package com.edhesive.apcs.labs.lab1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Magpie magpie = new Magpie();
        Scanner scanner = new Scanner(System.in);



        String input;
        while(!((input = scanner.nextLine()).toLowerCase().equals("bye"))) {
            System.out.println(magpie.getResponse(input));
        }
    }

}
