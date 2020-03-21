public class TriangularIterative
{
    public static int triangular(int n)
    {
        int total = 0;
        while (n > 0)
        {
            total = total + n;
            n--;
        }
        return total;
    }
    
    public static void main(String[] args)
    {
        int result = triangular(4);
        System.out.println(result);
    }
}