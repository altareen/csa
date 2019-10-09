public class Square
{
    public static int calculateSquare(int x)
    {
        int result = 0;
        result = x * x;
        return result;
    }
    
    public static void main(String[] args)
    {
        int num = calculateSquare(4);
        System.out.println("The square is: " + num);
    }
}