public class Pizza
{
    // instance variables
    private String topping;
    private double price;
    
    // constructors
    public Pizza()
    {
        topping = "pepperoni";
        price = 11.95;
    }
    
    // accessor methods
    public String getTopping()
    {
        return topping;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    // mutator methods
    public void setTopping(String t)
    {
        topping = t;
    }
    
    public void setPrice(double p)
    {
        price = p;
    }
}