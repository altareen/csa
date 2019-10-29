public class SandwichTest
{
    public static void main(String[] args)
    {
        Sandwich subway = new Sandwich();
        
        // display the values of the instance variables
        String result = subway.getFilling();
        System.out.println(result);
        
        double output = subway.getPrice();
        System.out.println(output);
        
        // set the instance variables
        subway.setFilling("roast beef");
        subway.setPrice(12.35);
        
        // display the values of the instance variables
        result = subway.getFilling();
        System.out.println(result);
        
        output = subway.getPrice();
        System.out.println(output);
    }
}