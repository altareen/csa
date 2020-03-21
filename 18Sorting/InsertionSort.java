public class InsertionSort
{
    public static void insertionSort(int[] nums)
    {
        int j = 0;
        int temp = 0;
        for (int i = 1; i < nums.length; i++)
        {
            temp = nums[i];
            j = i;
            while ((j > 0) && nums[j-1] > temp)
            {
                nums[j] = nums[j-1];
                j--;
            }
            nums[j] = temp;
        }
    }
    
    public static void main(String[] args)
    {
        int[] scores = {2,10,93,84,71,23,98,47,13,20,9,8,4};
        insertionSort(scores);
        for (int item : scores)
        {
            System.out.print(item + " ");
        }
    }
}