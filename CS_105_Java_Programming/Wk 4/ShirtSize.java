package week4;
import java.util.Scanner;

public class ShirtSize {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		//using input variable for shirt size determining
		System.out.println("Please input client chest measurement (in inches): ");
		String input = in.nextLine();
		int chestSize = Integer.parseInt(input);
		if (chestSize < 38) {
			System.out.println("Shirt size: S");
		} else if (chestSize >= 38 && chestSize < 40) {
			System.out.println("Shirt size: M");
		} else if (chestSize >= 40 && chestSize < 43) {
			System.out.println("Shirt size: L");
		} else if (chestSize >= 43 && chestSize < 46) {
			System.out.println("Shirt size: XL");
		} else {
			System.out.println("Shirt size: XXL");
		}
	}

}
