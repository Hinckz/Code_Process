/*
 * Program: Final Exam 2
 * Name:
 * Date: dd/mm/yyyy
 * Description: Arrays and Functions
 */
package Final;

import java.util.ArrayList;
import java.util.Scanner;

public class FinalExam2 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		addNumbers(numbers);
		int largest = largestNumber(numbers);
		
		System.out.println("Numbers provided: " + numbers);
		System.out.println("Largest number provided: " + Largest);
	}
	public static int addNumbers(ArrayList<Integer> numbers) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Provide number and press enter key when done:");
		
		int sum = 0;
        for (int number : numbers) {
            sum += number;
		
		while (true) {
			String input = scanner.nextLine();
			if (input.isEmpty()) {
				break;
			}
			try {
				int number = Integer.parseInt(input);
				numbers.add(number);
			} catch (NumberFormatException e) {
				System.out.println("Invalid input, please provide a valid number.");
			}
		}return sum;
	}
	
	public static int largestNumber(ArrayList<Integer> numbers) {
		if (numbers.isEmpty()) {
			throw new ArgumentException("Provided List should not be empty.");
		}
		int largest = Integer.MIN_VALUE;
		for (int number : numbers) {
			if (number > largest) {
				largest = numbers;
			}
		}
		return largest;
		
		
	}//end of main()

	
}//end of class FinalExam2
