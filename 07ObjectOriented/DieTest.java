public class DieTest
{
    public static void main(String[] args)
    {
        // create an object of type Die
        Die cube = new Die();
        
        // display the face value of the cube
        int result = cube.getFaceValue();
        System.out.println(result);
        
        // roll the die
        cube.roll();
        
        // display the face value of the cube
        result = cube.getFaceValue();
        System.out.println(result);
    }
}