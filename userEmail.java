package finallassignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class userEmail {

	public static void main(String[] args) {
		
		       List<String> emails = new ArrayList<String>();
		       // valid email addresses
		       emails.add("mahi@example.com");
		       emails.add("mahisunanth@example.com");
		       emails.add("sunny@example.me.org");
		       emails.add("cambo.example.com");
		       emails.add("legistha..bob@example.com");
		       emails.add("nobhitha@.example.com");
		       System.out.println("enter user email");
	    	   
		       Scanner sc = new Scanner(System.in);
		       String input = sc.nextLine(); 
		      
		       if(emails.contains(input))
		       {
		    	   System.out.println("valid");
		    	   
		       }
		       else
		       {
		    	   System.out.println("invalid");
		    	   
		       }    
		}
	}


