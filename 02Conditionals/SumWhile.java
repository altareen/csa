public class SumWhile
{
    public static void main(String[] args)
    {
        int count = 1;
        int sum = 0;
        while (count <= 100)
        {
            sum += count;
            count++;
        }
        System.out.println("Sum is: " + sum);
        
        int tally = 0;
        while (tally <= 50)
        {
            System.out.println(tally);
            tally += 5;
        }
    }
}