public class TriangularRecursive
{
    public static int triangular(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        else
        {
            return n + triangular(n - 1);
        }
    }
    
    public static void main(String[] args)
    {
        int result = triangular(20);
        System.out.println(result);
    }
}