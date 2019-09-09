public class Compound
{
    public static void main(String[] args)
    {
        // add 5 to a variable, then update
        int score = 10;
        score = score + 5;
        System.out.println(score);
        
        // compound assignment operator: +=
        int points = 10;
        points += 5;
        System.out.println(points);
        
        // compound assignment operator: -=
        int tally = 30;
        tally -= 8;
        System.out.println(tally);
    }
}