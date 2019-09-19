public class CuttingStrings
{
    public static void main(String[] args)
    {
        String fruit = "watermelon";
        String duration = fruit.substring(2, 6);
        System.out.println(duration);
        
        String drink = fruit.substring(0, 5);
        System.out.println(drink);
        
        String flavor = "strawberry";
        String citrus = flavor.substring(5, 10);
        System.out.println(citrus);
        
        String letter = flavor.substring(4, 5);
        System.out.println(letter);
        
        String tardy = "chocolate".substring(5, 9);
        System.out.println(tardy);
    }
}