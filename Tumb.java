package Anii;

interface First 
{  
    default void show() 
    { 
        System.out.println("HIGH First"); 
    } 
} 
interface Second 
{  
    default void show() 
    { 
        System.out.println("LOW Second"); 
    } 
}  
public class Tumb implements First, Second 
{  
    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
        Tumb ob = new Tumb(); 
        ob.show(); 
    } 
}
