public class TwoDimensional
{
    public static void main(String[] args)
    {
        // initializing a two-dimensional array
        int[][] table = new int[7][15];
        
        int numrows = table.length;
        System.out.println("Number of rows = " + numrows);
        
        int numcols = table[0].length;
        System.out.println("Number of columns = " + numcols);
        
        table[0][2] = 10;
        System.out.println(table[0][2]);
    }
}