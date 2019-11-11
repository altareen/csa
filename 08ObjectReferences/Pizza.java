public class Pizza
{
    // instance variables
    private String topping;
    private double price;
    
    // constructors
    public Pizza(String t, double p)
    {
        topping = t;
        price = p;
    }
    
    public String getTopping()
    {
        return topping;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setPrice(double p)
    {
        price = p;
    }
}
