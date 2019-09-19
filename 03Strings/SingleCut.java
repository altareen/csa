public class SingleCut
{
    public static void main(String[] args)
    {
        String seasoning = "peppermint";
        String herb = seasoning.substring(6);
        System.out.println(herb);
        
        String fruit = "watermelon";
        int num = fruit.length();
        System.out.println("Quantity = " + num);
        
        // loop across a String
        for (int i = 0; i < fruit.length(); i++)
        {
            String letter = fruit.substring(i, i+1);
            System.out.println(letter);
        }
    }
}