public class StudentTest
{
    public static void main(String[] args)
    {
        Student pupil = new Student("Bob", 17);
        
        // calling the accessor methods on pupil
        String result = pupil.getName();
        System.out.println(result);
        
        int outcome = pupil.getAge();
        System.out.println(outcome);
        
        // use the mutator methods to change the name and age
        pupil.setName("Jim");
        pupil.setAge(18);
        
        result = pupil.getName();
        System.out.println(result);
        
        outcome = pupil.getAge();
        System.out.println(outcome);
    }
}