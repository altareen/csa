public class Telescope
{
    private double diameter;
    private double mainLength;
    private double eyeLength;
    
    public Telescope(double d, double m, double e)
    {
        diameter = d;
        mainLength = m;
        eyeLength = e;
    }
    
    public double magnification()
    {
        double result = mainLength/eyeLength;
        return result;
    }
    
    public double fNumber()
    {
        double result = mainLength/diameter;
        return result;
    }
}