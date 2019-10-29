public class MountainBikeTest
{
    public static void main(String[] args)
    {
        MountainBike cycle = new MountainBike();
        System.out.println(cycle.getBrand());
        System.out.println(cycle.getGear());
        
        cycle.setGear(19);
        System.out.println(cycle.getGear());
    }
}