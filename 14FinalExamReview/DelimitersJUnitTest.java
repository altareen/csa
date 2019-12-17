/**
|-------------------------------------------------------------------------------
| DelimitersJUniteTest.java
|-------------------------------------------------------------------------------
|
| Author:  Alwin Tareen
| Created: Dec 15, 2019
|
| This is the test bench for Delimiters.java
| Do not alter the contents of this file.
|
*/

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import java.util.*;

public class DelimitersJUnitTest
{
    private Delimiters tags;
    private ArrayList<String> labels;
    private String[] elements;
    
    @Before
    public void runBeforeEachTest()
    {
        labels = new ArrayList<String>();
    }

    
    @After
    public void runAfterEachTest()
    {
        tags = null;
        labels = null;
        elements = null;
    }
    
    @Test
    public void testOne()
    {
        tags = new Delimiters("(", ")");
        elements = new String[] {"(", "x + y", ")", " * 5"};
        String expected = "[(, )]";
        String actual = tags.getDelimitersList(elements).toString();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTwo()
    {
        tags = new Delimiters("<q>", "</q>");
        elements = new String[] {"<q>", "yy", "</q>", "zz", "</q>"};
        String expected = "[<q>, </q>, </q>]";
        String actual = tags.getDelimitersList(elements).toString();
        assertEquals(expected, actual);
    }
    
    @Test
    public void testThree()
    {
        tags = new Delimiters("<sup>", "</sup>");
        labels.add("<sup>");
        labels.add("<sup>");
        labels.add("</sup>");
        labels.add("<sup>");
        labels.add("</sup>");
        labels.add("</sup>");
        boolean actual = tags.isBalanced(labels);
        assertTrue(actual);
    }
    
    @Test
    public void testFour()
    {
        tags = new Delimiters("<sup>", "</sup>");
        labels.add("<sup>");
        labels.add("</sup>");
        labels.add("</sup>");
        labels.add("<sup>");
        boolean actual = tags.isBalanced(labels);
        assertFalse(actual);
    }
    
    @Test
    public void testFive()
    {
        tags = new Delimiters("<sup>", "</sup>");
        labels.add("<sup>");
        labels.add("<sup>");
        labels.add("</sup>");
        boolean actual = tags.isBalanced(labels);
        assertFalse(actual);
    }
}
