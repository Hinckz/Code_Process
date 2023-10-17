package week5;

import java.util.Scanner;

public class NonNumericInputValidation {
	
	    public static void main(String[] args) {

	        Scanner in = new Scanner(System.in);

	        System.out.println("Do you enjoy studying at Ensign College? (Yep/Nope) ");

	        String input = in.nextLine();

	        while (!input.equals("Yep") && !input.equals("Nope")) {
	            System.out.println("Please enter a valid response (Yep/Nope): ");
	            input = in.nextLine();
	        }

	        if (input.equals("Yep")) {
	            System.out.println("I'm glad to know you do, cherish the moments!");
	        } else {
	            System.out.println("Sorry to note that, probably it's a case of mismatched priorities.");
	        }
	    }

}
