public class StringComparison
{
    public static void main(String[] args)
    {
        String first = "a";
        String next = "d";
        int result = first.compareTo(next);
        System.out.println(result);
        
        String fruit = "apple";
        String plant = "flower";
        int outcome = fruit.compareTo(plant);
        System.out.println(outcome);
        
        String one = "aaaaad";
        String two = "aaaaaf";
        int output = one.compareTo(two);
        System.out.println(output);
        
        String lunch = "PIZZA";
        String dinner = "burger";
        int solution = lunch.compareTo(dinner);
        System.out.println(solution);
        
        String digits = "92837474";
        String snack = "chips";
        result = digits.compareTo(snack);
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