public class Calendar
{
    public static boolean isLeapYear(int year)
    {
        //double result = Math.random();
        //return result < 0.5;
        if ( ((year%4==0) && (year%100 != 0)) || (year%400==0) )
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
    
    public static void main(String[] args)
    {
        int outcome = numberOfLeapYears(1960, 2000);
        System.out.println("Number of leap years: " + outcome);
    }
}