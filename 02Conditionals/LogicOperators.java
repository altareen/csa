public class LogicOperators
{
    public static void main(String[] args)
    {
        boolean lights = false;
        if (!lights)
        {
            System.out.println("The room is dark.");
        }
        
        // the and operation
        boolean fries = true;
        boolean pop = true;
        if (fries && pop)
        {
            System.out.println("You have a full lunch");
        }
        
        int chips = 98;
        int soda = 23;
        if (chips > 0 && soda > 0)
        {
            System.out.println("You have snacks.");
        }
        
        // the or operation
        int money = 783;
        boolean creditCard = false;
        
        if (money > 1000 || creditCard == true)
        {
            System.out.println("You can buy an iPhone.");
        }
        
        // chaining together boolean operators
        int month = 9;
        if (month == 3 || month == 4 || month == 5)
        {
            System.out.println("It is spring.");
        }
        
        int height = 10;
        // we want to express 5 <= height < 15
        if (5 <= height && height < 15)
        {
            System.out.println("Medium.");
        }
    }
}