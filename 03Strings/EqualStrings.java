public class EqualStrings
{
    public static void main(String[] args)
    {
        String drink = "water";
        String beverage = "water";
        boolean result = (drink.equals(beverage));
        System.out.println(result);
        
        String soda = "sprite";
        String pop = "pepsi";
        boolean outcome = soda.equals(pop);
        System.out.println(outcome);
        
        boolean solution = "pizza".equals("burger");
        System.out.println(solution);
    }
}