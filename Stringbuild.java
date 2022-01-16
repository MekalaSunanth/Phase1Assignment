package StringConversion;

public class Stringbuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Mahi";
		StringBuilder str1=new StringBuilder(str);
		str1.append("DRat");
		str1.replace(0, 5, "Mahi");
		System.out.println(str1);
	}

}
