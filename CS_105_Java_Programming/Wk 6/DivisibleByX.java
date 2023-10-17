package week6;

import java.util.Scanner;

public class DivisibleByX {

  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);

	   /* Get input from the user */
	   System.out.println("Please enter first number to begin with:");
	   int firstNumber = scanner.nextInt();

	   System.out.println("Input second number:");
	   int secondNumber = scanner.nextInt();

	   System.out.println("Input third number:");
	   int thirdNumber = scanner.nextInt();

	    /* Validate the input */
	    while (firstNumber < 0 || secondNumber < 0 || thirdNumber < 0) {
	    System.out.println("Please input a positive integer.");

        System.out.println("Input first number:");
	    firstNumber = scanner.nextInt();

	    System.out.println("Input second number:");
	    secondNumber = scanner.nextInt();

	    System.out.println("Input third number:");
	    thirdNumber = scanner.nextInt();
	    }
	    /* Print the numbers divisible by the third number */
	    for (int i = firstNumber; i <= secondNumber; i++) {
	         if (i % thirdNumber == 0) {
	         System.out.println(i);
	         }
	    }
	    /* Ask the user if they want to play again */
	    System.out.println("Would you like to play again? (Yay/Nay)");
	    String answer = scanner.next();

	     /* Response validation */
	     while (!answer.equals("Yay") && !answer.equals("Nay")) {
	     System.out.println("Please provida a valid response.");
	     System.out.println("Would you like to play again? (Yay/Nay)");
	     answer = scanner.next();
	     }
	     /* If player is interested, program restart's */
	     if (answer.equals("Yay")) {
          main(args);
	     }
	  }
 }

