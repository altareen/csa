import java.util.*;

public class ArrayCreate
{
    public static void main(String[] args)
    {
        // declare an array
        int[] tests;
        
        // define an array
        tests = new int[10];
        
        // declaring and defining an array with 1 line
        int[] nums = new int[5];
        
        // place integers into the array
        nums[0] = 95;
        nums[1] = 83;
        
        // read the elements from the array
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        
        // an initializer list
        double[] scores = {93.7, 86.2, 91.5, 98.3};
        String result = Arrays.toString(scores);
        System.out.println(result);
        
        // access an element out of bounds
        //double amount = scores[87];
        
        // loop across the array scores
        for (int i = 0; i < 4; i++)
        {
            System.out.println(scores[i]);
        }
    }
}