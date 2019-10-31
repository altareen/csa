public class StepTracker
{
    // instance variables
    private int minSteps;
    private int days;
    private int powerDays;
    private int dailySteps;
    
    // constructors
    public StepTracker(int m)
    {
        minSteps = m;
        days = 0;
        powerDays = 0;
        dailySteps = 0;
    }
    
    // methods
    public void addDailySteps(int s)
    {
        dailySteps += s;
        days++;
        if (s >= minSteps)
        {
            powerDays++;
        }
    }
    
    public int activeDays()
    {
        return powerDays;
    }
    
    public double averageSteps()
    {
        double result = 1.0*dailySteps/days;
        return result;
    }
}