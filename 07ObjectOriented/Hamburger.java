public class Hamburger
{
    // instance variables
    private String size;
    private int cooking;
    
    // constructors
    public Hamburger()
    {
        size = "regular";
        cooking = 100;
    }
    
    public Hamburger(String s, int c)
    {
        size = s;
        cooking = c;
    }
    
    public Hamburger(String s)
    {
        size = s;
        cooking = 150;
    }
    
    public Hamburger(int temperature)
    {
        size = "large";
        cooking = temperature;
    }
}