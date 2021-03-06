public class LocationSearch
{
    public static int linearSearch(int[] nums, int key)
    {
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        int[] samples = {19,23,84,71,30,87,12,39,81};
        int query = 30;
        int result = linearSearch(samples, query);
        System.out.println("Found search key? " + result);
        
        query = 57;
        result = linearSearch(samples, query);
        System.out.println("Found search key? " + result);
    }
}