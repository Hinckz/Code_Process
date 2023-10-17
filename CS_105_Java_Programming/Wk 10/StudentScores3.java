package week10;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentScores3 {
	
	public static void main(String[] args) {
        File file = new File("Student Assignment Scores.csv");

        try {
            Scanner scanner = new Scanner(file);

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

                String studentName = rowData[0];
                @SuppressWarnings("unused")
				boolean foundZeroScore = false;

                for (int i = 1; i < rowData.length; i++) {
                    int score = Integer.parseInt(rowData[i]);
                    if (score == 0) {
                        foundZeroScore = true;
                        System.out.printf("%-30s%7s%n", studentName, headers[i]);
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
