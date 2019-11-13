public class DiceGame
{
    // instance variables
    private Die[] dice;
    
    // constructors
    public DiceGame()
    {
        dice = new Die[5];
        for (int i = 0; i < dice.length; i++)
        {
            dice[i] = new Die();
        }        
    }
    
    public void rollDice()
    {
        for (int i = 0; i < dice.length; i++)
        {
            Die cube = dice[i];
            cube.roll();
        }
    }
    
    public String toString()
    {
        String result = "";
        for (int i = 0; i < dice.length; i++)
        {
            Die cube = dice[i];
            result += cube.getFaceValue() + " ";
        }
        return result;
    }
}