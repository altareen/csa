/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Dec 13, 2018
 *  Last updated: Dec 13, 2018
 *
 *  Compilation:  javac CookieOrder.java
 *  Execution:    java CookieOrder
 *
 *  This program specifies the variety of cookie and the number of boxes ordered.
 *
 ******************************************************************************/

public class CookieOrder
{
    // instance variables
    private String variety;
    private int numBoxes;
    
    // constructors
    public CookieOrder(String var, int num)
    {
        variety = var;
        numBoxes = num;
    }
    
    // methods
    public String getVariety()
    {
        return variety;
    }
    
    public int getNumBoxes()
    {
        return numBoxes;
    }
    
    public String toString()
    {
        return variety + ": " + numBoxes;
    }
}