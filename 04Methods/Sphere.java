public class Sphere
{
    public static double calculateVolume(int r, double pi)
    {
        double result = 0.0;
        result = 4.0/3.0 * pi * r * r * r;
        return result;
    }
    
    public static void main(String[] args)
    {
        double solution = calculateVolume(98, 3.14);
        System.out.println(solution);
    }
}