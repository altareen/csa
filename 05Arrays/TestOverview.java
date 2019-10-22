public class TestOverview
{
    public static void main(String[] args)
    {
        // Fall 2014 Test 1
        
        // Question 21.
        /*
        !( !(a && !b) && (!b || c) )
        !( (!a || b) && (!b || c) )
        !(!a || b) || !(!b || c)
        (a && !b) || (b && !c)
        a && !b || b && !c
         */
        
        // Question 22.
        double groceries = (2.00 + 4.00) + (2.00 + 4.00) * 0.03;
        System.out.println(groceries);
        
        
        // Question 23.
        int n = 100;
        double root = Math.sqrt(n);
        for (int i = 1; i <= root; i++)
        {
            System.out.println(i*i);
        }
        
        
        // Fall 2016 Test 1
        
        
        
    }
}