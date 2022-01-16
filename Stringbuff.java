package StringConversion;

public class Stringbuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sunny";
		StringBuffer s1=new StringBuffer(s);
		s1.append("reddy");
		s1.replace(0, 5, "bhai");
		System.out.println(s1);
	}

}
