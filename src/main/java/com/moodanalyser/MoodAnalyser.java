package com.moodanalyser;

public class MoodAnalyser {
        private final String message;
         MoodAnalyser(String message) {
            this.message = message;

        }
        public String findMood (){

            if (message.toLowerCase().contains("sad")) return "SAD";
            else
                return "HAPPY";

        }
    }