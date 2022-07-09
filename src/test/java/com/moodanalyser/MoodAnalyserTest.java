package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad(){
        MoodAnalyser mood=new MoodAnalyser();
        String result= mood.findMood("I am in sad mood");
        Assertions.assertEquals("SAD",result);
    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy(){
        MoodAnalyser mood=new MoodAnalyser();
        String result= mood.findMood("I am in happy mood");
        Assertions.assertEquals("HAPPY",result);
    }
}
