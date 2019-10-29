public class Sandwich
{
    // instance variables
    private String filling;
    private double price;
    
    // constructors
    public Sandwich()
    {
        filling = "ham";
        price = 9.95;
    }
    
    // accessor methods
    public String getFilling()
    {
        return filling;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    // mutator methods
    public void setFilling(String f)
    {
        filling = f;
    }
    
    public void setPrice(double p)
    {
        price = p;
    }
}