public class Student
{
    // instance variables
    private String name;
    private int age;
    
    // constructors
    public Student()
    {
        name = "";
        age = 0;
    }
    
    public Student(String n, int a)
    {
        name = n;
        age = a;
    }
    
    // accessor methods
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    // mutator methods
    public void setName(String n)
    {
        name = n;
    }
    
    public void setAge(int a)
    {
        age = a;
    }
}