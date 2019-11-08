public class FelineTest
{
    public static void main(String[] args)
    {
        Feline mittens = new Feline("Mittens", 8);
        
        // use the accessor methods
        String result = mittens.getName();
        System.out.println(result);
        
        int outcome = mittens.getSize();
        System.out.println(outcome);
        
        // using toString to display the instance variables
        System.out.println(mittens);
        System.out.println(mittens.toString());
    }
}