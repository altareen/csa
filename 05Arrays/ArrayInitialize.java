import java.util.*;

public class ArrayInitialize
{
    public static void main(String[] args)
    {
        // declaring an array
        int[] tests;
        
        // define an array
        tests = new int[10];
        
        // declare and define an array in one statement
        int[] nums = new int[5];
        
        // place values into the array
        nums[0] = 5;
        nums[1] = 38;
        
        // retrieve values from the array
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        
        // using an initializer list
        double[] scores = {93.7, 86.2, 91.5, 98.3};
        String result = Arrays.toString(scores);
        System.out.println(result);
        
        // looping across the array scores
        for (int i = 0; i < 4; i++)
        {
            System.out.println(scores[i]);
        }
    }
}