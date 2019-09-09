public class CompoundAssignment
{
    public static void main(String[] args)
    {
        // adding 5 to the variable score
        int score = 10;
        score = score + 5;
        System.out.println(score);
        
        // using a compound assignment: +=
        int tally = 10;
        tally += 5;
        System.out.println(tally);
        
        // using a compound assignment: -=
        int points = 89;
        points -= 17;
        System.out.println(points);
    }
}