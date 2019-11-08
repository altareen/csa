import java.util.*;
public class RandomString
{
    // instance variables
    private ArrayList<String> words;
    
    // constructors
    public RandomString(String[] arr)
    {
        words = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++)
        {
            words.add(arr[i]);
        }
    }
    
    public String getNext()
    {
        String result = "";
        if (words.isEmpty())
        {
            result = "NONE";
        }
        else
        {
            int num = (int) (Math.random() * words.size());
            result = words.get(num);
            words.remove(num);
        }
        return result;
    }
    
    
    
    
    
    
    
    
}