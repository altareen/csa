public class DigitExtraction
{
    public static void main(String[] args)
    {
        // extract the ones digit from this integer
        int total = 23978;
        int ones = total % 10;
        System.out.println("Ones digit: " + ones);
        
        // extract the tens and the ones digit
        int score = 932847;
        int tensones = score % 100;
        System.out.println("Tens and ones digits: " + tensones);
        
        // extract the ones digit and cut the number down
        int tally = 239854;
        int digit = tally % 10;
        System.out.println("Ones digit: " + digit);
        // remove the ones digit
        tally = tally / 10;
        System.out.println("tally after removing the ones digit: " + tally);
        
        // get the ones digit
        int num = tally % 10;
        System.out.println("Ones digit: " + num);
    }
}