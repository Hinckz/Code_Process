package week13;

import java.io.*;
// import java.util.ArrayList;
import java.util.List;
// import java.util.Scanner;

public class PasswordScanner {
	
	private static final String FILE_NAME = "pwd.txt";
    private static final String VALID_FILE_NAME = "validpwd.txt";
    private static final String INVALID_FILE_NAME = "invalidpwd.txt";

    public static void main(String[] args) {
        // Check if the pwd.txt file exists
        File inputFile = new File(FILE_NAME);
        if (!inputFile.exists()) {
            System.out.println("Error: pwd.txt file not found.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter validWriter = new BufferedWriter(new FileWriter(VALID_FILE_NAME));
             BufferedWriter invalidWriter = new BufferedWriter(new FileWriter(INVALID_FILE_NAME))) {

            String password;
            while ((password = reader.readLine()) != null) {
                if (isValidPassword(password)) {
                    validWriter.write(password + "\n");
                } else {
                    invalidWriter.write(password + " - Invalid password\n");
                }
            }

            System.out.println("Password check complete. Please check validpwd.txt and invalidpwd.txt files.");
        } catch (IOException e) {
            System.out.println("An error occurred while processing the files: " + e.getMessage());
        }
    }

    private static boolean hasUpper(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasLower(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasNumber(String password) {
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasSpecial(String text) {
        List<Character> specialCharacters = List.of('@', '#', '%', '-', '&', '*');
        for (char c : text.toCharArray()) {
            if (specialCharacters.contains(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidPassword(String password) {
        return password.length() >= 8 && hasUpper(password) && hasLower(password) &&
                hasNumber(password) && hasSpecial(password);
    }
}
