package com.moodanalyser;

public class MoodAnalyser {
    public String findMood(String message){
        if(message.contains("sad")) return "SAD";
        else if(message.contains("happy")) return "HAPPY";
        else
    return "";
}
}
