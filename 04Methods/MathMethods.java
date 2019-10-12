public class MathMethods
{
    public static void main(String[] args)
    {
        int n = 0;
        double d = 0.0;
        
        n = Math.abs(-17);
        System.out.println(n);
        
        d = Math.abs(-39.65);
        System.out.println(d);
        
        d = Math.pow(10, 3);
        System.out.println(d);
        
        n = Math.max(25, 50);
        System.out.println(n);
        
        n = Math.min(100, 75);
        System.out.println(n);
        
        d = Math.sqrt(932845);
        System.out.println(d);
        
        d = Math.random() + 2;
        System.out.println(d);
        
        n = (int) (Math.random()*16) + 8;
        System.out.println(n);
    }
}