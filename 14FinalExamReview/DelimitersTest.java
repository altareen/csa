/**
|-------------------------------------------------------------------------------
| DelimitersTest.java
|-------------------------------------------------------------------------------
|
| Author:  Alwin Tareen
| Created: Dec 15, 2019
|
| This is the test bench for Delimiters.java
| Do not alter the contents of this file.
|
*/

import java.util.*;
public class DelimitersTest
{
    public static void main(String[] args)
    {
        // question (a)
        Delimiters tags = new Delimiters("(", ")");
        String[] elements = {"(", "x + y", ")", " * 5"};
        
        ArrayList<String> result = tags.getDelimitersList(elements);
        System.out.println(result);
        
        Delimiters labels = new Delimiters("<q>", "</q>");
        String[] pieces = {"<q>", "yy", "</q>", "zz", "</q>"};
        
        ArrayList<String> outcome = labels.getDelimitersList(pieces);
        System.out.println(outcome);
        
        // question (b)
        Delimiters dels = new Delimiters("<sup>", "</sup>");
        ArrayList<String> first = new ArrayList<String>();
        first.add("<sup>");
        first.add("<sup>");
        first.add("</sup>");
        first.add("<sup>");
        first.add("</sup>");
        first.add("</sup>");
        boolean solution = dels.isBalanced(first);
        System.out.println(solution);
        
        ArrayList<String> second = new ArrayList<String>();
        second.add("<sup>");
        second.add("</sup>");
        second.add("</sup>");
        second.add("<sup>");
        solution = dels.isBalanced(second);
        System.out.println(solution);
        
        ArrayList<String> third = new ArrayList<String>();
        third.add("<sup>");
        third.add("<sup>");
        third.add("</sup>");
        solution = dels.isBalanced(third);
        System.out.println(solution);
    }
}
