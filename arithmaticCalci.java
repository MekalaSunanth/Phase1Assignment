package calciassign;
import java.util.Scanner;
public class arithmaticCalci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter the two numbers");
		int m=sc.nextInt();
		int n= sc.nextInt();
		System.out.println("Enter the operator ");
		char op=sc.next().charAt(0);
		double Ans=0;

		switch(op){
		case '+': Ans=m+n;
		break;
		case '-':Ans=m-n;
		break;
		case '*': Ans=m*n;
		break;
		case '/':Ans=m/n;
		break;
		}
		System.out.println("the answer is " +Ans);
	}
	}


