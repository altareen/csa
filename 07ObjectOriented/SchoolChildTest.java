public class SchoolChildTest
{
    public static void main(String[] args)
    {
        SchoolChild pupil = new SchoolChild("Bob", 17);
        
        // calling the accessor methods
        String result = pupil.getName();
        System.out.println(result);
        
        int outcome = pupil.getAge();
        System.out.println(outcome);
        
        // change the name of the pupil
        pupil.setName("Jack");
        result = pupil.getName();
        System.out.println(result);
        
        // change the age of the pupil
        pupil.setAge(18);
        outcome = pupil.getAge();
        System.out.println(outcome);
        
    }
}