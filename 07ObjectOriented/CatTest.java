public class CatTest
{
    public static void main(String[] args)
    {
        Cat fluffy = new Cat("Fluffy", 3);
        
        // using the accessor methods
        String result = fluffy.getName();
        System.out.println(result);
        
        int outcome = fluffy.getSize();
        System.out.println(outcome);
        
        // using the toString method
        System.out.println(fluffy);
        
    }
}