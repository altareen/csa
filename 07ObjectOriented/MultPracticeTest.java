public class MultPracticeTest
{
    public static void main(String[] args)
    {
        MultPractice p1 = new MultPractice(7, 3);
        System.out.println(p1.getProblem());
        
        p1.nextProblem();
        System.out.println(p1.getProblem());
        
        p1.nextProblem();
        System.out.println(p1.getProblem());
        
        p1.nextProblem();
        System.out.println(p1.getProblem());
        
        MultPractice p2 = new MultPractice(4, 12);
        
        p2.nextProblem();
        System.out.println(p2.getProblem());
        System.out.println(p2.getProblem());
        
        p2.nextProblem();
        p2.nextProblem();
        System.out.println(p2.getProblem());
        
        p2.nextProblem();
        System.out.println(p2.getProblem());
    }
}