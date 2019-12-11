public class APLine
{
    private int a;
    private int b;
    private int c;
    
    public APLine(int one, int two, int three)
    {
        a = one;
        b = two;
        c = three;
    }
    
    public double getSlope()
    {
        double result = -1.0*a/b;
        return result;
    }
    
    public boolean isOnLine(int x, int y)
    {
        boolean result = false;
        int outcome = a*x + b*y + c;
        if (outcome == 0)
        {
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }
}