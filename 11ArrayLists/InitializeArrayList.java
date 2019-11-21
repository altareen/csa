import java.util.*;
public class InitializeArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        // appending elements to the ArrayList
        words.add("pizza");
        words.add("hamburger");
        words.add("chips");
        words.add("soda");
        System.out.println(words);
        
        // inserting an element at index 2
        words.add(2, "wings");
        System.out.println(words);
    }
}