public class PizzaTest
{
    public static void main(String[] args)
    {
        Pizza dominos = new Pizza();
        
        // display the instance variables
        String result = dominos.getTopping();
        System.out.println(result);
        
        double output = dominos.getPrice();
        System.out.println(output);
        
        // change topping to ham and price to 9.95
        dominos.setTopping("ham");
        dominos.setPrice(9.95);
        
        // display the instance variables
        result = dominos.getTopping();
        System.out.println(result);
        
        output = dominos.getPrice();
        System.out.println(output);
        
        
    }
}