public class Temperature
{
    public static void main(String[] args)
    {
        int temp = 55;
        if (temp > 100)
        {
            System.out.println("It is boiling hot!");
        }
        else if (temp > 90)
        {
            System.out.println("It is hot!");
        }
        else if (temp > 80)
        {
            System.out.println("It is extremely warm!");
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