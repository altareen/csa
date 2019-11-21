import java.util.*;
public class DeclareArrayList
{
    public static void main(String[] args)
    {
        // declaring and initializing an ArrayList
        ArrayList<String> words = new ArrayList<String>();
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