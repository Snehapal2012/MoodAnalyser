package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionTest {
    @Test
    public void addTwoNumbers(){
AdditionOne obj=new AdditionOne();
int result=obj.addNumbers(20,30);
       // System.out.println(result);
        Assertions.assertEquals(50,result);
    }
}
