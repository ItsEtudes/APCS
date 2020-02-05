package com.edhesive.apcs.labs.lab1;

public class ChatBotUtils {

    private ChatBotUtils() {
    }

    public static int getRandomIndex(int min, int max) {
        return (int) (Math.random() * (max + 1)) + min;
    }

    public static String convertToMockingTone(String message) {
        message = message.toLowerCase();
        String result = "";
        for(int i = 0; i < message.length(); i++) {
            String ch = message.substring(i, i + 1);
            if(((int) (Math.random() * 2)) == 1) {
                ch = ch.toUpperCase();
            }
            result += ch;
        }
        return result;
    }

}
