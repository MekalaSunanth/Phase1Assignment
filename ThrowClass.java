package Today;

public class ThrowClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=10,j=4,rs;

        try
        {
            if(j==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                rs = i+j;
                System.out.print("\n\tThe result is : " + rs);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\n\tError : " + Ex.getMessage());
        }

        System.out.print("\n\tEnd of program.");


	}

}
