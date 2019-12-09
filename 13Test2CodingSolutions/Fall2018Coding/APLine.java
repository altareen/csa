/**
|-------------------------------------------------------------------------------
| APLine.java
|-------------------------------------------------------------------------------
|
| Author:  Alwin Tareen
| Created: Nov 14, 2019
|
| This program defines the equation of a straight line.
|
*/

public class APLine
{
    // YOUR CODE HERE
    // instance variables
    private int a;
    private int b;
    private int c;
    
    // constructors
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
        int solution = a*x + b*y + c;
        if (solution == 0)
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