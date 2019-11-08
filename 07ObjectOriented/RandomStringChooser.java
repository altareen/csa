public class RandomStringChooser
{
    // instance variables
    private String[] words;
    
    // constructors
    public RandomStringChooser(String[] arr)
    {
        words = new String[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            words[i] = arr[i];
        }
    }
    
    public String getNext()
    {
        String result = "";
        int num = (int) (Math.random() * words.length);
        if (words.length == 0)
        {
            result = "NONE";
        }
        else
        {
            result = words[num];
        }
        return result;
    }
    
    
    
}