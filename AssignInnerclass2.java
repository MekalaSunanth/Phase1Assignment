package Innerclasses;

public class AssignInnerclass2 {
	private String msg="Training Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	 
	public static void main(String[] args) {
		AssignInnerclass2  ob=new AssignInnerclass2 ();  
		ob.display();  
		}
	}

