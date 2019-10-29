public class MountainBike
{
    // instance variables
    private String brand;
    private int gear;
    
    // constructors
    public MountainBike()
    {
        brand = "Giant";
        gear = 15;
    }
    
    // accessor methods
    public String getBrand()
    {
        return brand;
    }
    
    public int getGear()
    {
        return gear;
    }
    
    // mutator methods
    public void setGear(int g)
    {
        gear = g;
    }
}