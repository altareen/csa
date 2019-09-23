public class GradeComputation
{
    public static String determineGrade(double score)
    {
        String grade = "";
        if (score < 0.0 || score > 1.0)
        {
            grade = "Bad score";
        }
        else if (score >= 0.9)
        {
            grade = "A";
        }
        else if (score >= 0.8)
        {
            grade = "B";
        }
        else if (score >= 0.7)
        {
            grade = "C";
        }
        else if (score >= 0.6)
        {
            grade = "D";
        }
        else
        {
            grade = "F";
        }
        return grade;
    }
    
    public static void main(String[] args)
    {
        String result = determineGrade(0.95);
        System.out.println("Grade: " + result);
    }
}