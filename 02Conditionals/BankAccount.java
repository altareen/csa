public class BankAccount
{
    public static void main(String[] args)
    {
        double amount = 93.21;
        double balance = 132.58;
        if (amount <= balance)
        {
            balance -= amount;
            System.out.println("Your new balance is: " + balance);
        }
        else
        {
            System.out.println("You don't have enough money.");
        }
        
        
    }
}