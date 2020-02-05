package com.edhesive.apcs.labs.lab1;

import java.util.ArrayList;

public class Magpie {

    private ArrayList<String> greetings;
    private ArrayList<String> startUpMessages;
    private ArrayList<String> questionAnswers;

    public Magpie() {
        greetings = new ArrayList<>();
        greetings.add("Hi there! Nice to meet you! SIKE");
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

        questionAnswers = new ArrayList<>();
        questionAnswers.add("A question? Now how do you expect me to answer that?");
        questionAnswers.add("I can help with that one! \n" +
                "Step One: Open web browser\n" +
                "Step Two: Go to google.com\n" +
                "Step Three: Type your question there and leave me alone");
        questionAnswers.add("That's a very serious question. I'd love to help you, but " +
                "I just really don't care");

        int randomIndex = ChatBotUtils.getRandomIndex(0, 4);
        System.out.println(startUpMessages.get(randomIndex));
    }

    public String getResponse(String input) {
        input = input.toLowerCase();

        // check for greeting
        if(input.contains("hello") || input.contains("hi")) {
            return getRandomGreeting();
        } else if(input.contains("?")) {
            return getRandomQuestionAnswer();
        }
        return ChatBotUtils.convertToMockingTone(input);
    }

    private String getRandomGreeting() {
        int index = ChatBotUtils.getRandomIndex(0, 4);
        return greetings.get(index);
    }

    private String getRandomQuestionAnswer() {
        int index = ChatBotUtils.getRandomIndex(0, 2);
        return questionAnswers.get(index);
    }

}
