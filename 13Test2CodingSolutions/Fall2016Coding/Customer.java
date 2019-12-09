public class Customer
{
    // instance variables
    private String meal;
    private double price;
    
    // constructors
    public Customer(String m, double p)
    {
        meal = m;
        price = p;
    }
    
    // accessor methods
    public String getMeal()
    {
        return meal;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    // mutator methods
    public void setMeal(String m)
    {
        meal = m;
    }
    
    public void setPrice(double p)
    {
        price = p;
    }
}
