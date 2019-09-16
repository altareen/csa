public class SumSequence
{
    public static void main(String[] args)
    {
        // finding the sum of a number sequence
        int count = 1;
        int sum = 0;
        while (count <= 10)
        {
            sum += count;
            count++;
        }
        System.out.println("Sum: " + sum);
        
        // incrementing by an integer greater than one
        int tally = 0;
        while (tally <= 156)
        {
            System.out.println(tally);
            tally += 17;
        }
        
    }
}