public class Cat
{
    // instance variables
    private String name;
    private int size;
    
    // constructors
    public Cat()
    {
        name = "";
        size = 0;
    }
    
    public Cat(String n, int s)
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
    
    // the toString method
    public String toString()
    {
        String result = "";
        result += "Name: " + name + "\n";
        result += "Size: " + size;
        return result;
    }
}