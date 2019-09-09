public class AccountBalance
{
    public static void main(String[] args)
    {
        double amount = 93.88;
        double balance = 135.87;
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