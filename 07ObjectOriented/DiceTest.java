public class DiceTest
{
    public static void main(String[] args)
    {
        Dice cube = new Dice();
        System.out.println(cube.getFaceValue());
        cube.roll();
        System.out.println(cube.getFaceValue());
        
    }
}