package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad(){
        MoodAnalyser mood=new MoodAnalyser("I am in sad mood");
        String result= mood.findMood();
        Assertions.assertEquals("SAD",result);
    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy(){
        MoodAnalyser mood=new MoodAnalyser("I am in happy mood");
        String result= mood.findMood();
        Assertions.assertEquals("HAPPY",result);
    }
    @Test
    public void givenMessage_WhenNull_ShouldReturnHappy(){
        MoodAnalyser mood=new MoodAnalyser("null");
        String result= mood.findMood();
        Assertions.assertEquals("HAPPY",result);
    }

}
