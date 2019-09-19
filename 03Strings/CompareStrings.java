public class CompareStrings
{
    public static void main(String[] args)
    {
        String first = "a";
        String next = "d";
        int result = first.compareTo(next);
        System.out.println(result);
        
        String fruit = "apple";
        String plant = "flower";
        result = fruit.compareTo(plant);
        System.out.println(result);
        
        String one = "bbbbbd";
        String two = "bbbbbf";
        result = one.compareTo(two);
        System.out.println(result);
        
        String lunch = "PIZZA";
        String dinner = "burger";
        result = lunch.compareTo(dinner);
        System.out.println(result);
        
        String vegetable = "zucchini";
        String citrus = "orange";
        result = vegetable.compareTo(citrus);
        System.out.println(result);
        
        String salad = "garden";
        String hobby = "garden";
        result = salad.compareTo(hobby);
        System.out.println(result);
    }
}