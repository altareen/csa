//----------------------------------------------------------
// File Name:	GrayImage.java
// Description:	2012 AP Free Response Question 4.
// Programmer:	Alwin Tareen
// Last Edited:	Apr 22, 2015
// OS Platform:	Linux Mint Maya 13, Java SE Development Kit 7
//
// Compilation:	javac GrayImage.java
// Execution:	<non-executable>
//----------------------------------------------------------

public class GrayImage
{
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    private int[][] pixelValues;

    public GrayImage(int[][] numGrid)
    {
        pixelValues = numGrid;
    }

    public int countWhitePixels()
    {
        int count = 0;
        for (int[] row : pixelValues)
        {
            for (int item : row)
            {
                if (item == 255)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public void processImage()
    {
        for (int row = 0; row < pixelValues.length-2; row++)
        {
            for (int col = 0; col < pixelValues[0].length-2; col++)
            {
                if (pixelValues[row][col] - pixelValues[row+2][col+2] < BLACK)
                {
                    pixelValues[row][col] = BLACK;
                }
                else
                {
                    pixelValues[row][col] -= pixelValues[row+2][col+2];
                }
            }
        }
    }

    public String toString()
    {
        String result = "";
        for (int[] row : pixelValues)
        {
            for (int item : row)
            {
                result += item + "\t";
            }
            result += "\n";
        }
        return result;
    }
}
