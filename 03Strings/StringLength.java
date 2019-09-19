public class StringLength
{
    public static void main(String[] args)
    {
        String fruit = "watermelon";
        int num = fruit.length();
        System.out.println("Number of letters: " + num);
        
        // Loop to display every letter in a String
        for (int i = 0; i < fruit.length(); i++)
        {
            String letter = fruit.substring(i, i+1);
            System.out.println(letter);
        }
        
        
    }
}