public class BooleanOperators
{
    public static void main(String[] args)
    {
        boolean lights = false;
        if (!lights)
        {
            System.out.println("The room is dark.");
        }
        
        // the and operator
        boolean fries = true;
        boolean pop = false;
        boolean result = fries && pop;
        System.out.println(result);
        
        System.out.println(true && true);
        
        // using the and operator: &&
        int chips = 23;
        int soda = 87;
        if (chips > 0 && soda > 0)
        {
            System.out.println("You have snacks.");
        }
        
        int grade = 95;
        int tardies = 3;
        if (grade >= 90 && tardies < 5)
        {
            System.out.println("You qualify for the honor roll.");
        }
        
        // using the or operator: ||
        int money = 237;
        boolean creditCard = false;
        if (money > 1000 || creditCard == true)
        {
            System.out.println("You can buy and iPhone.");    
        }
        
        // determine whether a month falls in spring
        int month = 3;
        if (month == 3 || month == 4 || month == 5)
        {
            System.out.println("It is spring.");
        }
        
        // express the range 5 <= height < 15
        int height = 10;
        if (5 <= height && height < 15)
        {
            System.out.println("It is medium.");
        }
    }
}