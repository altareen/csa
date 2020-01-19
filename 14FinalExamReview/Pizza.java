import java.util.*;
public class Pizza
{
    public static void main(String[] args)
    {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Alex");
        students.add("Bob");
        students.add("Carl");
        
        for (int k = 0; k < students.size(); k++)
        {
            System.out.print(students.set(k, "Alex") + " ");
        }
        
        System.out.println();
        
        for (String name : students)
        {
            System.out.print(name + " ");
        }
    }
}