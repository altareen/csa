public class Restaurant
{
    // instance variables
    private Customer[] patron;
    
    // constructors
    public Restaurant()
    {
        patron = new Customer[8];
    }
    
    // mutator methods
    public void addCustomer(int i, Customer c)
    {
        patron[i] = c;
    }
    
    public void applyDiscount()
    {
        for (int i = 0; i < patron.length; i++)
        {
            if (patron[i] != null)
            {
                double cost = patron[i].getPrice();
                cost *= 0.75;
                patron[i].setPrice(cost);
            }
        }
    }
    
    // toString() method
    public String toString()
    {
        String result = "";
        for (int i = 0; i < patron.length; i++)
        {
            if (patron[i] != null)
            {
                result += patron[i].getMeal() + " ";
                result += "$" + patron[i].getPrice() + "\n";
            }
        }
        return result;
    }
}