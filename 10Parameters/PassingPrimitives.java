public class PassingPrimitives
{
    // This method is called second, and the score variable is
    // passed to the displayTotal() method
    public static void displayScore()
    {
        int score = 10;
        displayTotal(score);
        System.out.println(score);
    }
    
    // This method is called third, and the parameter total has
    // its value changed to 75.
    // Once this method ends, the parameter total is destroyed.
    public static void displayTotal(int total)
    {
        total = 75;
        System.out.println(total);
    }
    
    // This is where execution begins, and it calls the
    // displayScore() method
    public static void main(String[] args)
    {
        displayScore();
    }
}
