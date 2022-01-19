package Today;
  class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 

   public class ThrowClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        try
        { 
            throw new MyException("pass"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("distinction"); 
            System.out.println(ex.getMessage()); 
        } 
    } 

	}


