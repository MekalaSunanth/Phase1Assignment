package Returntype;

  class StudentDetails{

	int studentId;
	String studentName;
	Double paidfee;
	
	int studentIdinfo() {
		return studentId;
	}
	String studentNameinfo() {	
		return studentName;	
	}
	Double studentpaidfeeinfo() {
		return paidfee;
	}
}
public class Method{
	
	public static void main(String [] args) {
		
		StudentDetails s1=new StudentDetails();
		
		s1.studentId=17225;
		s1.studentName="MahiRat";
		s1.paidfee=50000.0;
		
		System.out.println("student Id:"+s1.studentIdinfo());
		System.out.println("student Name:"+s1.studentNameinfo());
		System.out.println("student paidfee:"+s1.studentpaidfeeinfo());
		
		
	}
	
}