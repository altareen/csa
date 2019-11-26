import java.util.*;
public class EnhancedForLoop
{
    public static void main(String[] args)
    {
        double[] data = {9.2, 8.3, 7.4, 2.9, 8.1};
        double total = 0.0;
        
        // using a regualar for loop to determine the total
        for (int i = 0; i < data.length; i++)
        {
            double item = data[i];
            total += item;
        }
        System.out.println(total);
        total = 0.0;
        
        // using a for-each loop to determine the total
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
        
        // using a for-each loop to sum the balances in BankAccounts
        BankAccount first = new BankAccount(98.32);
        BankAccount second = new BankAccount(82.37);
        BankAccount third = new BankAccount(23.48);
        
        ArrayList<BankAccount> vault = new ArrayList<BankAccount>();
        vault.add(first);
        vault.add(second);
        vault.add(third);
        
        double sum = 0.0;
        for (BankAccount figure : vault)
        {
            sum += figure.getBalance();
        }
        System.out.println(sum);
    }
}
