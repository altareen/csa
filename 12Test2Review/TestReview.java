import java.util.*;
public class TestReview
{
    public static void main(String[] args)
    {
        // 1.
        int[] nums = new int[5];
        
        // 2.
        int[] items = {2, 4, 6, 8};
        System.out.println(items[0] + " " + items[1]);
        
        // 3.
        int[] vals = {2, 4, 6, 8};
        vals[0] = 23;
        vals[3] = vals[1];
        System.out.println(Arrays.toString(vals));
        System.out.println(vals[0] + " " + vals[3]);
        
        // 5.
        double[][] elements = { {1.2, 9.0, 3.2},
                        {9.2, 0.5, 1.5},
                        {7.3, 7.9, 4.8} };
        System.out.println(elements[2][1]);
        
        // 6.
        int[] scores = {12, 34, 9, 0, -62, 88};
        System.out.println(scores.length);
        
        // 7.
        int[] evens = new int[10];
        for (int i = 0; i < evens.length; i++)
        {
            evens[i] = 2*i;
        }
        System.out.println(Arrays.toString(evens));
        
        // 8.
        int[] digits = {2, 4, 6, 8, 10, 1, 3, 5, 7, 9};
        for (int i = 0; i < 5; i++)
        {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        
        // 9.
        double[][] temps = { {1.2, 9.0},
                        {9.2, 0.5},
                        {7.3, 7.9} };
        System.out.println(temps.length);
        
        // Short Answer
        
        // 1.
        double[] numsa = new double[800];
        
        // 2.
        double[] scoresa = new double[21];
        System.out.println(scoresa.length);
        
        // 3.
        int[] tempsa = {34, 56, -102, 18, 5};
        System.out.println(tempsa[1]);
        
        // 4.
        int[] tempsb = {34, 56, -102, 18, 5};
        System.out.println(tempsb[3] + tempsb[4]);
        
        // 5.
        String[] names = {"Bob", "Jim", "Sally"};
        System.out.println(names[2]);
        
        // 6.
        int[] numsb = new int[7];
        for (int i = 0; i < numsb.length; i++)
        {
            numsb[i] = 23;
        }
        System.out.println(Arrays.toString(numsb));
        
        // 7.
        int[][] elementsa = new int[10][10];
        for (int i = 0; i < elementsa.length; i++)
        {
            for (int j = 0; j < elementsa[0].length; j++)
            {
                elementsa[i][j] = 58;
            }
        }
        for (int[] row : elementsa)
            System.out.println(Arrays.toString(row));
        
        // 9.
        // 75
        // 10
        
        
        
        
        
        
        
    }
}