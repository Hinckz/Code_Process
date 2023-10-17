package week5;

import java.util.Scanner;

public class InputValidationInteger {
	
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	        String input = "";
	        int num1 = 0, num2 = 0, num3 = 0;
	        boolean valid = false;

	        do {
	            System.out.print("Enter any number of your choice: ");
	            input = in.nextLine();
	            
	            try {
	                num1 = Integer.parseInt(input);
	                valid = true;
	            } catch (Exception e) {
	                System.out.println("Invalid: Please enter a whole number.\n");
	            }
	        } while (!valid);
	        
	        num2 = num1 + 1000;
	        num3 = num1 * 2;

	        System.out.println("Entered Number: " + num1);
	        
	        System.out.println("Entered Number + 1000: " + num2);
	        
	        System.out.println("Entered Number * 2: " + num3);
	        
	        in.close();
	    }


	}

