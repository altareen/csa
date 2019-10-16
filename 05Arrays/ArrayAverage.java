public class ArrayAverage
{
    public static void main(String[] args)
    {
        double total = 0.0;
        double[] samples = new double[50];
        
        for (int i = 0; i < samples.length; i++)
        {
            samples[i] = Math.random() * 100;
            total += samples[i];
        }
        
        double average = total/samples.length;
        System.out.println("Average = " + average);
    }
}