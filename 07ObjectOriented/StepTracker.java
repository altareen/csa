public class StepTracker
{
    // instance variables
    private int minSteps;
    private int days;
    private int activeDays;
    private int dailySteps;
    
    // constructors
    public StepTracker(int m)
    {
        minSteps = m;
        days = 0;
        activeDays = 0;
        dailySteps = 0;
    }
    
    // methods
    public void addDailySteps(int s)
    {
        dailySteps += s;
        days++;
        if (s >= minSteps)
        {
            activeDays++;
        }
    }
    
    public int activeDays()
    {
        return activeDays;
    }
    
    public double averageSteps()
    {
        
    }
    
    
}