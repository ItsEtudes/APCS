package com.edhesive.apcs.labs.lab1;

public class ChatBotUtils {

    private ChatBotUtils() {
    }

    public static int getRandomIndex(int min, int max) {
        return (int) (Math.random() * (max + 1)) + min;
    }

}
