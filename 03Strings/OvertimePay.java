public class OvertimePay
{
    public static double computePay(double hours, double rate)
    {
        double result = 0.0;
        if (hours <= 40)
        {
            result = hours * rate;
        }
        else
        {
            result = (40 * rate) + (hours - 40) * (rate * 1.5);
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        double pay = computePay(45.0, 10.0);
        System.out.println("Pay: " + pay);
    }
}