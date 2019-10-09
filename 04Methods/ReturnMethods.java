public class ReturnMethods
{
    public static int calculateSum()
    {
        int result = 0;
        int first = 5;
        int second = 8;
        result = first + second;
        return result;
    }
    
    public static String determineName()
    {
        String name = "Bob Smith";
        return name;
    }
    
    public static void main(String[] args)
    {
        int outcome = calculateSum();
        System.out.println(outcome);
        String solution = determineName();
        System.out.println(solution);
    }
    
}