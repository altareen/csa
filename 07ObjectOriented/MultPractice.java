public class MultPractice
{
    // instance variables
    private int first;
    private int second;
    
    // constructors
    public MultPractice(int f, int s)
    {
        first = f;
        second = s;
    }
    
    // accessor methods
    public String getProblem()
    {
        String result = "";
        result = first + " TIMES " + second;
        return result;
    }
    
    // mutator methods
    public void nextProblem()
    {
        second++;
    }
}