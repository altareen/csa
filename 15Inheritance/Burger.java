public class Burger extends Lunch
{
    // instance variables
    private String topping;
    
    // constructors
    public Burger(String t)
    {
        topping = t;
    }
    
    public String getTopping()
    {
        return topping;
    }
}