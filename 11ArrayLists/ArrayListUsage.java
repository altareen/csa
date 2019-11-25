import java.util.*;
public class ArrayListUsage
{
    public static void main(String[] args)
    {
        // declaring and intializing an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        
        // adding elements to the ArrayList
        words.add("pizza");
        words.add("burger");
        words.add("chips");
        words.add("soda");
        System.out.println(words);
        
        // inserting an element into the ArrayList
        words.add(2, "wings");
        System.out.println(words);
        
        // retrieving an element at a particular index
        String element = words.get(3);
        System.out.println(element);
        
        // removing an element from an ArrayList
        String item = words.remove(2);
        System.out.println(words);
        System.out.println(item);
        
        // replacing an element in the ArrayList
        String snack = words.set(2, "salad");
        System.out.println(words);
        System.out.println(snack);
        
        // determining the quantity of elements in an ArrayList
        int num = words.size();
        System.out.println(num);
        
        // determining if the ArrayList is empty
        boolean result = words.isEmpty();
        System.out.println(result);
        
        // determining if the ArrayList contains a particular element
        boolean outcome = words.contains("pizza");
        System.out.println(outcome);
        
        
        
        
        
        
        
    }
}