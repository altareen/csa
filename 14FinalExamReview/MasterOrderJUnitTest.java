/******************************************************************************
 *  Author:       Alwin Tareen
 *  Created:      Dec 13, 2018
 *  Last updated: Dec 13, 2018
 *
 *  Compilation:  javac MasterOrderJUnitTest.java
 *  Execution:    java MasterOrderJUnitTest
 *
 *  This program is the JUnit test bench for MasterOrder.java
 *
 ******************************************************************************/

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.*;

public class MasterOrderJUnitTest
{
    private MasterOrder goodies;
    
    @Before
    public void runBeforeEachTest()
    {
        goodies = new MasterOrder();
    }
    
    @After
    public void runAfterEachTest()
    {
        goodies = null;
    }
    
    @Test
    public void testOne()
    {
        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder("Shortbread", 5));
        goodies.addOrder(new CookieOrder("Macaroon", 2));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
        int expected = 11;
        int actual = goodies.getTotalBoxes();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTwo()
    {
        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder("Shortbread", 5));
        goodies.addOrder(new CookieOrder("Macaroon", 2));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
        int expected = 4;
        int actual = goodies.removeVariety("Chocolate Chip");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThree()
    {
        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder("Shortbread", 5));
        goodies.addOrder(new CookieOrder("Macaroon", 2));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
        goodies.removeVariety("Chocolate Chip");
        
        ArrayList<CookieOrder> snacks = new ArrayList<CookieOrder>();
        snacks.add(new CookieOrder("Shortbread", 5));
        snacks.add(new CookieOrder("Macaroon", 2));
        
        String expected = snacks.toString();
        String actual = goodies.getOrders().toString();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFour()
    {
        goodies.addOrder(new CookieOrder("Cinnamon", 12));
        goodies.addOrder(new CookieOrder("Mint Thins", 7));
        goodies.addOrder(new CookieOrder("Oatmeal", 15));
        goodies.addOrder(new CookieOrder("Almond Crunch", 18));
        goodies.addOrder(new CookieOrder("Cinnamon", 16));
        goodies.addOrder(new CookieOrder("Chunky Chocolate", 11));
        goodies.addOrder(new CookieOrder("Cinnamon", 23));
        int expected = 102;
        int actual = goodies.getTotalBoxes();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testFive()
    {
        goodies.addOrder(new CookieOrder("Cinnamon", 12));
        goodies.addOrder(new CookieOrder("Mint Thins", 7));
        goodies.addOrder(new CookieOrder("Oatmeal", 15));
        goodies.addOrder(new CookieOrder("Almond Crunch", 18));
        goodies.addOrder(new CookieOrder("Cinnamon", 16));
        goodies.addOrder(new CookieOrder("Chunky Chocolate", 11));
        goodies.addOrder(new CookieOrder("Cinnamon", 23));
        int expected = 51;
        int actual = goodies.removeVariety("Cinnamon");
        assertEquals(expected, actual);
    }
    
    @Test
    public void testSix()
    {
        goodies.addOrder(new CookieOrder("Cinnamon", 12));
        goodies.addOrder(new CookieOrder("Mint Thins", 7));
        goodies.addOrder(new CookieOrder("Oatmeal", 15));
        goodies.addOrder(new CookieOrder("Almond Crunch", 18));
        goodies.addOrder(new CookieOrder("Cinnamon", 16));
        goodies.addOrder(new CookieOrder("Chunky Chocolate", 11));
        goodies.addOrder(new CookieOrder("Cinnamon", 23));
        goodies.removeVariety("Cinnamon");
        
        ArrayList<CookieOrder> snacks = new ArrayList<CookieOrder>();
        snacks.add(new CookieOrder("Mint Thins", 7));
        snacks.add(new CookieOrder("Oatmeal", 15));
        snacks.add(new CookieOrder("Almond Crunch", 18));
        snacks.add(new CookieOrder("Chunky Chocolate", 11));
        
        String expected = snacks.toString();
        String actual = goodies.getOrders().toString();
        assertEquals(expected, actual);
    }
}