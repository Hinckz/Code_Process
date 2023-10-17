package week4;
import java.util.Scanner;

public class BMI {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		        System.out.println("Program calculates individual Body Mass Index (BMI) ");
		        System.out.println("Based measurement in height and weight.");

		        // This prompt the user for height in inches and weight in pounds
		        Scanner in = new Scanner(System.in);
		        System.out.print("Please enter height in inches: ");
		        double heightInInches = in.nextDouble();

		        System.out.print("Please enter weight in pounds: ");
		        double weightInPounds = in.nextDouble();

		        // This convert height to meters and weight to kilograms
		        double heightInMeters = heightInInches * 0.0254;
		        double weightInKilograms = weightInPounds / 2.2046;

		        // This calculate the BMI
		        double bmi = weightInKilograms / Math.pow(heightInMeters, 2);

		        // This output the BMI and its interpretation
		        System.out.printf("BMI is %.2f. ", bmi);

		        if (bmi < 18.5) {
		            System.out.println("Underweight.");
		        } else if (bmi < 25) {
		            System.out.println("Normal weight.");
		        } else if (bmi < 30) {
		            System.out.println("Overweight.");
		        } else {
		            System.out.println("Obese.");
		        }
		    }
		}