public class MultiplyPracticeTest
{
    public static void main(String[] args)
    {
        MultiplyPractice p1 = new MultiplyPractice(7, 3);
        System.out.println(p1.getProblem());
        
        p1.nextProblem();
        System.out.println(p1.getProblem());
        
        p1.nextProblem();
        System.out.println(p1.getProblem());
        
        p1.nextProblem();
        System.out.println(p1.getProblem());
        
        MultiplyPractice p2 = new MultiplyPractice(4, 12);
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