public class FindString
{
    public static void main(String[] args)
    {
        // regular use of indexOf()
        String lunch = "cheeseburger";
        int position = lunch.indexOf("burg");
        System.out.println(position);
        
        int location = lunch.indexOf("e");
        System.out.println(location);
        
        int section = lunch.indexOf("raw");
        System.out.println(section);
        
        // alternate versions of indexOf()
        String dinner = "hot pepperoni pizza and pickled peppers.";
        int num = dinner.indexOf("pepper", 10);
        System.out.println(num);
        
        int val = dinner.lastIndexOf("pi");
        System.out.println(val);
    }
}