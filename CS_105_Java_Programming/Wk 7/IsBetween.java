package Week7;

import java.util.Scanner;

public class IsBetween {
	private static Scanner scanner;

	public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("Provide the low number: ");
        int firstDigit = scanner.nextInt();

        System.out.println("Provide the inbtween number to be tested: ");
        int secondDigit = scanner.nextInt();

        System.out.println("Provide the high number: ");
        int thirdDigit = scanner.nextInt();

        if (firstDigit < 0 || firstDigit > 1000) {
            System.out.println("The first given digit should be between '0 and 1000'.");
             main(args);
        }

        if (secondDigit < 0 || secondDigit > 1000) {
            System.out.println("The second given digit should be between '0 and 1000' also.");
            main(args);
        }

        if (thirdDigit < 0 || thirdDigit > 1000) {
            System.out.println("The third given digit should also be between '0 and 1000'.");
            main(args);
        }

        boolean isBetween = isBetween(firstDigit, secondDigit, thirdDigit);

        if (isBetween) {
            System.out.println("The SECOND Number is btwn the FIRST & THIRD Numbers.");
        } else {
            System.out.println("The SECOND Number is NOT btwn the FIRST & THIRD Numbers.");
        }

        System.out.println("Would you like to play again? (Yah/Nah)");
        String answer = scanner.next();
        while (!answer.equals("Yah") && !answer.equals("Nah")) {
            System.out.println("Please provide a valid reply. (Yah/Nah)");
            answer = scanner.next();
        }
        if (answer.equals("Yah")) {
            main(args);
        }
        if (answer.equals("Nah")) {
        	System.out.println("Thanks for playing, hope you had a great time");
        }
    }

    public static boolean isBetween(int firstDigit, int secondDigit, int thirdDigit) {
        return firstDigit < secondDigit && secondDigit < thirdDigit;
    }

}
