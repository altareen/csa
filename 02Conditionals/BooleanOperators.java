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
        
        
    }
}