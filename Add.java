package Anii;

public class Add {
    public int Div(int x, int y) 
    { 
        return (x - y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double mul(double x, double y) 
    { 
        return (x * y); 
    } 
    public static void main(String args[]) 
    { 
        Add s = new Add(); 
        System.out.println(s.Div(10, 20)); 
        System.out.println(s.sum(10, 20, 30)); 
        System.out.println(s.mul(10.5, 20.5)); 
    } 


}
