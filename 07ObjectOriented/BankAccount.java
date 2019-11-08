public class BankAccount
{
    // instance variables
    private double balance;
    private double fees;
    
    // constructors
    public BankAccount(double b)
    {
        balance = b;
        fees = 0;
    }
    
    // accessor methods
    public double getBalance()
    {
        return balance;
    }
    
    public double getFees()
    {
        return fees;
    }
    
    // mutator methods
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    public void withdraw(double amount)
    {
        balance -= amount;
        if (balance < 0)
        {
            balance -= 5;
            fees += 5;
        }
    }
}