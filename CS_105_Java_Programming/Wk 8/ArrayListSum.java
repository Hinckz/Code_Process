package week8;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSum {

	    public static void main(String[] args) {
	        @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
	        boolean playAgain =true;
	        while (playAgain) {
	        	ArrayList<Integer> numbers = new ArrayList<>();
	        	System.out.println("This program asks player to insert series of numbers as they desire. "
	        			+ "Input amount of number as you wish and press enter. Enter key with no data ends the program!");
	        	System.out.println("Provide numbers (Or click enter without a number to quit): ");
	        	boolean finished = false;
	        	while (!finished) {
	        		try {
	        			String input = scanner.nextLine().trim();
	                    if (input.isEmpty()) {
	                        finished = true;
	                    } else {
	                        int number = Integer.parseInt(input);
	                        numbers.add(number);
	                    }
	                } catch (NumberFormatException e) {
	                    System.out.println("Invalid input!! Please provide valid integer.");
	                }
	            }
		        System.out.println("The arraylist of provided integers are: ");
		        for (int i = 0; i < numbers.size(); i++) {
		            System.out.println("Index " + i + ": " + numbers.get(i));
		        }
		        
		        int sum = sumValues(numbers);
		        System.out.println("Elements count: " + numbers.size());
		        System.out.println("Total sum of the numbers = " + sum);

		        // Ask if user would love to play again
		        System.out.println("Would you want to play again? (Yay/Nay)? ");
		        boolean validAnswer = false;
		        while (!validAnswer) {
		            String response = scanner.nextLine();
		            if (response.equals("Yay")) {
		                validAnswer = true;
		            } else if (response.equals("Nay")) {
		            	validAnswer = true;
		                playAgain = false;
		            } else {
		                System.out.println("Invalid response!, Please reply Yay or Nay to proceed");
		            }
		        }
		    }
	        System.out.println("Program Done Executing.");
	        System.out.println("Thanks for engaging our app today%");
	    }
	    private static int sumValues(ArrayList<Integer> numbers) {
	        int sum = 0;
	        for (int number : numbers) {
	            sum += number;
	        }
	        return sum;
	    }
}

	    
	    