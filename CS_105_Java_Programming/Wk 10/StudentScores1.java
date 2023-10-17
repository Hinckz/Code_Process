package week10;

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentScores1 {
	
	public static void main(String[] args) {
        File file = new File("Student Assignment Scores.csv");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

