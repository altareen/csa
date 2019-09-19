public class SearchString
{
    public static void main(String[] args)
    {
        String lunch = "cheeseburger";
        int position = lunch.indexOf("burg");
        System.out.println(position);
        
        int location = lunch.indexOf("e");
        System.out.println(location);
        
        int section = lunch.indexOf("raw");
        System.out.println(section);
        
        // variations on indexOf
        String dinner = "pepperoni pizza and pickled peppers.";
        int num = dinner.indexOf("pepper", 10);
        System.out.println(num);
        
        int val = dinner.lastIndexOf("pi");
        System.out.println(val);
    }
    
}