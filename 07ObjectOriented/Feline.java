public class Feline
{
    // instance variables
    private String name;
    private int size;
    
    // constructors
    public Feline()
    {
        name = "";
        size = 0;
    }
    
    public Feline(String n, int s)
    {
        name = n;
        size = s;
    }
    
    // accessor methods
    public String getName()
    {
        return name;
    }
    
    public int getSize()
    {
        return size;
    }
    
    // mutator methods
    public void setName(String n)
    {
        name = n;
    }
    
    public void setSize(int s)
    {
        size = s;
    }
    
    // using the toString method
    public String toString()
    {
        String result = "";
        result += "Name: " + name + "\n";
        result += "Size: " + size;
        return result;
    }
}