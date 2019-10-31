public class StepMonitor
{
    // instance variables
    private int minSteps;
    private int totalSteps;
    private int powerDays;
    private int days;
    
    // constructors
    public StepMonitor(int m)
    {
        minSteps = m;
        totalSteps = 0;
        powerDays = 0;
        days = 0;
    }
    
    // accessor methods
    public int activeDays()
    {
        return powerDays;
    }
    
    public double averageSteps()
    {
        double result = 0.0;
        result = 1.0*totalSteps/days;
        return result;
    }
    
    // mutator methods
    public void addDailySteps(int steps)
    {
        totalSteps += steps;
        days++;
        if (steps >= minSteps)
        {
            powerDays++;
        }
    }
}