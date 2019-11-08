public class BankAccountTest
{
    public static void main(String[] args)
    {
        BankAccount ba = new BankAccount(10);
        ba.withdraw(15);
        ba.deposit(20);
        System.out.println(ba.getBalance());
        System.out.println(ba.getFees());
    }
}