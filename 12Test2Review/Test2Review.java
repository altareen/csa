import java.util.*;
public class Test2Review
{
    public static void main(String[] args)
    {
        // 1.
        int[] nums = new int[5];
        
        // 2.
        int[] evens = {2, 4, 6, 8};
        System.out.println(evens[0] + " " + evens[1]);
        
        // 3.
        int[] scores = {2, 4, 6, 8};
        scores[0] = 23;
        scores[3] = scores[1];
        System.out.println(Arrays.toString(scores));
        System.out.println(scores[0] + " " + scores[3]);
        
        // 5.
        double[][] total = { {1.2, 9.0, 3.2},
            {9.2, 0.5, 1.5},
            {7.3, 7.9, 4.8} };
            System.out.println(total[2][1]);
        
        // 6.
        int[] items = {12, 34, 9, 0, -62, 88};
        System.out.println(items.length);
        
        // 7.
        int[] vals = new int[10];
        for (int i = 0; i < vals.length; i++)
        {
            vals[i] = 2*i;
        }
        System.out.println(Arrays.toString(vals));
            
        // 8.
        int[] elements = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};
        for (int i = 0; i < 5; i++)
        {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
        
        // 9.
        double[][] temps = { {1.2, 9.0},
                {9.2, 0.5},
                {7.3, 7.9} };
                System.out.println(temps.length);
        
        // Short Answer
        // 1.
        double[] nums1 = new double[800];
        
        // 2.
        double[] scores1 = new double[21];
        System.out.println(scores1.length);
        
        // 3.
        int[] temps1 = {34, 56, -102, 18, 5};
        System.out.println(temps1[1]);
        
        // 4.
        System.out.println(temps1[3] + temps1[4]);
        
        // 5.
        String[] names = {"Bob", "Jim", "Sally"};
        System.out.println(names[2]);
        
        // 6.
        int[] nums2 = new int[7];
        for (int i = 0; i < nums2.length; i++)
        {
            nums2[i] = 23;
        }
        System.out.println(Arrays.toString(nums2));
        
        // 7.
        int[][] numz = new int[10][10];
        for (int i = 0; i < numz.length; i++)
        {
            for (int j = 0; j < numz[0].length; j++)
            {
                numz[i][j] = 58;
            }
        }
    }
    
    // 8.
    private int length;
    private int width;
    
    public int getPerimiter()
    {
        int result = 2*length + 2*width;
        return result;
    }
    
    public int getArea()
    {
        int area = length * width;
        return area;
    }
        
    // 9.
    // 75
    // 10
    
        
        
        
        
        
        
        
    
}