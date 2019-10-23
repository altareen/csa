public class ProgrammingQuestions
{
    // Question 37.
    public static double pythagoras(double a, double b)
    {
        double anum = Math.pow(a, 2);
        double bnum = Math.pow(b, 2);
        double sum = anum + bnum;
        double hyp = Math.sqrt(sum);
        return hyp;
    }
    
    // Question 38.
    public static void hailstone(int num)
    {
        while (num > 1)
        {
            if (num%2 == 0)
            {
                num = num/2;
            }
            else
            {
                num = num*3 + 1;
            }
            System.out.println(num);
        }
    }
    
    // Question 39.
    public static int multiply(int grow, int shrink)
    {
        int product = 0;
        while (shrink > 0)
        {
            if (shrink%2 == 1)
            {
                product = product + grow;
            }
            grow = grow * 2;
            shrink = shrink / 2;
        }
        return product;
    }
    
    // Question 40.
    public static String pigLatin(String word)
    {
        String result = "";
        String f = word.substring(0, 1);
        if (f.equals("a") || f.equals("e") || f.equals("i") || f.equals("o") || f.equals("u"))
        {
            result = word + "hay";
        }
        else
        {
            String rest = word.substring(1);
            result = rest + f + "ay";
        }
        return result;
    }
    // Programming Question 1.
    public static int countVowels(String sample)
    {
        int count = 0;
        for (int i = 0; i < sample.length(); i++)
        {
            String f = sample.substring(i, i+1);
            if (f.equals("a") || f.equals("e") || f.equals("i") || f.equals("o") || f.equals("u"))
            {
                count++;
            }    
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        // Question 37.
        double result = pythagoras(3.5, 4.2);
        System.out.println(result);
        
        // Question 38.
        hailstone(5);
    
        // Question 39.
        int solution = multiply(23, 58);
        System.out.println(solution);
        
        // Question 40.
        String vowel = pigLatin("orange");
        System.out.println(vowel);
        
        String consonant = pigLatin("peach");
        System.out.println(consonant);
        
        // Fall 2018 Test 1
        
        // Programming Question 1.
        int outcome = countVowels("azcbobobegghakl");
        System.out.println(outcome);
        
        
    }
}