public class RestaurantTest
{
    public static void main(String[] args)
    {
        Customer charlie = new Customer("Burger", 10.0);
        Customer dennis = new Customer("Salad", 8.0);
        
        Restaurant grillery = new Restaurant();
        grillery.addCustomer(0, charlie);
        grillery.addCustomer(1, dennis);
        
        System.out.println(grillery);
        grillery.applyDiscount();
        System.out.println(grillery);
    }
}
