public class Restaurant
{
    private Customer[] patron;
    
    public Restaurant()
    {
        patron = new Customer[8];
    }
    
    public void addCustomer(int i, Customer c)
    {
        patron[i] = c;
    }
    
    public void applyDiscount()
    {
        for (int i = 0; i < patron.length; i++)
        {
            Customer person = patron[i];
            if (person != null)
            {
                double cost = person.getPrice();
                cost = cost*0.75;
                person.setPrice(cost);
            }
        }
    }


    public String toString()
    {
        String result = "";
        for (Customer c : patron)
        {
            if (c != null)
            {
                result += c.getMeal() + " ";
                result += "$" + c.getPrice() + "\n";
            }
        }
        return result;
    }










}



