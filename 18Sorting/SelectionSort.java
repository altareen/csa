public class SelectionSort
{
    public static void selectionSort(int[] nums)
    {
        int min = 0;
        int temp = 0;
        for (int i = 0; i < nums.length-1; i++)
        {
            min = i;
            for (int j = i+1; j < nums.length; j++)
            {
                if (nums[j] < nums[min])
                {
                    min = j;
                }
            }
            // swap
            temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }
    
    public static void main(String[] args)
    {
        int[] scores = {2,10,93,84,71,23,98,47,13,20,9,8,4};
        selectionSort(scores);
        for (int item : scores)
        {
            System.out.print(item + " ");
        }
    }
}