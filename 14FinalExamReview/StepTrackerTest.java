/**
|-------------------------------------------------------------------------------
| StepTrackerTest.java
|-------------------------------------------------------------------------------
|
| Author:  Alwin Tareen
| Created: Dec 16, 2019
|
| This is the test bench for StepTracker.java
| Do not alter the contents of this file.
|
*/

public class StepTrackerTest
{
    public static void main(String[] args)
    {
        StepTracker tr = new StepTracker(10000);
        
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        
        tr.addDailySteps(13000);
        
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
        
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        
        System.out.println(tr.activeDays());
        System.out.println(tr.averageSteps());
    }
}
