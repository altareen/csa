/**
|-------------------------------------------------------------------------------
| StepTracker.java
|-------------------------------------------------------------------------------
|
| Author:  Alwin Tareen
| Created: Dec 16, 2019
|
| This program implements a fitness tracking system.
|
*/

public class StepTracker
{
    // YOUR CODE HERE
    // instance variables
    private int minSteps;
    private int numActive;
    private int totalSteps;
    private int numDays;
    
    // constructors
    public StepTracker(int m)
    {
        minSteps = m;
        numActive = 0;
        totalSteps = 0;
        numDays = 0;
    }
    
    public void addDailySteps(int steps)
    {
        totalSteps += steps;
        numDays++;
        if (steps >= minSteps)
        {
            numActive++;
        }
    }
    
    public int activeDays()
    {
        return numActive;
    }
    
    public double averageSteps()
    {
        double result = 1.0*totalSteps/numDays;
        return result;
    }
}
