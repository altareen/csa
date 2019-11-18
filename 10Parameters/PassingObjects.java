public class PassingObjects
{
    // This method is executed second, and we create an item
    // object which is passed to the outputSolution method.
    public static void outputResult()
    {
        Digit item = new Digit();
        System.out.println("Before the change, num = " + item.getNum());
        outputSolution(item);
        System.out.println("After the change, num = " + item.getNum());
    }
    
    // This method is executed third, and we pass in the
    // object as a parameter, and we change the instance
    // variable of that object.
    // The changes made to the object will persist outside
    // of this method.
    public static void outputSolution(Digit element)
    {
        element.setNum(75);
        System.out.println("During the change, num = " + element.getNum());
    }
    
    // This is where execution begins, and we run the
    // outputResult() method.
    public static void main(String[] args)
    {
        outputResult();
    }
}
