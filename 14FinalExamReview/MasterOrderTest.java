/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Dec 13, 2018
 *  Last updated: Dec 13, 2018
 *
 *  Compilation:  javac MasterOrderTest.java
 *  Execution:    java MasterOrderTest
 *
 *  This program is the test bench for MasterOrder.java
 *
 ******************************************************************************/

public class MasterOrderTest
{
    public static void main(String[] args)
    {
        MasterOrder goodies = new MasterOrder();
        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder("Shortbread", 5));
        goodies.addOrder(new CookieOrder("Macaroon", 2));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
        
        int result = goodies.getTotalBoxes();
        System.out.println("Total Boxes = " + result);
        
        System.out.println(goodies.getOrders());
        int removed = goodies.removeVariety("Chocolate Chip");
        System.out.println("Boxes removed = " + removed);
        System.out.println(goodies.getOrders());
        removed = goodies.removeVariety("Brownie");
        System.out.println("Boxes removed = " + removed);
        System.out.println(goodies.getOrders());
    }
}