public class Cylinder
{
    public static double volume(int r, int h, double pi)
    {
        double result = 0.0;
        result = pi * r * r * h;
        return result;
    }
    
    public static void main(String[] args)
    {
        double solution = volume(19, 23, 3.14);
        System.out.println("Volume = " + solution);
    }
    
}