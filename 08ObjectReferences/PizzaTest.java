public class PizzaTest
{
    public static void main(String[] args)
    {
        Pizza pyro = new Pizza("Cheese", 9.25);
        // display the price of a pizza
        double result = pyro.getPrice();
        System.out.println("Price of a pizza: " + result);
        
        Pizza dominos = null;
        
        // aliasing: dominos now contains the same memory address as pyro
        dominos = pyro;
        dominos.setPrice(12.50);
        
        // the price of the pizza has been altered
        double cost = pyro.getPrice();
        System.out.println("Price of a pizza: " + cost);
        
        // aliasing other object references to have the same address as pyro
        Pizza krosnest = pyro;
        Pizza papajohns = pyro;
        
        System.out.println(papajohns.getPrice());
    }
}