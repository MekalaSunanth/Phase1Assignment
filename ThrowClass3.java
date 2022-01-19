package Today;

public class ThrowClass3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int i=9,j=19,a=0;
        try
        {
            a = i*j;
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }
        finally
        {
            System.out.print("\n\tThe result is : "+a);
        }

	}

}
