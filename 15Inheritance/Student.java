public class Student extends Person
{
    // instance variables
    private int grade;
    private String school;
    
    // constructors
    public Student(String n, double p, int g, String s)
    {
        super(n, p);
        grade = g;
        school = s;
    }
    
    // methods
    public int getGrade()
    {
        return grade;
    }
    
    public String getSchool()
    {
        return school;
    }
    
    public String contactInformation()
    {
        return super.getName();
    }
    
    public String toString()
    {
        String result = super.toString();
        result += " Grade: " + grade + " School: " + school;
        return result;
    }
}








