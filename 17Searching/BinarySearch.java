public class BinarySearch
{
    public static int binarySearch(int[] nums, int key)
    {
        int left = 0;
        int right = nums.length-1;
        while (left <= right)
        {
            int midpoint = (left + right)/2;
            if (nums[midpoint] == key)
            {
                return midpoint;
            }
            else if (nums[midpoint] < key)
            {
                left = midpoint + 1;
            }
            else
            {
                right = midpoint - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        int[] samples = {19,23,30,41,53,68,71,89,93,105};
        int query = 30;
        int result = binarySearch(samples, query);
        System.out.println("Found search key? " + result);
        
        query = 57;
        result = binarySearch(samples, query);
        System.out.println("Found search key? " + result);
    }
}