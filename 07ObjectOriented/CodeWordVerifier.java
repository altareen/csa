public class CodeWordVerifier
{
    // instance variables
    private int minimum;
    private int maximum;
    private String exclude;
    
    // constructors
    public CodeWordVerifier(int min, int max, String ex)
    {
        minimum = min;
        maximum = max;
        exclude = ex;
    }
    
    public CodeWordVerifier(String ex)
    {
        minimum = 6;
        maximum = 20;
        exclude = ex;
    }
    
    public boolean isValid(String word)
    {
        boolean result = false;
        int letters = word.length();
        int pos = word.indexOf(exclude);
        if (letters >= minimum && letters <= maximum && pos == -1)
        {
            result = true;
        }
        return result;
    }
}