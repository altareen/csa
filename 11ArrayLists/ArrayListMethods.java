import java.util.*;
public class ArrayListMethods
{
    public static void main(String[] args)
    {
        // Declaring and initializing an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        
        // appending items to an ArrayList
        words.add("pizza");
        words.add("hamburger");
        words.add("chips");
        words.add("soda");
        System.out.println(words);
        
        // Inserting an item into an ArrayList
        words.add(2, "wings");
        System.out.println(words);
        
        // Retrieving an item from an ArrayList
        String element = words.get(3);
        System.out.println(element);
        
        // Removing an element from an ArrayList
        String item = words.remove(2);
        System.out.println(words);
        System.out.println(item);
        
        // Replacing an element in the ArrayList
        String snack = words.set(2, "salad");
        System.out.println(words);
        System.out.println(snack);
        
        // Determining the quantity of elements in an ArrayList
        int num = words.size();
        System.out.println(num);
        
        // Determining if an ArrayList is empty
        boolean result = words.isEmpty();
        System.out.println(result);
        
        // Determining in the ArrayList contains a particular element
        boolean outcome = words.contains("pizza");
        System.out.println(outcome);
        
        
        
        
        
        
        
    }    
}
