public class TypeCasting
{
    public static void main(String[] args)
    {
       // type cast from and int to a double
       int sum = 8;
       double total = 0.0;
       total = (double) sum;
       System.out.println(total);
       System.out.println((double) sum);
       
       // type cast from a double to an int
       double money = 84.69;
       int dollars = 0;
       dollars = (int) money;
       System.out.println(dollars);
       System.out.println((int) money);
       
    }    
}