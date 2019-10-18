import java.util.*;

public class TwoDimArray
{
    public static void main(String[] args)
    {
        int[][] table = new int[7][15];
        
        // determining the number of rows
        int numrows = table.length;
        System.out.println("Number of rows = " + numrows);
        
        // determining the number of columns
        int numcols = table[0].length;
        System.out.println("Number of columns = " + numcols);
        
        table[0][2] = 10;
        table[1][4] = 20;
        table[3][0] = 30;
        
        // initializer list
        int[][] matrix = {{0, 1, 2, 3, 4},
                          {10, 11, 12, 13, 14},
                          {20, 21, 22, 23, 24},
                          {30, 31, 32, 33, 24}};
        // display the matrix
        String display = "";
        for (int row = 0; row < matrix.length; row++)
        {
            display += Arrays.toString(matrix[row]) + "\n";
        }
        System.out.println(display);
    }
}