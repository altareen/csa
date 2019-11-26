import java.util.*;
public class ForEachLoop
{
    public static void main(String[] args)
    {
        double[] data = {9.2, 8.3, 7.4, 2.9, 8.1};
        double total = 0.0;
        
        // using a for loop to determine the sum
        for (int i = 0; i < data.length; i++)
        {
            double item = data[i];
            total += item;
        }
        System.out.println(total);
        
        total = 0.0;
        // using a for-each loop to find the sum
        for (double item : data)
        {
            total += item;
        }
        System.out.println(total);
        
        // using a for-each loop with an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        words.add("pizza");
        words.add("burger");
        words.add("chips");
        words.add("soda");
        
        for (String element : words)
        {
            System.out.println(element);
        }
        
        
        // using an ArrayList with SavingsAccount objects
        SavingsAccount first = new SavingsAccount(98.23);
        SavingsAccount second = new SavingsAccount(21.96);
        SavingsAccount third = new SavingsAccount(83.23);
        
        ArrayList<SavingsAccount> bank = new ArrayList<SavingsAccount>();
        bank.add(first);
        bank.add(second);
        bank.add(third);
        
        double sum = 0.0;
        for (SavingsAccount portfolio : bank)
        {
            sum += portfolio.getBalance();
        }
        
        System.out.println(sum);
        
        
        
        
        
        
        
        
        
        
        
    }
}