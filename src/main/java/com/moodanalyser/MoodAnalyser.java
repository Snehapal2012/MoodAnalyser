package com.moodanalyser;

public class MoodAnalyser {
    private final String message;

    MoodAnalyser(String message) {
        this.message = message;

    }

    public String findMood() {
        try {
            if (message.toLowerCase().contains("sad")) return "SAD";
            else
                return "HAPPY";

        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
        return null;
    }
}
