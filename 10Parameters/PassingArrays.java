import java.util.*;
public class PassingArrays
{
    public static void initializeArray()
    {
        int[] scores = {10, 20, 30};
        System.out.println(Arrays.toString(scores));
        alterArray(scores);
        System.out.println(Arrays.toString(scores));
    }
    
    public static void alterArray(int[] points)
    {
        points[0] = 500;
    }
    
    public static void main(String[] args)
    {
        initializeArray();
    }
}