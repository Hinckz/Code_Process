package week3;

import java.util.Scanner;

public class Area {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//Get input and store as String for square
		System.out.println("SQUARE:");
		System.out.println("Provide width of a square: ");
		String input = in.nextLine();
		int sqwidth = Integer.parseInt(in.nextLine());
		//calculate area
		int sqArea = sqwidth * sqwidth;
		//Output
		System.out.println("Square: ");
		System.out.println("width = " + sqwidth);
		System.out.println("Area = " + sqArea);
		
		
		//Get input and store as string for rectangle
		System.out.println("RECTANGLE: ");
		System.out.println("Provide height of rectangle: ");
		String input2 = in.nextLine();
		int recHeight = Integer.parseInt(input2);
		System.out.println("Height = " + recHeight);
		
		System.out.println("Provide width of a rectangle:");
		String input3 = in.nextLine();
		int recWidth = Integer.parseInt(input3);
		System.out.println("Width = " + recWidth);
		
		int recArea = recWidth * recHeight;
		System.out.println("Area = " + recArea);
	
		
		
	}
}
