// 8.
public class Rectangle
{
    // instance variables
    private int length;
    private int width;
    
    // constructors
    public Rectangle(int len, int wid)
    {
        length = len;
        width = wid;
    }
    
    public int getPerimeter()
    {
        int result = 2*length + 2*width;
        return result;
    }
    
    public int getArea()
    {
        int area = length * width;
        return area;
    }
}







