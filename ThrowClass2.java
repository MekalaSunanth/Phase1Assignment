package Today;

public class ThrowClass2 {

	void Division() throws ArithmeticException
    {
        int i=18,j=0,ab;
          
        ab = i / j;
        System.out.print("\n\tThe result is : " + ab);
    }
     public static void main(String[] args)
    {
    	 ThrowClass2  T = new  ThrowClass2 ();
         try
        {
            T.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        System.out.print("\n\tEnd of program.");
    }


}
