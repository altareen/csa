public class CallingMethods
{
    public static void printFirstName()
    {
        System.out.println("Bob");
    }
    
    public static void printLastName()
    {
        System.out.println("Smith");
    }
    
    public static void printName()
    {
        printFirstName();
        printLastName();
    }
    
    public static void main(String[] args)
    {
        printName();
    }
}