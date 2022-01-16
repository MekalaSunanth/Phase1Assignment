package constructor;

public class Test2 {
	int a;
	private Test2() {
		a = 7;
		System.out.println("parameter is called ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 obj = new Test2();
		System.out.println("value is a: "+obj.a);
	}

}
