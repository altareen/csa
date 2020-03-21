public class StringSearch
{
    public static int linearSearch(String[] words, String key)
    {
        for (int i = 0; i < words.length; i++)
        {
            if (words[i].equals(key))
            {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        String[] samples = {"cat", "dog", "mouse", "snake"};
        String query = "mouse";
        int result = linearSearch(samples, query);
        System.out.println("Found search key? " + result);
        
        query = "lizard";
        result = linearSearch(samples, query);
        System.out.println("Found search key? " + result);
    }
}