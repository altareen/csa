public class RandomStringTest
{
    public static void main(String[] args)
    {
        String[] wordArray = {"wheels", "on", "the", "bus"};
        RandomString rs = new RandomString(wordArray);
        for (int i = 0; i < 6; i++)
        {
            System.out.print(rs.getNext() + " ");
        }
        
    }
}