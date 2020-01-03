/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Dec 13, 2018
 *  Last updated: Dec 13, 2018
 *
 *  Compilation:  javac MasterOrder.java
 *  Execution:    java MasterOrder
 *
 *  This program maintains a list of the cookies to be purchased.
 *
 ******************************************************************************/

import java.util.*;

public class MasterOrder
{
    // instance variables
    private ArrayList<CookieOrder> orders;
    
    // constructors
    public MasterOrder()
    {
        orders = new ArrayList<CookieOrder>();
    }
    
    // methods
    public void addOrder(CookieOrder theOrder)
    {
        orders.add(theOrder);
    }
    
    public int getTotalBoxes()
    {
        int total = 0;
        for (int i = 0; i < orders.size(); i++)
        {
            CookieOrder item = orders.get(i);
            total += item.getNumBoxes();
        }
        return total;
    }
    
    public int removeVariety(String cookieVar)
    {
        int quantity = 0;
        for (int i = orders.size()-1; i >= 0; i--)
        {
            CookieOrder biscuit = orders.get(i);
            String name = biscuit.getVariety();
            if (cookieVar.equals(name))
            {
                quantity += biscuit.getNumBoxes();
                orders.remove(i);
            }
        }
        return quantity;
    }
    
    public ArrayList<CookieOrder> getOrders()
    {
        return orders;
    }
}
