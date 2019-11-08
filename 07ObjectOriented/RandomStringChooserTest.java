public class RandomStringChooserTest
{
    public static void main(String[] args)
    {
        String[] wordArray = {"wheels", "on", "the", "bus"};
        RandomStringChooser rs = new RandomStringChooser(wordArray);
        for (int i = 0; i < 6; i++)
        {
            System.out.print(rs.getNext() + " ");
        }
    }
}