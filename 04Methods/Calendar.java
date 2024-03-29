public class Calendar
{
    public static boolean isLeapYear(int year)
    {
        //double result = Math.random();
        //return result < 0.5;
        if ( ((year%4 == 0) && (year%100 != 0)) || (year%400 == 0) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static int numberOfLeapYears(int year1, int year2)
    {
        int count = 0;
        boolean result = false;
        for (int i = year1; i <= year2; i++)
        {
            result = isLeapYear(i);
            if (result == true)
            {
                count++;
            }
        }
        return count;
    }
    
    public static int firstDayOfYear(int year)
    {
        // In 2016, January 1st was on a Friday, day = 5
        return 5;
    }
    
    public static int dayOfYear(int month, int day, int year)
    {
        // March 1, 2016 corresponds to day 61
        return 61;
    }
    
    public static int dayOfWeek(int month, int day, int year)
    {
        int weekday = firstDayOfYear(year);
        int numdays = dayOfYear(month, day, year);
        for (int i = 1; i < numdays; i++)
        {
            weekday = (weekday+1)%7;
        }
        return weekday;
    }
    
    public static void main(String[] args)
    {
        int outcome = numberOfLeapYears(1960, 2000);
        System.out.println("Number of leap years: " + outcome);
        
        int day = dayOfWeek(3, 1, 2016);
        System.out.println("Weekday = " + day);
    }
    
    
    
    
    
    
    
    
}