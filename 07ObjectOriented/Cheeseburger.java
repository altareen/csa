public class Cheeseburger
{
    // instance variables
    private String cheeseBrand;
    private int patties;
    
    // constructors
    public Cheeseburger()
    {
        cheeseBrand = "swiss";
        patties = 2;
    }
    
    public Cheeseburger(String c, int p)
    {
        cheeseBrand = c;
        patties = p;
    }
    
    public Cheeseburger(String kind)
    {
        cheeseBrand = kind;
        patties = 4;
    }
    
    public Cheeseburger(int num)
    {
        cheeseBrand = "colby";
        patties = num;
    }
}