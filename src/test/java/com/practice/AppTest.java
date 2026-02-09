package com.practice;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    App obj=new App();
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue("Hello maven project".equals(obj.gethello()));
    }

    @Test
    public void checkReturnValue(){
        int checkReturn = obj.testMethod();

        assertTrue(checkReturn==10);

    }

}
