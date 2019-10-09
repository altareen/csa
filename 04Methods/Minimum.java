public class Minimum
{
    public static int calculateMin(int one, int two)
    {
        if (one < two)
        {
            return one;
        }
        else
        {
            return two;
        }
    }
    
    public static void main(String[] args)
    {
        int outcome = calculateMin(93, 28);
        System.out.println("Minimum: " + outcome);
    }
    
}