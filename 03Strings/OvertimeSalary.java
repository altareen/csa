public class OvertimeSalary
{
    public static double calculatePay(double hours, double rate)
    {
        double pay = 0.0;
        if (hours <= 40)
        {
            pay = hours * rate;
        }
        else
        {
            pay = 40 * rate + (hours - 40) * (rate * 1.5);
        }
        return pay;
    }
    
    public static void main(String[] args)
    {
        double result = calculatePay(45, 10);
        System.out.println("Pay: " + result);
    }
}