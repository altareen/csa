public class ExtractingStrings
{
    public static void main(String[] args)
    {
        String fruit = "watermelon";
        String duration = fruit.substring(2, 6);
        System.out.println(duration);
        
        String letter = fruit.substring(5, 6);
        System.out.println(letter);
        
        String flavor = "strawberry";
        String piece = flavor.substring(5, 10);
        System.out.println(piece);
        
        String tardy = "chocolate".substring(5, 9);
        System.out.println(tardy);
    }
    
}