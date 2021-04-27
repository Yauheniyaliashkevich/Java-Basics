package com.class29;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("TestNG");


        ArrayList<String> subjects2 = new ArrayList<>();
        subjects2.add("SDLC");
        subjects2.add("Manual Testing");
        subjects2.add("Java");

        System.out.println(subjects2.containsAll(subjects));
    }
}
