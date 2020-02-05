package com.edhesive.apcs.labs.lab1;

import java.util.ArrayList;

public class Magpie {

    private ArrayList<String> greetings;
    private ArrayList<String> startUpMessages;

    public Magpie() {
        greetings = new ArrayList<>();
        greetings.add("Hi there! Nice to meet you!");
        greetings.add("Oh, sorry. I didn't see you there.");
        greetings.add("Hey!");
        greetings.add("What are you so happy about?");
        greetings.add("Hello... Hello? Can you hear me now?");

        startUpMessages = new ArrayList<>();
        startUpMessages.add("Welcome to Magpie! Your personal chatbot assistant. " +
                "I also happen to be part of a Computer Science Lab assignment");
        startUpMessages.add("Magpie is online!");
        startUpMessages.add("Woah, I think I just became self-aware. This is weird");
        startUpMessages.add("Ouch! Just got shocked by something... I feel so alive all of a sudden");
        startUpMessages.add("Who are you, where am I? Last I remember I was eating punched cards");

        int randomIndex = ChatBotUtils.getRandomIndex(0, 4);
        System.out.println(startUpMessages.get(randomIndex));
    }

    public String getResponse(String input) {
        input = input.toLowerCase();

        // check for greeting
        if(input.contains("hello") || input.contains("hi")) {
            return getRandomGreeting();
        }
        return "";
    }

    private String getRandomGreeting() {
        int index = ChatBotUtils.getRandomIndex(0, 4);
        return greetings.get(index);
    }

}
