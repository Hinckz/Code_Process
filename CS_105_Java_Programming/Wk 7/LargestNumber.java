package Week7;

import java.util.Scanner;

public class LargestNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please provide THREE WHOLE numbers: ");
		int number1 = getValidNumber(scanner);
		int number2 = getValidNumber(scanner);
		int number3 = getValidNumber(scanner);
		
		int largestNumber = findLargestNumber(number1, number2, number3);
		
		System.out.println("Largest number = " + largestNumber);
		
		System.out.println("Do you want to play again? (Yay/Nay)");
		String playAgain = scanner.next();
		
		
		while (playAgain.equals("Yay")) {
			
			System.out.println("Please provide THREE WOLE numbers: ");
			number1 = getValidNumber(scanner);
			number2 = getValidNumber(scanner);
			number3 = getValidNumber(scanner);
			
			largestNumber = findLargestNumber(number1, number2, number3);
			
			System.out.println("Largest number = " + largestNumber);
			System.out.println("Do you want to play again? (Yay/Nay)");
			playAgain = scanner.next();
			
			if (playAgain.equals("Nay")) {
				System.out.println("Thank you for playing");  
			}
			
			}
			
	}

	private static int getValidNumber(Scanner scanner) {
		// TODO Auto-generated method stub
		int number;
		do {
			System.out.print("whole number: ");
			number = scanner.nextInt();
		} while (number < 1);
		
		return number;
		
	}
	private static int findLargestNumber(int number1, int number2, int number3) {
		// TODO Auto-generated method stub
		int largestNumber = number1;
		
		if (number2 > largestNumber) {
			largestNumber = number2;
		}
		if (number3 > largestNumber) {
			largestNumber = number3;
		}
		return largestNumber;
	}

	

}
