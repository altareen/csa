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
        
        
        
    }
}