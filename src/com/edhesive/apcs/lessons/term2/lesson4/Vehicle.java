package com.edhesive.apcs.lessons.term2.lesson4;

public class Vehicle {

    private int location;

    public Vehicle() {
        location = 0;
    }

    public Vehicle(int location) {
        if(location <= 20 && location >= -20) {
            this.location = location;
        } else {
            this.location = 0;
        }
    }

    public void forward() {
        location++;
        if(location > 20) {
            location = 20;
        }
    }

    public void backward() {
        location--;
        if(location < -20) {
            location = -20;
        }
    }

    public int getLocation() {
        return location;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < location + 20; i++) {
            result += " ";
        }
        result += "@";
        return result;
    }
}
