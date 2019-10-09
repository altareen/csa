public class Rectangle
{
    public static int calculateArea(int width, int length)
    {
        int result = 0;
        result = width * length;
        return result;
    }
    
    public static void main(String[] args)
    {
        int outcome = calculateArea(23, 79);
        System.out.println("Area: " + outcome);
    }
}