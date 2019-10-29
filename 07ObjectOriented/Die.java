public class Die
{
    // instance variables
    private int faceValue;
    
    // constructors
    public Die()
    {
        faceValue = 1;
    }
    
    // accessor methods
    public int getFaceValue()
    {
        return faceValue;
    }
    
    // mutator methods
    public void roll()
    {
        faceValue = (int) (Math.random() * 6) + 1;
    }
}