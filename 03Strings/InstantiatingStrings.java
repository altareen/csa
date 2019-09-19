public class InstantiatingStrings
{
    public static void main(String[] args)
    {
        // creating a String
        String awaken = "Good morning";
        System.out.println(awaken);
        
        // alternate way of creating a String
        String greetings = new String("Hello");
        System.out.println(greetings);
        
        // concatenating two Strings
        String first = "choco";
        String second = "late";
        String candy = first + second;
        System.out.println(candy);
        
        // using concatenation to tag a value
        int total = 58;
        System.out.println("Total = " + total);
    }
    
}