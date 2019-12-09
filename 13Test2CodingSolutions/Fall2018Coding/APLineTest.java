/**
|-------------------------------------------------------------------------------
| APLineTest.java
|-------------------------------------------------------------------------------
|
| Author:  Alwin Tareen
| Created: Nov 14, 2019
|
| This is the test bench for APLine.java
| Do not alter the contents of this file.
|
*/

public class APLineTest
{
    public static void main(String[] args)
    {
        APLine line1 = new APLine(5, 4, -17);
        double slope1 = line1.getSlope();
        boolean onLine1 = line1.isOnLine(5, -2);
        System.out.println("Slope: " + slope1);
        System.out.println("On line? " + onLine1 + "\n");
        
        APLine line2 = new APLine(-25, 40, 30);
        double slope2 = line2.getSlope();
        boolean onLine2 = line2.isOnLine(5, -2);
        System.out.println("Slope: " + slope2);
        System.out.println("On line? " + onLine2 + "\n");
        
        APLine edge = new APLine(35, -48, -34);
        double slope3 = edge.getSlope();
        boolean onLine3 = edge.isOnLine(-3, 6);
        System.out.println("Slope: " + slope3);
        System.out.println("On line? " + onLine3);
    }
}