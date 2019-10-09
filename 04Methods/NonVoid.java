public class NonVoid
{
    public static int calculateSum()
    {
        int first = 5;
        int second = 8;
        int result = first + second;
        return result;
    }
    
    public static boolean lightsOn()
    {
        boolean one = true;
        boolean two = false;
        boolean result = one && two;
        return result;
    }
    
    public static void main(String[] args)
    {
        int outcome = calculateSum();
        System.out.println(outcome);
        
        boolean solution = lightsOn();
        System.out.println(solution);
    }
}