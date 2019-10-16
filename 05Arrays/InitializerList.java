import java.util.*;

public class InitializerList
{
    public static void main(String[] args)
    {
        int[][] matrix = {{0, 1, 2, 3, 4},
                          {10, 11, 12, 13, 14},
                          {20, 21, 22, 23, 24},
                          {30, 31, 32, 33, 34}};

        String display = "";
        for (int row = 0; row < matrix.length; row++)
        {
            display += Arrays.toString(matrix[row]) + "\n";
        }
        System.out.println(display);
    }
}