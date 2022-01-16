package Innerclasses;

public class AssignInnerclass {

	
		 private String msg="Happy Bhogi"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", Let us start learning Inner Classes");}  
		 }  


		public static void main(String[] args) {

			AssignInnerclass obj=new AssignInnerclass();
			AssignInnerclass.Inner in=obj.new Inner();  
			in.hello();  
		}
	}


	


