/**
|-------------------------------------------------------------------------------
| StepTrackerJUnitTest.java
|-------------------------------------------------------------------------------
|
| Author:  Alwin Tareen
| Created: Dec 16, 2019
|
| This is the JUnit test bench for StepTracker.java
| Do not alter the contents of this file.
|
*/

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.*;

public class StepTrackerJUnitTest
{
    private StepTracker tr;
    
    @Before
    public void runBeforeEachTest()
    {
        tr = new StepTracker(10000);
    }
    
    @After
    public void runAfterEachTest()
    {
        tr = null;
    }
    
    @Test
    public void testOne()
    {
        int expected = 0;
        int actual = tr.activeDays();
        assertEquals(expected, actual);
    }
        
    @Test
    public void testTwo()
    {
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        int expected = 0;
        int actual = tr.activeDays();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThree()
    {
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        double expected = 7000.0;
        double actual = tr.averageSteps();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void testFour()
    {
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        tr.addDailySteps(13000);
        int expected = 1;
        int actual = tr.activeDays();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFive()
    {
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        tr.addDailySteps(13000);
        double expected = 9000.0;
        double actual = tr.averageSteps();
        assertEquals(expected, actual, 0.1);
    }
    
    @Test
    public void testSix()
    {
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        tr.addDailySteps(13000);
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        int expected = 2;
        int actual = tr.activeDays();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSeven()
    {
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        tr.addDailySteps(13000);
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        double expected = 10222.2;
        double actual = tr.averageSteps();
        assertEquals(expected, actual, 0.1);
    }
}
