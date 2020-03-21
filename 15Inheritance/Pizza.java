public class Pizza extends Dinner
{
    // instance variables
    private String topping;
    
    // constructors
    public Pizza(String t)
    {
        topping = t;
    }
    
    public String getTopping()
    {
        return topping;
    }
}