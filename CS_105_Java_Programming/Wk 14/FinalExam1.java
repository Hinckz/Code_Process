/*
 * Program: Final Exam 1
 * Name:
 * Date: dd/mm/yyyy
 * Description: Strings
 */
 package Final;
 
 import java.util.Scanner;
 
public class FinalExam1 {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Please provide name:");
	        String name = scanner.nextLine();

	        System.out.println("Please provide ward name:");
	        String wardName = scanner.nextLine();

	        System.out.println("Provide approximate number of adult males in the ward:");
	        String malesStr = scanner.nextLine();
	        int males;
	        while (!malesStr.matches("[0-9]+")) {
	            System.out.println("ERROR!!! Please provide valid number(digits) for adult males:");
	            malesStr = scanner.nextLine();
	        }
	        males = Integer.parseInt(malesStr);

	        System.out.println("Provide approximate number of adult females in the ward:");
	        String femalesStr = scanner.nextLine();
	        int females;
	        while (!femalesStr.matches("[0-9]+")) {
	            System.out.println("ERROR!!! Please provide valid number(digits) for adult females:");
	            femalesStr = scanner.nextLine();
	        }
	        females = Integer.parseInt(femalesStr);

	        int totalMembers = males + females;
	        System.out.printf("We have %d adult members in %s's %s ward.\n", totalMembers, name, wardName);
		
		
	}//end of main()
	
	
}//end of class FinalExam1
