public class Die
{
    // instance variables
    private int faceValue;
    
    // constructors
    public Die()
    {
        faceValue = 1;
    }
    
    public int getFaceValue()
    {
        return faceValue;    
    }
    
    public void roll()
    {
        faceValue = (int) (Math.random() * 6) + 1;
    }
}