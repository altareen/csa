public class DigitRetrieval
{
    public static void main(String[] args)
    {
        // extract the digit in the ones position
        int total = 287364;
        int ones = total % 10;
        System.out.println("Digit in the ones position: " + ones);
        
        // extract the digits in the tens and ones
        int score = 126987;
        int tensones = score % 100;
        System.out.println("Digits from tens and ones: " + tensones);
        
        // extract single digits from a number
        int tally = 239875;
        int first = tally % 10;
        System.out.println("First digit: " + first);
        
        // cut down the number by one digit
        tally = tally / 10;
        System.out.println(tally);
        
        // extract the digit
        int second = tally % 10;
        System.out.println("Second digit: " + second);
    }
}