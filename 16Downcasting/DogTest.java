public class DogTest
{
    public static void main(String[] args)
    {
        Pet animal = new Dog("Fido");
        System.out.println(animal.getName());
        System.out.println( ((Dog) animal).bark() );
        
        Dog canine = new Dog("Spot");
        System.out.println(canine.getName());
        System.out.println(canine.bark());
    }
}