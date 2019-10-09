public class LeapYear
{
    public static boolean isLeapYear(int year)
    {
        double result = Math.random();
        return result < 0.5;
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
        int num = numberOfLeapYears(1960, 2000);
        System.out.println("Number of leap years: " + num);
    }
    
}