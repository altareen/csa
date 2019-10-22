public class TestReview
{
    public static void main(String[] args)
    {
        // Fall 2014 Test 1
        
        // 21.
        /*
        !( (!a || b) && (!b || c) )
        !(!a || b) || !(!b || c)
        (a && !b) || (b && !c)
        a && !b || b && !c
        */
        
        // 22.
        double result = (2.0 + 4.0) + (2.0 + 4.0)*0.03;
        System.out.println(result);
            
        // 23.
        int n = 9;
        double root = Math.sqrt(100);
        for (int i = 1; i <= root; i++)
        {
            System.out.println(i*i);
        }
        
        
        // Fall 2016 Test 1
        
        // Question 10.
        int num = 407;
        
        // Question 11.
        num++;
        num += 1;
        num = num + 1;
        
        // Question 16.
        boolean b = false;
        int m = 0;
        if (m <= 44)
        {
            b = true;
        }
        
        // Question 17.
        for (int i = 2; i <= 10; i += 2)
        {
            System.out.println(i);
        }
        
        // Question 22.
        if (num%5 == 0)
        {
            System.out.println("multiple of 5");
        }
        
        // Question 23.
        if (num%2 == 0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
        
        // Question 24.
        if (num%5 == 0 && num%7 == 0)
        {
            System.out.println("multiple of 5 and 7");
        }
        
        // Question 25
        if (num%3 == 0 && num%24 != 0)
        {
            System.out.println("multiple of 3 not 24");
        }
        
        // 33.
        double radius = 5.0;
        result = 3.14 * Math.pow(radius, 2);
        System.out.println(result);
        
        // 34.
        double fahrenheit = 83.0;
        double celsius = 5.0/9.0 * (fahrenheit - 32);
        System.out.println(celsius);
        
        // 36.
        String grade = computeGrade(3.89);
        System.out.println(grade);
    }
    
    public static String computeGrade(double gpa)
    {
        String result = "";
        if (gpa >= 3.5)
        {
            result = "A";
        }
        else if (gpa >= 2.5 && gpa < 3.5)
        {
            result = "B";
        }
        else if (gpa < 2.5)
        {
            result = "C";
        }
        return result;
    }
}