package constructor;

public class Test {
	private String name;
	Test() { 
		System.out.println("constructor called:");
		name = "Basics";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test();
		System.out.println("The name is " +obj.name);
	}

	
	}


