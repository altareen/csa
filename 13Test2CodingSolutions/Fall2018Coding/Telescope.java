public class Telescope
{
    // instance variables
    private double diameter;
    private double mainLength;
    private double eyeLength;

    // constructors
    public Telescope(double d, double m, double e)
    {
        diameter = d;
        mainLength = m;
        eyeLength = e;
    }

    // accessor methods
    public double magnification()
    {
        double result = 1.0*mainLength/eyeLength;
        return result;
    }

    public double fNumber()
    {
        double outcome = 1.0*manLength/diameter;
        return outcome;
    }
}
