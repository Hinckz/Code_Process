package week3;
import java.util.Scanner;

public class HelloWorldRevised {
	
	public static void main(String[] args) {
		//Using Scanner for getting Input from user
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		//Asking User interesting questions
	     System.out.println("Please enter your Username: ");
	     String userName = in.nextLine();
	     System.out.println("Username is: " + userName);
	     
	     System.out.println("Hello Gordon, What is your favorite dessert? ");
	     String dessert = in.nextLine();
	     System.out.println("Favorite dessert is: " + dessert);
	     
	     System.out.println("Did you serve a mission? If yes where? ");
	     String Mission = in.nextLine();
	     System.out.println("Mission: " + Mission);
	     
	     System.out.println("What institute courses are you taking? ");
	     String InstituteCourses = in.nextLine();
	     System.out.println("Institute courses are: " + InstituteCourses);
	     
	     System.out.println("What degree path are you currently on? ");
	     String DegreePath = in.nextLine();
	     System.out.println("Degree path: " + DegreePath);
	     
	     System.out.println("What is coding? ");
	     String Coding = in.nextLine();
	     System.out.println("Coding: " + Coding);
	     
		
	}// end of mind()

}// end of class HelloWorldRevised
