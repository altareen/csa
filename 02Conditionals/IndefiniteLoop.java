public class IndefiniteLoop
{
    public static void main(String[] args)
    {
        int count = 0; // initialization
        while (count < 5) // testing
        {
            System.out.println(count);
            count++; // increment
        }
    }
}