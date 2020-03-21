public class Person
{
    // instance variables
    private String name;
    private double phone;
    
    // constructors
    public Person(String n, double p)
    {
        name = n;
        phone = p;
    }
    
    // methods
    public String getName()
    {
        return name;
    }
    
    public double getPhone()
    {
        return phone;
    }
    
    public String toString()
    {
        return "Name: " + name + " Phone: " + phone;
    }
}