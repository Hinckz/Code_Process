package week10;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentScores2 {
	
	public static void main(String[] args) {
        File file = new File("Student Assignment Scores.csv");

        try {
            Scanner scanner = new Scanner (file);
            
            String headerRow = scanner.nextLine();
            String[] headers = headerRow.split(",");
            
            System.out.printf("%-30s", headers[0]);
            for (int i = 1; i < headers.length; i++) {
            	System.out.printf("%7s", headers[i]);
            }
            System.out.println();
            for (int i = 0; i < 37; i++) {
            	System.out.print("-");
            }
            System.out.println();
            
            while (scanner.hasNext()) {
                String dataRow = scanner.nextLine();
                String[] rowData = dataRow.split(",");
                
                System.out.printf("%-30s", rowData[0]);
                for (int i = 1; i < rowData.length; i++) {
                	System.out.printf("%7s", Integer.parseInt(rowData[i]));
                }
                System.out.println();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
