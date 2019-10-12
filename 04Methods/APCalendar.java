public class APCalendar
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
        // in 2016, January 1 was on a Friday, so day = 5
        return 5;
    }
    
    public static int dayOfYear(int month, int day, int year)
    {
        // March 1, 2016 corresponds to day 61
        return 61;
    }
    
    public static int dayOfWeek(int month, int day, int year)
    {
        int weekday = firstDayOfYear(2016);
        int numdays = dayOfYear(3, 1, 2016);
        
        for (int i = 1; i < numdays; i++)
        {
            System.out.print("Weekday: " + weekday);
            System.out.println(" nth day: " + i);
            weekday = (weekday+1)%7;
        }
        return weekday;
    }
    
    public static void main(String[] args)
    {
        int outcome = numberOfLeapYears(1960, 2000);
        System.out.println("Number of leap years: " + outcome);
        int solution = dayOfWeek(3, 1, 2016);
        System.out.println("Weekday on March 1, 2016: " + solution);
    }
}