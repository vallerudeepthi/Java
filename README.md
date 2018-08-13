#Program to check if candidate is eligible to vote or not (check age) 
package CheckAge;

import java.util.Scanner;

public class CheckAge {

	public static void main(String[] args) {
		int age = 0 ;
		
		 
		System.out.println("Enter your age");
		Scanner in = new Scanner(System.in);
		age=in.nextInt();
	    in.close();
	
		if (age >18)
		
			System.out.println("u can vote");
			else
				
			System.out.println("cant vote");
			
		

	}

}

