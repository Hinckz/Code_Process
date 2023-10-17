package week6;

import java.util.Scanner;

public class ImprovedInterest {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.println("Provide amount to be deposited every month:");
        double monthlyDeposit = scanner.nextDouble();

        System.out.println("Input percentage rate of annual interest:");
        double annualInterestRate = scanner.nextDouble();

        System.out.println("Provide number of months you'll be saving for:");
        int numberOfMonths = scanner.nextInt();

        // Validate the input
        while (monthlyDeposit < 0 || annualInterestRate < 0 || numberOfMonths < 0) {

            System.out.println("Input deposit amount for each month:");
            monthlyDeposit = scanner.nextDouble();

            System.out.println("Input percentage rate of annual interest:");
            annualInterestRate = scanner.nextDouble();

            System.out.println("Provide number of months you'll be saving for:");
            numberOfMonths = scanner.nextInt();
        }
        // Monthly balance calculations
        double monthlyBalance = monthlyDeposit;
        for (int i = 1; i <= numberOfMonths; i++) {
            monthlyBalance += (monthlyBalance * annualInterestRate / 12);
        }
        // Prints monthly balance
        System.out.println("MONTHs BALANCE");
        for (int i = 1; i <= numberOfMonths; i++) {
            System.out.printf("%d: $%.2f\n", i, monthlyBalance);
        }
        // Ask the user if they want to try another calculation
        System.out.println("Do you want to try another calculation? (Yeah/Nope)");
        String answer = scanner.next();

        // Validate the answer
        while (!answer.equals("Yeah") && !answer.equals("Nope")) {
            System.out.println("Please enter a valid answer.");
            System.out.println("Do you want to try another calculation? (Yeah/Nope)");
            answer = scanner.next();
        }
        // If user is interested on repeating, restart the program
        if (answer.equals("Yeah")) {
            main(args);
        }
    }

}
