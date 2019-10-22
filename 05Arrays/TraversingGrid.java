public class TraversingGrid
{
    public static void main(String[] args)
    {
        int[][] matrix = {{0, 1, 2, 3, 4},
                          {10, 11, 12, 13, 14},
                          {20, 21, 22, 23, 24},
                          {30, 31, 32, 33, 24}};
        
        // sum all of the values in the two dimensional array
        int total = 0;
        for (int row = 0; row < matrix.length; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                total += matrix[row][col];
            }
        }
        System.out.println(total);
    }
}