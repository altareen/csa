public class CheckingAccountTest
{
    public static void main(String[] args)
    {
        CheckingAccount ca = new CheckingAccount(10);
        ca.withdraw(15);
        ca.deposit(20);
        System.out.println("Balance: " + ca.getBalance());
        System.out.println("Fees: " + ca.getFees());
    }
}