import java.util.*;

public class ArrayLoops
{
    public static void main(String[] args)
    {
        int[] nums = new int[20];
        nums[0] = (int) (Math.random() * 100);
        
        for (int i = 0; i < 20; i++)
        {
            nums[i] = (int) (Math.random() * 100);
        }
        
        String result = Arrays.toString(nums);
        System.out.println(result);
    }
    
}