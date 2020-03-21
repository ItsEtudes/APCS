package com.edhesive.apcs.lessons.term2.lesson15;

public class Lesson_15_Activity {

    public static void sortAndPrint(String[] list) {
        for(int i = 0; i < list.length - 1; i++) {
            int smallest = i;
            for(int j = smallest; j < list.length; j++) {
                if(list[smallest].compareTo(list[j]) > 0) {
                    smallest = j;
                }
            }
            String temp = list[i];
            list[i] = list[smallest];
            list[smallest] = temp;
        }
        for(String str : list) {
            System.out.print(str + " ");
        }
    }

}
