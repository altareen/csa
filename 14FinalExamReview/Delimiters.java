/**
|-------------------------------------------------------------------------------
| Delimiters.java
|-------------------------------------------------------------------------------
|
| Author:  Alwin Tareen
| Created: Dec 15, 2019
|
| This program checks for the presence of valid delimiters.
|
*/

import java.util.*;
public class Delimiters
{
    // instance variables
    private String openDel;
    private String closeDel;
    
    // constructors
    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }
    
    public ArrayList<String> getDelimitersList(String[] tokens)
    {
        // YOUR CODE HERE
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 0; i < tokens.length; i++)
        {
            String item = tokens[i];
            if (item.equals(openDel) || item.equals(closeDel))
            {
                result.add(item);
            }
        }
        return result;
    }
    
    public boolean isBalanced(ArrayList<String> delimiters)
    {
        // YOUR CODE HERE
        boolean outcome = false;
        int open = 0;
        int closed = 0;
        for (int i = 0; i < delimiters.size(); i++)
        {
            String element = delimiters.get(i);
            if (element.equals(openDel))
            {
                open++;
            }
            else if (element.equals(closeDel))
            {
                closed++;
            }
            
            if (closed > open)
            {
                return false;
            }
        }
        
        if (open == closed)
        {
            outcome = true;
        }
        return outcome;
    }
}
