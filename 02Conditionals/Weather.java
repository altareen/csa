public class Weather
{
    public static void main(String[] args)
    {
        int temp = 75;
        if (temp > 100)
        {
            System.out.println("It is boiling!");
        }
        else if (temp > 90)
        {
            System.out.println("It is blistering!");
        }
        else if (temp > 80)
        {
            System.out.println("It is hot!");
        }
        else if (temp > 70)
        {
            System.out.println("It is warm.");
        }
        else
        {
            System.out.println("It is cold.");
        }
    }
}