package com.edhesive.apcs.lessons.unit3.lesson25;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeSieve {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a maximum value:");
        int nNums = scanner.nextInt();
        boolean[] primes = new boolean[nNums];

        Arrays.fill(primes, true);

        for(int d = 2; d < primes.length; d++) {
            for(int i = d + 1; i < primes.length; i++) {
                if(i % d == 0) {
                    primes[i] = false;
                }
            }
        }

        System.out.println();
        for(int i = 2; i < primes.length; i++) {
            if(primes[i]) System.out.print(i + " ");
        }
    }

}
